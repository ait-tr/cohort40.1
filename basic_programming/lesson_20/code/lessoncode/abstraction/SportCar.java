package lesson_20.code.lessoncode.abstraction;

public class SportCar extends Car{
    public SportCar(String model) {
        super(model);
    }

    @Override
    void beep() {
        System.out.println("МЕТОД КОТОРЫЙ Я ПОЛУЧИЛ ОТ РОДИТЕЛЕЙ И ЧУТЬ НЕ ЗАБЫЛ ПЕРЕОПРЕДЕЛИТЬ!");
    }


    @Override
    int speedUp() {
        System.out.println("наш спорткар ускоряется до 260");
        return 260;
    }
}
