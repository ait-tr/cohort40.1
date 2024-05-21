use('crud_db')

// * создает коллекцию со значениями

db.animals.insertMany([
  {kind: 'tiger', weight: 300, name: 'Barsik', predatory: true},
  {kind: 'moose', weight: 350, name: 'Arnold', predatory: false},
  {kind: 'chicken', weight: 5, name: 'Ryaba', predatory: false},
  {kind: 'shark', weight: 100, name: 'Sharp', predatory: true},
  {kind: 'cheetah', weight: 80, name: 'Chester', predatory: true}
])

// * добавляем новое значение

db.animals.insertOne({kind: 'shark', weight: 90, name: 'Jaws', predatory:true})

// ! CRUD операции (Create, Read, Update, Delete)

// ? updateOne(), updateMany()

// * $set, $unset, $inc, $rename, $push, $pull - операторы для изменения

db.animals.updateMany({kind: 'shark'}, {$set: {predatory: true}})

// изменение у все документов в коллекции

db.animals.updateMany({}, {$inc: {weight: -2}})

// * db.animals.find() - если хотите посмотреть все документы в коллекции

// * updateOne() - изменяет первый документ в коллекции, который удовлетворяет условию

// * если вы хотите найти элемент по id, то вы используете метод ObjectId(), в которую передаете строку с идентификатором

db.animals.updateOne({_id: ObjectId('664c568c749319d52b26efb3')},{$set:{weight: 5}})

// * оператор $unset удаляет свойство из документа

db.animals.updateOne({kind: 'moose'},{$unset:{predatory: ''}})

db.animals.updateOne({kind: 'moose'},{$set:{predatory: false}})

db.animals.updateOne({kind: 'cheetah'}, {$push: {foods: 'chitos'}})

// * $pull - удаляет элемент из  массива по указанному ключу

db.animals.updateOne({kind: 'cheetah'}, {$pull: {foods: 'chitos'}})

// * $push добавляет массив с элементами по указанному ключу

db.animals.updateOne({kind: 'cheetah'}, {$push: {foods: 'chips'}})

// * если вы хотите добавить сразу несколько элементов за раз в массиве используйте оператор $each

db.animals.updateOne(
  { kind: 'cheetah' },
  { $push: { foods: { $each: ['squid', 'hinkali'] } } }
);

// * $rename переименовывает имя свойства в документе или нескольких

db.animals.updateMany({}, {$rename: {predatory: "isPredator"}})

// * 1. CREATE: insertOne(), insertMany()
// * 2. READ: findOne(), findMany()
// * 3. UPDATE: updateOne(), updateMany()
// * 4. DELETE: deleteOne(), deleteMany()

// ? deleteOne(), deleteMany()

db.animals.deleteOne({_id: ObjectId('664c588f138aab90fb64a1b1')})

db.animals.deleteOne({name: "Sharp"})

// ? REFERENCES

db.posts.insertOne({
  likes: 10,
  text: 'Hello, nice to see you here!'
})

db.comments.insertMany([
  {email: "123@google.com", message: 'Hi!', post_id: ObjectId("664c724af3a5021dd4e95a5f")},
  {email: "345@google.com", message: 'Ohh! nice to see you', post_id: ObjectId("664c724af3a5021dd4e95a5f")},
  {email: "679@google.com", message: '🙆‍♂️', post_id: ObjectId("664c724af3a5021dd4e95a5f")}
])

// ? aggregate() - метод для связи операций в один pipeline

// * оператор $lookup - аналог join из postgres

// * from - c какой коллекцией объединяем
// * localField - ключ из коллекции, к которой обращаемся
// * foreignField - ключ из связной таблицы
// * as - псевдоним для отображения

db.comments.aggregate({$lookup: {
  from: 'posts',
  localField: "post_id",
  foreignField: "_id",
  as: "info_from_post"
}})

// получим всех хищных и отсортируем по весу

db.animals.aggregate([
  { $match: { isPredator: true } },
  { $sort: { weight: -1 } }
])

// посчитаем кол-во всех не хищников

db.animals.aggregate([
  { $match: { isPredator: false } },
  {$count: "not_predators_numbers"}
 ])

 // * $sample - получение случайного элемента: в size передается кол-во случайных элементов

 db.animals.aggregate([
  {$sample: {size: 2}}
 ])
