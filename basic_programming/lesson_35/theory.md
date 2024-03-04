# Lesson 34


### Модификатор `final`

В Java, модификатор `final` можно использовать с переменными, методами и классами, и каждое из этих применений имеет свои особенности.

1. **Final переменные**: Когда переменная объявлена как `final`, ее значение нельзя изменить после инициализации. Это означает, что константная переменная должна быть инициализирована при объявлении или в конструкторе (в случае с полями класса). Это полезно, когда нужно сохранить неизменяемость данных и предотвратить их изменение.

   Пример для локальной переменной:
   ```java
   final int LIMIT = 5;
   // LIMIT = 10; // Это вызовет ошибку компиляции, так как значение final переменной нельзя изменить.
   ```

   Пример для поля класса:
   ```java
   public class MyClass {
       final int LIMIT;

       public MyClass() {
           LIMIT = 10; // Инициализация в конструкторе
       }
   }
   ```

2. **Final методы**: Метод, объявленный как `final`, не может быть переопределен в подклассах. Это полезно, когда вы хотите запретить изменение поведения метода в наследуемых классах.

   Пример:
   ```java
   class Base {
       final void show() {
           System.out.println("Этот метод не может быть переопределен");
       }
   }

   class Derived extends Base {
       // void show() { // Это вызовет ошибку компиляции
       //     System.out.println("Попытка переопределить final метод");
       // }
   }
   ```

3. **Final классы**: Класс, объявленный как `final`, не может быть наследован. Это полезно, когда вы хотите запретить создание подклассов для вашего класса, обеспечивая тем самым, что ваш класс останется неизменным и не будет расширен.

   Пример:
   ```java
   final class Base {
       void show() {
           System.out.println("Этот класс не может быть наследован");
       }
   }

   // class Derived extends Base { // Это вызовет ошибку компиляции
   //     ...
   // }
   ```

Использование `final` может повысить безопасность и предсказуемость кода, а также дать компилятору дополнительную информацию, которая может быть использована для оптимизации.

### Класс `Optional`

`Optional` в Java – это контейнерный класс, используемый для обработки ситуаций, когда значение может отсутствовать. Этот класс был введен в Java 8 и находится в пакете `java.util`. `Optional` помогает избежать `NullPointerException` и является более читаемым и удобным способом обработки значений, которые могут быть `null`.

### Основные методы класса `Optional`:

- `Optional.empty()`: возвращает пустой `Optional` объект.
- `Optional.of(value)`: возвращает `Optional` с не `null` значением.

- `Optional.ofNullable(value)`: возвращает `Optional`, который может содержать `null` значение.

- `isPresent()`: возвращает `true`, если значение присутствует.
- `get()` : используется для получения значения, содержащегося в объекте Optional, но его следует использовать с осторожностью, так как он бросает исключение

### Примеры использования `Optional`:

**1. Создание `Optional` объектов:**

```java
Optional<String> optionalEmpty = Optional.empty();
Optional<String> optionalOf = Optional.of("Hello");
Optional<String> optionalNullable = Optional.ofNullable(null);
```

**2. Проверка наличия значения:**

```java
if (optionalOf.isPresent()) {
    System.out.println("Значение присутствует");
} else {
    System.out.println("Значение отсутствует");
}
```

**3. Использование `ifPresent`:**

```java
optionalOf.ifPresent(name -> System.out.println("Значение: " + name));
```

**4. Использование `orElse` и `orElseGet`:**

```java
String nullName = null;
String name = Optional.ofNullable(nullName).orElse("default name");
System.out.println(name);

name = Optional.ofNullable(nullName).orElseGet(() -> "generated name");
System.out.println(name);
```

**5. Использование `orElseThrow`:**

```java
String result = Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);
```

В этом примере, если `nullName` окажется `null`, будет выброшено исключение `IllegalArgumentException`.

Использование `Optional` улучшает читаемость кода и помогает избежать ошибок, связанных с обработкой `null` значений. Однако стоит избегать использования `Optional` для полей классов или в параметрах методов, так как это может увеличить сложность и не всегда является лучшей практикой.

