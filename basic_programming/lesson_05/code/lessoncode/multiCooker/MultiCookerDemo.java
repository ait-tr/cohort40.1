package lesson_05.code.lessoncode.multiCooker;

public class MultiCookerDemo {
    public static void main(String[] args) {
        MultiCooker mc1 = new MultiCooker("Tefal", "superModel", 800, 20);

        System.out.println(mc1);


        mc1.programNumbers = 3;

        mc1.currentProgramNumber = 1;
        mc1.nameProgram = "Тушение";
        mc1.dish = "Кролик";
        mc1.timeForProgram = 40;


        System.out.println(mc1);

        mc1.currentProgramNumber = 2;
        mc1.nameProgram = "жарка";
        System.out.println(mc1);

        // --- если теперь мы будем использовать наши новые методы ---
        System.out.println("==================== Используем методы =============");

        mc1.changeProgram(1,"Тушение");
        mc1.changeDish("Капуста");

        mc1.changeProgram(3,"Выпекание");
        mc1.changeDish("Тесто для шарлотки");

        mc1.changeProgram(2, " Жарка");
        mc1.changeDish("Куриные ножки");

    }
}
