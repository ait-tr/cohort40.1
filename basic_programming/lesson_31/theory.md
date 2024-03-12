# Lesson 31

Iterator и ListIterator — это интерфейсы в Java, которые предоставляют методы для перебора элементов коллекций. 

### Iterator

Iterator позволяет проходить по элементам любой коллекции. 
Он предоставляет базовые методы для итерации:

- `hasNext()`: возвращает `true`, если в коллекции есть еще элементы для перебора.
- `next()`: возвращает следующий элемент коллекции и перемещает курсор итератора вперед.
- `remove()`: удаляет последний элемент, который был возвращен итератором (необязательный метод).

#### Пример с Iterator:

```java
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println(value);
        }
    }
}
```

В этом примере создается `ArrayList` со строками, после чего мы используем `Iterator` для перебора элементов списка и вывода их на экран.

### ListIterator

ListIterator расширяет функциональность Iterator, добавляя возможности двунаправленной итерации (в обоих направлениях по списку) и модификации списка в процессе итерации. Он доступен только для списков и предоставляет дополнительные методы:

- `hasPrevious()` и `previous()`: для итерации в обратном направлении.
- `nextIndex()` и `previousIndex()`: возвращают индексы следующего и предыдущего элементов.
- `add()`: добавляет элемент в список между элементами, на которые указывают `next` и `previous`.
- `set()`: заменяет последний элемент, возвращенный `next` или `previous`, на указанный элемент.

#### Пример с ListIterator:

```java
import java.util.ListIterator;
import java.util.LinkedList;

public class ListIteratorExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        ListIterator<String> listIterator = list.listIterator();
        
        System.out.println("Прямой проход:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Обратный проход:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
```

В этом примере используется `LinkedList` с `ListIterator` для перебора элементов вперед и назад. Сначала элементы выводятся в прямом порядке, а затем — в обратном.