package lesson_22.code.lessoncode.task1Var2;

public class BlackTea extends Tea{

    public BlackTea(int teaId, TeaProducer teaProducer, String teaName) {
        super(teaId, teaProducer, teaName, "Black");
    }

    public void temp(){
        System.out.println("Температура заваривания 90 градусов");
    }

}
