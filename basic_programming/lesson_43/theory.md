# Lesson 43

### `BufferedReader` и `BufferedWriter`

`BufferedReader` и `BufferedWriter` в Java являются частью библиотеки потоков символов, обеспечивающих буферизацию ввода и вывода. 
Буферизация увеличивает эффективность чтения и записи данных, позволяя обрабатывать данные большими блоками вместо отдельных символов или массивов символов.

### BufferedReader

`BufferedReader` оборачивает другие `Reader` объекты, например, `FileReader`, добавляя буферизацию к процессу чтения. 
Чтение из буфера гораздо быстрее, чем чтение из файла или сетевого потока напрямую, поскольку количество операций ввода/вывода с физическим устройством уменьшается.

**Основные методы `BufferedReader`:**

- `read()`: Читает один символ.
- `read(char[] cbuf, int off, int len)`: Читает символы в массив.
- `readLine()`: Читает строку текста. Возвращается строка содержимого или `null`, если достигнут конец потока.

**Пример использования `BufferedReader`:**

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### BufferedWriter

`BufferedWriter` оборачивает `Writer` объекты, например, `FileWriter`, добавляя буферизацию к процессу записи. Это увеличивает производительность, позволяя записывать данные блоками в буфер, а не отправлять каждый символ на физическое устройство по отдельности.

**Основные методы `BufferedWriter`:**

- `write(int c)`: Записывает один символ.
- `write(char[] cbuf, int off, int len)`: Записывает массив символов.
- `write(String s, int off, int len)`: Записывает часть строки.
- `newLine()`: Записывает системно-зависимый разделитель строк.

**Пример использования `BufferedWriter`:**

```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"))) {
            bw.write("Hello, Java!");
            bw.newLine();
            bw.write("BufferedWriter makes writing efficient.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

Использование `BufferedReader` и `BufferedWriter` в Java является стандартной практикой для повышения производительности чтения и записи текстовых данных, особенно при работе с большими файлами или частыми операциями ввода/вывода.

### JUnit

JUnit 5 — это современная библиотека для модульного тестирования, которая представляет собой совершенно новую эволюцию в серии JUnit. Она включает в себя несколько различных модулей, таких как JUnit Platform, JUnit Jupiter и JUnit Vintage, предоставляя более гибкие и мощные средства для написания тестов.

### JUnit Jupiter

JUnit Jupiter — это часть JUnit 5, отвечающая за написание тестов и их запуск. Вот некоторые ключевые аннотации и функции, используемые в JUnit Jupiter:

- `@Test`: указывает, что метод является тестовым.
- `@BeforeEach` / `@AfterEach`: обозначают методы, которые должны выполняться до или после каждого теста соответственно.
- `@BeforeAll` / `@AfterAll`: обозначают методы, которые выполняются один раз до начала всех тестов и после их завершения соответственно.
- `@Disabled`: позволяет временно отключить тест.
- `@DisplayName`: задаёт читаемое имя для теста или группы тестов.
- `@Nested`: позволяет организовать тесты во вложенные классы для лучшей структуризации.

### Пример теста

Давайте рассмотрим простой пример класса и соответствующих ему тестов:

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

import org.junit.jupiter.api.*;

class CalculatorTests {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Проверка сложения двух чисел")
    void testAdd() {
        Assertions.assertEquals(5, calculator.add(2, 3), "2 + 3 должно быть 5");
    }

    @Test
    @Disabled("Демонстрация @Disabled")
    void testDisabled() {
        // этот тест не будет выполнен
    }
}
```

В этом примере `CalculatorTests` содержит два тестовых метода: `testAdd()` и `testDisabled()`. `testAdd()` проверяет, что метод `add()` класса `Calculator` работает правильно. Второй метод, `testDisabled()`, не будет запущен из-за аннотации `@Disabled`.

### JUnit Platform

JUnit Platform служит основой для запуска тестовых фреймворков на JVM. Она используется инструментами и плагинами для запуска тестов и отчетности.

### JUnit Vintage

JUnit Vintage обеспечивает поддержку тестов, написанных с использованием JUnit 3 и JUnit 4, в JUnit 5.



### Утверждения (assertions)


В JUnit 5 основные методы для утверждения (assertions) содержатся в классе `Assertions`, который предоставляет статические методы для проверки условий в тестах. Утверждения — это ключевая часть в тестировании, позволяющая проверить, соответствует ли фактическое поведение программы ожидаемому. Вот некоторые из основных методов утверждений:

### `assertEquals(expected, actual, message)`

Проверяет, что два значения равны. Если они не равны, тест будет неудачным.

```java
assertEquals(4, calculator.add(2, 2), "Добавление 2 и 2 должно равняться 4");
```

### `assertNotEquals(expected, actual, message)`

Проверяет, что два значения не равны. Если они равны, тест будет неудачным.

```java
assertNotEquals(5, calculator.add(2, 2), "Добавление 2 и 2 не должно равняться 5");
```

### `assertTrue(condition, message)`

Проверяет, что условие истинно. Если оно ложно, тест будет неудачным.

```java
assertTrue(result > 0, "Результат должен быть положительным");
```

### `assertFalse(condition, message)`

Проверяет, что условие ложно. Если оно истинно, тест будет неудачным.

```java
assertFalse(result < 0, "Результат не должен быть отрицательным");
```

### `assertNull(value, message)`

Проверяет, что объект равен `null`. Если он не `null`, тест будет неудачным.

```java
assertNull(error, "Ошибка должна быть null");
```

### `assertNotNull(value, message)`

Проверяет, что объект не равен `null`. Если он `null`, тест будет неудачным.

```java
assertNotNull(result, "Результат не должен быть null");
```

### `assertSame(expected, actual, message)` и `assertNotSame(expected, actual, message)`

`assertSame` проверяет, что два объекта ссылаются на один и тот же объект, используя `==` для сравнения, в то время как `assertNotSame` проверяет, что два объекта не ссылаются на один и тот же объект.

```java
assertSame(expectedInstance, actualInstance, "Должны быть тем же самым объектом");
assertNotSame(expectedInstance, new Instance(), "Не должны быть тем же самым объектом");
```

### `assertThrows(expectedType, executable, message)`

Проверяет, что выполнение `executable` выбросит исключение, которое можно привести к `expectedType`.

```java
assertThrows(NullPointerException.class, () -> {
    throw new NullPointerException();
}, "Должно быть выброшено NullPointerException");
```

Эти методы являются фундаментальными инструментами для создания эффективных и выразительных тестовых случаев в JUnit 5, позволяя разработчикам проверять различные аспекты логики и поведения их кода.