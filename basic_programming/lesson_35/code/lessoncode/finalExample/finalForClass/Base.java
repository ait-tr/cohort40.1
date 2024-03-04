package lesson_35.code.lessoncode.finalExample.finalForClass;

public final class Base {

    private String baseInfo;

    public Base(String baseInfo) {
        this.baseInfo = baseInfo;
    }

    void printData(){
        System.out.println("Метод для распечатки данных из final класса");
    }
}
