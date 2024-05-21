## Update

- `updateOne()` изменить один документ
- `updateMany()` изменить несколько документов
    - аргументы
        - `filter`
        - `action`

## Delete

- `deleteOne()` удалить один документ
- `deleteMany()` удалить несколько документов
    - аргументы
        - `filter`


Метод countDocuments()
- возвращает ко-во совпадений (целое число)
- аргументы
  - filter
Пример. Вывести общее ко-во юзеров

db.users.countDocuments({})
Пример. Вывести ко-во юзеров из USA

db.users.countDocuments(
    { country: 'USA' }
)

## MongoDB Aggregation Framework

- позволяет получить вычисленные данные
- инструмент для анализа, обработки данных
- реализуется методом `aggregate()`
- представляет конвеер (`pipeline`), который содержит определенные этапы обработки (`stages`)


## Метод `aggregate()`

- аргументы
    - (1) массив этапов обработки (`pipeline`, конвеер)

**Пример. Вывести всех юзеров**

```jsx
db.users.aggregate()
```

## Основные стадии (этапы, stages) обработки - операторы

- `$match` фильтрация
- `$sort` сортировка
    - `-1` по убыванию
    - `1` по возрастанию
- `$limit` лимитирование
- `$skip` пропустить (документы)
- `$group` группировка
- `$lookup` объединение коллекций
- `$sample` получить произвольные документы
- `$count` возвращает ко-во документов


## Lookup - $lookup
```jsx
// добавили Пост (для примера захардкодили id)
db.posts.insertOne({
  _id: ObjectId("65c6096e0451b42a2273e13c"),
  likes: 10,
  text: "Hi, I am glad to be on likedin",
});

// добавили комментарий к этому посту
db.comments.insertOne([
  {
    email: "fish@mail.com",
    message: "Oh, you are here! Wonderful!",
    post_id: ObjectId("65c6096e0451b42a2273e13c"),
  },
  {
    email: "eidelman@mail.com",
    message: "Hey, man!",
    post_id: ObjectId("65c6096e0451b42a2273e13c"),
  },
  {
    email: "eidelman@mail.com",
    message: "P.S. love you so!",
    post_id: ObjectId("65c6096e0451b42a2273e13c"),
  },
]);

// получили комментарии с информацией про посты
db.comments.aggregate([
  {$lookup: {
    from: "posts", // куда будем подсматривать - коллекция
    localField: "post_id", // как называется в колл. комменте
    foreignField: "_id",   // как называется в колл. посте
    as: 'post_info'
  }}
]);
```


## Группировка / оператор `$group`

- получает на входе документы
- объединяет их в группы по заданному **полю (или полям)** группуровки
- на выходе - один документ равен одному уникальному значению **поля группировки**

**Базовые операторы группировки (аккумуляторы)**

- `$sum` - сумма
- `$avg` - среднее
- `$min` - минимальное значение
- `$max` - максимальное значение
- `$count` - количество

**Пример**

```jsx
db.kids.insertMany([
  {name: "John", age: 5, gender: "boy"},
  {name: "Anna", age: 6, gender: "girl"},
  {name: "Leyla", age: 4, gender: "girl"},
  {name: "Frieda", age: 3, gender: "boy"},
  {name: "Bob", age: 5, gender: "boy"},
]);
```
**Вывести средний возраст детей по полу**
```jsx
// средний возраст по полу
db.kids.aggregate([
  {$group: {_id: "$gender", averageAge: {$avg: "$age"}}}
]);
```

**Вывести минимальный возраст по полу**
```jsx
// средний возраст по полу
db.kids.aggregate([
  {$group: {_id: "$gender", minAge: {$min: "$age"}}}
]);
```

**Вывести максимальный возраст**
```jsx
// средний возраст по полу
db.kids.aggregate([
  {$group: {_id: "$gender", maxAge: {$max: "$age"}}}
]);
```


