package lesson_06.code.lessoncode.publicAndPrivet.moto;

public class Moto {

    private String color;

    private String model;

    private String producer;

    public Moto(String color, String model, String producer) {
        this.color = color;
        this.model = model;
        this.producer = producer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }


    public void startRoad(){
        // 1) включил двигатель
        // 2) включил первую передачу
        // 3) начал движение

//        System.out.println("Завел двигатель");
//        System.out.println("Включил первую передачу");
//        System.out.println("Начал движение");

        startMoto();
        changeGear();
        startMoving();

    }

    // можем разбить отдельные действия на самостоятельные методы которые решают свою персональную задачу


    private void startMoto() {
        System.out.println("Завел двигатель");
    }

    private void changeGear(){
        System.out.println("Включил первую передачу");
    }

    private void startMoving(){
        System.out.println("Начал движение");
    }
}
