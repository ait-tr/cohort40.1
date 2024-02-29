package lesson_33.code.lessoncode.tree.treeExample;

/*
BinaryTree
 */


public class Example1 {
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        bt.insert(7, "node 7");
        bt.insert(3, "node 3");
        bt.insert(9, "node 9");
        bt.insert(5, "node 5");
        bt.insert(1, "node 1");
        bt.insert(2, "node 2");
        bt.insert(4, "node 4");
        bt.insert(6, "node 6");
        bt.insert(8, "node 8");
        bt.insert(10, "node 10");

        bt.print();

    }
}

