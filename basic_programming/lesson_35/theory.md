# Lesson 34

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

