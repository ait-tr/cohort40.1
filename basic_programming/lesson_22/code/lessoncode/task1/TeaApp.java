package lesson_22.code.lessoncode.task1;

public class TeaApp {
    public static void main(String[] args) {

        TeaTypes teaTypes = new TeaTypes();

        TeaProducer teaProducer1 = new TeaProducer("Lipton");
        TeaProducer teaProducer2 = new TeaProducer("Apsara");
        TeaProducer teaProducer3 = new TeaProducer("GreenField");
        TeaProducer teaProducer4 = new TeaProducer("Askold");


        Tea tea1 = new Tea(1,teaProducer1,"Limon", teaTypes,0);
        Tea tea2 = new Tea(2,teaProducer1,"Apple", teaTypes,1);
        Tea tea3 = new Tea(3,teaProducer2,"Melon", teaTypes,2);
        Tea tea4 = new Tea(4,teaProducer3,"Black Earl Grey", teaTypes,0);
        Tea tea5 = new Tea(5,teaProducer4,"Herbal", teaTypes,2);
        Tea tea6 = new Tea(6,teaProducer2,"Green + Mint", teaTypes,1);
        Tea tea7 = new Tea(7,teaProducer4,"Japan Cherry", teaTypes,3);
        Tea tea8 = new Tea(8,teaProducer1,"Carkade", teaTypes,3);

        Tea teaAdd = new Tea(9,teaProducer3,"English breakfast", teaTypes,0);


        TeaCollection teaCollection = new TeaCollection(10);

        teaCollection.add(tea1);
        teaCollection.add(tea2);
        teaCollection.add(tea3);
        teaCollection.add(tea4);
        teaCollection.add(tea5);
        teaCollection.add(tea6);
        teaCollection.add(tea7);
        teaCollection.add(tea8);


        teaCollection.printCollection();

        teaCollection.delete(tea5);

        teaCollection.add(teaAdd);
        teaCollection.printCollection();

        System.out.println(teaCollection.findById(9));
        System.out.println(teaCollection.findByName("Melon"));

    }
}
