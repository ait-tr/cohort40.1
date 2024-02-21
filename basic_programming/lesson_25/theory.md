# Lesson 25

В Java, `enum` (или перечисление) используется для определения коллекции именованных констант. 
Эти константы могут быть примитивными значениями или комплексными объектами. Использование `enum` 
в Java помогает сделать код более читаемым и безопасным, поскольку оно ограничивает возможные значения 
переменной до предопределённого набора.

### Основы использования `enum` в Java

Перечисления объявляются с использованием ключевого слова `enum`, за которым следует имя перечисления. 
Вот простой пример `enum`, который представляет дни недели:

```java
public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
```

### Пример использования `enum`

```java
public class TestEnum {
    Day day;

    public TestEnum(Day day) {
        this.day = day;
    }

    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    public static void main(String[] args) {
        TestEnum firstDay = new TestEnum(Day.MONDAY);
        firstDay.tellItLikeItIs();
        TestEnum thirdDay = new TestEnum(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        TestEnum fifthDay = new TestEnum(Day.FRIDAY);
        fifthDay.tellItLikeItIs();
        TestEnum sixthDay = new TestEnum(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
        TestEnum seventhDay = new TestEnum(Day.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}
```

В этом примере `enum Day` используется для управления поведением 
метода `tellItLikeItIs` на основе дня недели. Это демонстрирует, как `enum` 
может быть использован в `switch`-выражениях.

### Продвинутое использование `enum`

`enum` в Java может иметь поля, методы и конструкторы, как показано ниже:

```java
public enum Season {
    WINTER("Cold"), SPRING("Warm"), SUMMER("Hot"), FALL("Cool");

    private final String description;

    private Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}

public class TestSeason {
    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season + " is " + season.getDescription() + ".");
        }
    }
}
```

В этом примере `Season` - это `enum`, который не только содержит перечисление времён года, 
но и связанное с каждым из них описание. Каждый элемент `enum` может иметь свои уникальные 
поля и методы, что делает `enum` в Java очень мощным инструментом для создания высокоуровневых абстракций.

### Заключение

Использование `enum` в Java предоставляет мощный механизм для определения групп фиксированных 
констант, что может улучшить читаемость кода, обеспечить безопасность типов и упростить 
реализацию определённых конструкций программирования, таких как свитчи или конечные автоматы. 
Благодаря возможности добавления полей, методов и конструкторов, `enum` предлагает гибкость 
в определении сложных типов данных.


В Java, ключевые слова `static` и `final` играют важную роль в управлении доступом к переменным 
и методам, а также их поведением в приложении. 

### Static

Ключевое слово `static` используется для указания, что определенное поле или метод принадлежит классу, 
а не экземпляру класса. Это означает, что `static` переменная или метод может быть доступен без создания объекта класса.

#### Примеры использования `static`:

- **Static переменная:** Общая переменная для всех объектов класса, часто используемая для счетчика объектов класса.
```java
class ClassName {
    static int counter = 0; // Статическая переменная

    ClassName() {
        counter++;
    }
}
```

- **Static метод:** Метод, который может быть вызван без создания объекта класса. Часто используется для утилитных или вспомогательных методов.
```java
class UtilityClass {
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}
```

- **Static блок:** Блок, используемый для инициализации статических данных. Выполняется один раз при загрузке класса.
```java
class ClassName {
    static {
        // код инициализации
    }
}
```

### Final

Ключевое слово `final` используется для обозначения неизменности — оно может быть применено к переменным, методам и классам.

#### Примеры использования `final`:

- **Final переменная:** Переменная, которую нельзя изменить после ее инициализации. Эквивалент константы.
```java
final int MAX_VALUE = 100;
```

- **Final метод:** Метод, который не может быть переопределен в дочерних классах. Это помогает в сохранении поведения метода при наследовании.
```java
class Superclass {
    final void showSample() {
        System.out.println("One cannot change me.");
    }
}
```

- **Final класс:** Класс, который не может быть расширен (не может иметь подклассов). Это полезно для создания неизменяемых классов.
```java
final class ImmutableClass {
    // Классовые детали
}
```

### Взаимодействие `static` и `final`

- **Static final переменные:** Часто используются для определения констант.
```java
static final double PI = 3.14159;
```
Такие переменные обычно объявляются в классе для обеспечения общего доступа к константам.

### Заключение

`static` и `final` являются мощными инструментами в Java, которые помогают в структурировании программы. 
`static` позволяет связывать поля и методы с классом, а не с его экземплярами, тем самым облегчая доступ к общим ресурсам. 
`final` используется для создания неизменяемых объектов, обеспечения безопасности при наследовании и определения констант. 
Правильное использование этих ключевых слов способствует созданию эффективного и безопасного кода.