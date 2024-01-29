package lesson_06.code.lessoncode.publicAndPrivet.moto;

public class MotoDemo {
    public static void main(String[] args) {

        Moto moto = new Moto("silver", "R1600 GTL", "BMW");

        // System.out.println(moto.model); - так бы мы обращались к полю нашего класса раньше, когда был открыт к нему доступ

        System.out.println(moto.getProducer());
        System.out.println(moto.getModel());
        System.out.println(moto.getColor());
        System.out.println("Перекрасим наш мотоцикл");
        moto.setColor("черно-серый");
        System.out.println(moto.getColor());

        moto.startRoad();

    }
}
