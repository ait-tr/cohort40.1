# Lesson 21

Интерфейсы в Java являются способом достижения абстракции и множественного наследования. Они представляют собой контракт или набор правил, которым должны следовать классы, реализующие эти интерфейсы. Вот ключевые аспекты интерфейсов в Java:

1. **Определение интерфейса**: Интерфейс объявляется с использованием ключевого слова `interface`. В отличие от классов, интерфейсы не могут быть инстанциированы напрямую. Они могут содержать методы и переменные, но все методы по умолчанию являются абстрактными (то есть без реализации).

2. **Реализация интерфейса**: Класс реализует интерфейс с помощью ключевого слова `implements`. Класс, реализующий интерфейс, должен предоставить реализацию всех абстрактных методов интерфейса.

3. **Методы интерфейса**: До Java 8 все методы в интерфейсе были абстрактными и публичными. С Java 8 и новее, в интерфейсах разрешены статические методы, методы по умолчанию и приватные методы, что позволяет интерфейсам предоставлять реализацию методов.

4. **Переменные в интерфейсе**: Все переменные, объявленные в интерфейсе, автоматически являются `public`, `static` и `final`, то есть они по сути константы.

5. **Множественное наследование**: В Java классы не могут наследовать от нескольких классов (избегая таким образом проблему ромбовидного наследования), но могут реализовывать множество интерфейсов. Это позволяет объектам обладать множественными типами, обеспечивая гибкость в дизайне.

6. **Методы по умолчанию**: Введены в Java 8, методы по умолчанию позволяют вам добавлять новые методы в интерфейсы без нарушения существующих реализаций. Эти методы не являются абстрактными и содержат реализацию.

7. **Функциональные интерфейсы**: Это интерфейсы с одним абстрактным методом. Они используются в лямбда-выражениях и аннотируются как `@FunctionalInterface`.

8. **Приватные методы**: С Java 9 в интерфейсах можно объявлять приватные методы, что позволяет скрыть некоторые детали реализации, которые не должны быть доступны в реализующих классах или других интерфейсах.

Интерфейсы в Java играют важную роль в создании гибких и модульных программ, поощряя хорошие практики программирования, такие как разделение интерфейса и реализации, и облегчая разработку в условиях, когда требуется множественное наследование поведения.


Давайте разберём более подробно интерфейсы в Java на примерах.

### Определение интерфейса

Интерфейс объявляется с использованием ключевого слова `interface`. Интерфейсы могут содержать абстрактные методы (до Java 8 все методы в интерфейсе были абстрактными) и константы.

```java
public interface Vehicle {
    // Константа
    int MAX_SPEED = 120;

    // Абстрактный метод
    void drive();
}
```

### Реализация интерфейса

Класс, реализующий интерфейс, использует ключевое слово `implements`. Класс должен предоставить реализацию всех абстрактных методов интерфейса.

```java
public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Машина едет со скоростью: " + MAX_SPEED);
    }
}
```

### Методы по умолчанию

С Java 8, в интерфейсах появилась возможность определять методы по умолчанию. Эти методы имеют реализацию, и классы могут наследовать или переопределять их.

```java
public interface Vehicle {
    void drive();

    // Метод по умолчанию
    default void turn(String direction) {
        System.out.println("Поворачиваем " + direction);
    }
}
```

### Статические методы

Интерфейсы могут содержать статические методы с реализацией, которые могут быть вызваны без объекта интерфейса.

```java
public interface Vehicle {
    static void horn() {
        System.out.println("Гудок!");
    }
}
```

### Функциональные интерфейсы

Функциональный интерфейс - это интерфейс с одним абстрактным методом. Они используются в лямбда-выражениях и аннотируются как `@FunctionalInterface`.

```java
@FunctionalInterface
public interface Greeting {
    void sayHello(String name);
}
```

Использование:

```java
Greeting greeting = name -> System.out.println("Привет, " + name);
greeting.sayHello("Мир");
```

### Приватные методы

С Java 9, интерфейсы могут содержать приватные методы, которые помогают скрыть детали реализации.

```java
public interface Loggable {
    default void logInfo(String message) {
        log("INFO", message);
    }

    default void logError(String message) {
        log("ERROR", message);
    }

    // Приватный метод в интерфейсе
    private void log(String level, String message) {
        System.out.println(level + ": " + message);
    }
}
```

Эти примеры иллюстрируют ключевые аспекты работы с интерфейсами в Java, показывая их гибкость и мощь в создании абстракций и структурировании кода.
