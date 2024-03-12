# Lesson 40


Stream API в Java представляет собой набор классов и интерфейсов, который был введен в Java 8 для поддержки функционального стиля программирования. Он позволяет разработчикам обрабатывать последовательности данных (например, коллекции) в декларативном стиле, а не императивном, с использованием мощных операций, таких как фильтрация, преобразование, агрегация и другие.

### Принцип работы

Stream API работает на принципе "потока" данных из источника, который проходит через цепочку операций. Сам поток данных не хранит данные, а предоставляет механизмы для выполнения операций с данными источника. Операции с потоками бывают двух видов: промежуточные и терминальные.

- **Промежуточные операции** возвращают новый поток и используются для преобразования или фильтрации данных. Они ленивые, то есть не выполняются, пока не будет вызвана терминальная операция.
- **Терминальные операции** производят некий конечный результат или побочный эффект (например, вывод в консоль) и после их выполнения поток становится недоступным для дальнейших операций.

### Основные методы Stream API

**Промежуточные операции:**

- `filter(Predicate<T>)`: возвращает поток, включающий элементы, соответствующие заданному условию.
- `map(Function<T,R>)`: преобразует элементы потока в элементы другого типа.
- `sorted()`: сортирует элементы потока.
- `distinct()`: возвращает поток с уникальными элементами.
- `limit(long)`: ограничивает количество элементов в потоке заданным числом.
- `skip(long)`: пропускает заданное количество элементов в потоке.

**Терминальные операции:**

- `forEach(Consumer<T>)`: выполняет заданное действие для каждого элемента потока.
- `collect(Collector<T,A,R>)`: преобразует поток в другую форму, например, в список или множество.
- `reduce(BinaryOperator<T>)`: выполняет свертку элементов потока, возвращая один результат.
- `anyMatch(Predicate<T>)`, `allMatch(Predicate<T>)`, `noneMatch(Predicate<T>)`: возвращают булево значение на основе проверки условия для элементов потока.
- `count()`: возвращает количество элементов в потоке.
- `findFirst()`, `findAny()`: возвращают первый или любой элемент потока соответственно.

### Пример использования

```java
List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
List<String> filtered = strings.stream() // Создание потока
    .filter(s -> !s.isEmpty()) // Промежуточная операция: фильтрация
    .collect(Collectors.toList()); // Терминальная операция: сборка в список
System.out.println(filtered); // Вывод отфильтрованного списка
```

В этом примере создается поток из списка строк, затем применяется промежуточная операция фильтрации для исключения пустых строк, и в конце с помощью терминальной операции результат собирается в новый список.


### Метод референс

Метод референс (Method Reference) в Java — это способ ссылаться на метод без его выполнения. Введенный в Java 8, метод референс упрощает запись, когда вы хотите передать ссылку на метод или конструктор в качестве аргумента функционального интерфейса. Это одна из возможностей, которая способствует функциональному программированию в Java, позволяя писать более краткий и читаемый код.

### Виды метод референсов

1. **Ссылка на статический метод** - Используется для ссылки на статический метод класса.
    - Синтаксис: `Класс::статическийМетод`
    - Пример: `String::valueOf` преобразует объект в строку через статический метод `valueOf` класса `String`.

2. **Ссылка на метод экземпляра конкретного объекта** - Используется, когда метод вызывается на конкретном объекте.
    - Синтаксис: `инстанс::методЭкземпляра`
    - Пример: `System.out::println` вызывает метод `println` на конкретном объекте `System.out`.

3. **Ссылка на метод экземпляра произвольного объекта из определенного типа** - Используется для вызова метода на объекте, который является параметром метода.
    - Синтаксис: `Класс::методЭкземпляра`
    - Пример: `String::toLowerCase` вызывает метод `toLowerCase` на объекте типа `String`, который будет передан.

4. **Ссылка на конструктор** - Используется для ссылки на конструктор.
    - Синтаксис: `Класс::new`
    - Пример: `ArrayList::new` создает новый объект `ArrayList` с помощью конструктора.

### Пример использования

Допустим, у нас есть список строк, и мы хотим отсортировать его в лексикографическом порядке без учета регистра. Вместо того чтобы использовать анонимный класс или лямбда-выражение, мы можем использовать метод референс.

```java
List<String> words = Arrays.asList("Apple", "Banana", "Cherry", "Date");

// Использование лямбда-выражения
words.sort((s1, s2) -> s1.compareToIgnoreCase(s2));

// Использование метод референса
words.sort(String::compareToIgnoreCase);
```

Оба варианта кода делают одно и то же, но использование метод референса делает код более лаконичным и легким для чтения.
