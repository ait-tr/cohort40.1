package lesson_20.code.lessoncode.inheritance.fruits;

public class FruitDemo {
    public static void main(String[] args) {
//        Fruit fruit = new Fruit();
//        System.out.println(fruit.getClass());

        Pineapple pineapple = new Pineapple();
        pineapple.setCellulose(200);
        pineapple.setSugar(10);
        pineapple.setVitamins(new String[]{"A","B"});
        System.out.println(pineapple);

        System.out.println("=================");

        Apple apple = new Apple();
        apple.setColor("Red");
        apple.setSugar(15);
        apple.setVitamins(new String[]{"C","D"});
        System.out.println(apple);
    }
}
