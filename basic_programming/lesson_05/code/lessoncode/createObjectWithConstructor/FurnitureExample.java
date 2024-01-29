package lesson_05.code.lessoncode.createObjectWithConstructor;

public class FurnitureExample {
    public static void main(String[] args) {
        Furniture furniture1 = new Furniture("Table");

        //... позже мы можем добавить данные в наши поля (переменные)

        furniture1.material = "Wood";
        furniture1.color = "White";

        System.out.println(furniture1);

        Furniture furniture2 = new Furniture("Table № 2", "Glass and metal");
        furniture2.color = "Silver";

        System.out.println(furniture2);

    }
}
