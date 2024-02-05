package consultation.cons_05.consultationCode.code.tea;

public class TeaDemo {
    public static void main(String[] args) {

        TeaSimple teaSimple1 = new TeaSimple("Tea1", "green","Lipton");
        TeaSimple teaSimple2 = new TeaSimple("Tea2", "GREEN","LIPTON");


        TypeOfTea typeOfTea = new TypeOfTea("Green");
        ProducerOfTea producerOfTea = new ProducerOfTea("Lipton", "good tea");

        TeaBrand teaBrand1 = new TeaBrand("Tea1", typeOfTea,producerOfTea);
        TeaBrand teaBrand2 = new TeaBrand("Tea2", typeOfTea,producerOfTea);




    }
}
