package lesson_33.code.lessoncode.tree.treeExample;

/*
BinaryTree
 */


import java.util.Stack;

class BinaryTree {
    private Node root;

    public Node find(int key) {
        Node current = root;                                // начинаем поиск с корневого узла

        while (current.getKey() != key) {                   // поиск покуда не будет найден элемент или не будут перебраны все
            if (current.getKey() < key)                     // движение влево?
                current = current.getLeft();
            else
                current = current.getRight();               // движение вправо

            if (current == null)                            // если потомка нет
                return null;
        }
        return current;
    }

    public void insert(int key, String value) {
        Node newNode = new Node();                          // создание нового узла
        newNode.setKey(key);
        newNode.setValue(value);

        if (root == null)                                   // если корневой узел не существует
            root = newNode;                                 // то новый элемент и есть корневой узел
        else {                                              // корневой узел занят
            Node current = root;
            Node parent = null;

            while (true) {                                  // мы имеем внутренний выход из цикла

                parent = current;

                if (key == current.getKey())                // если такой элемент в дереве уже есть, не сохраняем его
                    return;                                 // просто выходим из него

                else if (key < current.getKey()) {          // движение влево
                    current = current.getLeft();
                    if (current == null) {                  // если был достигнут конец цепочки
                        parent.setLeft(newNode);            // то вставить слева и выйти из методы
                        return;
                    }
                } else {                                    // или направо?
                    current = current.getRight();
                    if (current == null) {                  // если был достигнут конец цепочки
                        parent.setRight(newNode);           // то вставить справа
                        return;                             // и выйти
                    }
                }
            }
        }
    }

    public void print(Node node) {
        if (node != null) {
            print(node.getLeft());
            node.printNode();
            print(node.getRight());
        }
    }

    public void print() {                                   // метод для вывода дерева в консоль
        Stack<Node> globalStack = new Stack<>();            // общий стек для значений дерева
        globalStack.push(root);

        int gaps = 32;                                      // начальное значение расстояния между элементами
        boolean isRowEmpty = false;

        String separator = "-----------------------------------------------------------------";
        System.out.println(separator);                      // черта для указания начала нового дерева

        while (!isRowEmpty) {
            Stack<Node> localStack = new Stack<>();         // локальный стек для задания потомков элемента
            isRowEmpty = true;

            for (int j = 0; j < gaps; j++)
                System.out.print(' ');

            while (!globalStack.isEmpty()) {                // покуда в общем стеке есть элементы
                Node temp = (Node) globalStack.pop();       // берем следующий, при этом удаляя его из стека
                if (temp != null) {
                    System.out.print(temp.getValue());      // выводим его значение в консоли
                    localStack.push(temp.getLeft());   // сохраняем в локальный стек, наследники текущего элемента
                    localStack.push(temp.getRight());
                    if (temp.getLeft() != null ||
                            temp.getRight() != null)
                        isRowEmpty = false;
                } else {
                    System.out.print("__");                 // - если элемент пустой
                    localStack.push(null);
                    localStack.push(null);
                }

                for (int j = 0; j < gaps * 2 - 2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            gaps /= 2;                                      // при переходе на следующий уровень расстояние между элементами каждый раз уменьшается
            while (!localStack.isEmpty()) {
                globalStack.push(localStack.pop());    // перемещаем все элементы из локального стека в глобальный
            }
        }
        System.out.println(separator);                      // подводим черту
    }

    public Node getRoot() {
        return root;
    }
}

