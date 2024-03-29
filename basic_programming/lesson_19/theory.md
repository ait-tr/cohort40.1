### Lesson 19

### Инкапсуляция в Java

#### Определение Инкапсуляции
Инкапсуляция — это один из четырёх основных принципов объектно-ориентированного программирования (ООП).
В Java, инкапсуляция достигается путём объединения переменных (свойств) и методов (функций),
работающих с этими переменными, в одном классе и ограничения доступа к этим переменным и методам из внешнего кода.

#### Основные Характеристики Инкапсуляции
1. **Сокрытие Деталей Реализации**: Скрытие внутреннего состояния объекта от внешнего мира.
2. Только методы объекта имеют доступ к его внутренним данным.
2. **Объединение Данных и Методов**: Группировка данных (полей) и методов, работающих с этими данными, в одном классе.
3. **Контроль Доступа**: Использование модификаторов доступа, таких как `private`, `public` и `protected`,
4. для контроля доступа к полям и методам класса.

#### Пример Инкапсуляции в Java

Рассмотрим класс `Автомобиль` с инкапсулированными данными и методами:

```java
public class Автомобиль {
    // Приватные поля класса
    private String марка;
    private Двигатель двигатель;
    private int пробег;

    // Конструктор
    public Автомобиль(String марка, Двигатель двигатель) {
        this.марка = марка;
        this.двигатель = двигатель;
        this.пробег = 0;
    }

    // Публичные методы для доступа к данным
    public void увеличитьПробег(int километры) {
        if (километры > 0) {
            this.пробег += километры;
        }
    }

    public int getПробег() {
        return пробег;
    }

    // ... другие методы и свойства
}
```

В этом примере:
- Поля `марка`, `двигатель` и `пробег` являются приватными (`private`), что предотвращает прямой доступ к ним из вне класса.
- Методы `увеличитьПробег` и `getПробег` предоставляют контролируемый доступ к этим полям.
- Например, метод `увеличитьПробег` позволяет изменять значение `пробег` только в допустимых пределах.

#### Почему Инкапсуляция Важна
1. **Безопасность**: Инкапсуляция помогает защитить данные внутри объекта от неправильного использования извне.
2. **Сокрытие Сложности**: Инкапсуляция позволяет скрыть сложную реализацию и предоставить пользователю класса простой интерфейс для работы.
3. **Свобода Модификации**: Разработчики могут свободно изменять внутреннюю реализацию класса, не влияя на те части программы,
4. которые используют этот класс.
4. **Поддержка**: Упрощает отладку и поддержку кода, так как ошибки локализованы внутри класса.

Инкапсуляция в Java — это не только способ сокрытия данных, но и метод организации кода, который делает программу более модульной,
гибкой и легкой в обслуживании. Это ключевой компонент для создания надёжного и масштабируемого программного обеспечения


### Наследование в Объектно-Ориентированном Программировании

#### Определение Наследования
Наследование — это ключевой принцип объектно-ориентированного программирования (ООП),
который позволяет одному классу наследовать (или расширять) свойства и методы другого класса.
Это обеспечивает иерархическую классификацию и помогает избегать дублирования кода.

#### Работа Наследования
В наследовании создаётся два типа классов:
1. **Базовый Класс (Родительский Класс)**: Класс, свойства и методы которого наследуются.
2. **Производный Класс (Дочерний Класс)**: Класс, который наследует свойства и методы базового класса.

#### Пример в Java
Допустим, у нас есть базовый класс `Транспортное Средство` и мы хотим создать производный класс `Автомобиль`.

```java
// Базовый класс
public class ТранспортноеСредство {
    protected String бренд;

    public void двигаться() {
        System.out.println("Транспортное средство двигается");
    }
}

// Производный класс
public class Автомобиль extends ТранспортноеСредство {
    private int количествоДверей;

    public void звукГудка() {
        System.out.println("Бип-бип!");
    }
}
```

В этом примере:
- `Автомобиль` наследует свойства и методы класса `ТранспортноеСредство`.
- `Автомобиль` может использовать метод `двигаться`, определённый в `ТранспортноеСредство`.
- `Автомобиль` добавляет свои уникальные свойства и методы, например, `количествоДверей` и `звукГудка`.

#### Типы Наследования
1. **Одиночное Наследование**: Когда класс наследует только один родительский класс.
2. **Множественное Наследование**: Когда класс наследует более одного родительского класса.
   В Java прямое множественное наследование не поддерживается.

#### Преимущества Наследования
1. **Повторное Использование Кода**: Позволяет использовать код родительского класса, уменьшая дублирование.
2. **Расширяемость**: Упрощает добавление новых функций и модификацию существующих, повышая гибкость кода.
3. **Иерархическая Структура**: Облегчает создание и понимание иерархических классов и отношений между ними.

#### Ограничения и Внимание
- **Переопределение Методов**: Возможность переопределения методов родительского класса в дочернем классе может быть как полезной, так и источником ошибок.
- **Контроль Доступа**: Важно правильно управлять доступом к полям и методам, чтобы предотвратить нежелательный доступ или изменения.
- **Сложность**: Неправильное использование наследования может привести к чрезмерной сложности и затруднить поддержку кода.

#### Заключение
Наследование — мощный инструмент в ООП, который, при правильном использовании, значительно повышает эффективность
и качество программного кода, делая его более читаемым, расширяемым и легким в обслуживании.