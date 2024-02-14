package lesson_22.code.lessoncode.task1Var2;

import lesson_22.code.lessoncode.task1.TeaTypes;

public class TeaApp {
    public static void main(String[] args) {


        TeaProducer teaProducer1 = new TeaProducer("Lipton");
        TeaProducer teaProducer2 = new TeaProducer("Apsara");
        TeaProducer teaProducer3 = new TeaProducer("GreenField");
        TeaProducer teaProducer4 = new TeaProducer("Askold");


        BlackTea tea1 = new BlackTea(1,teaProducer1,"Limon");
        GreenTea tea2 = new GreenTea(2,teaProducer1,"Apple");
        HerbalTea tea3 = new HerbalTea(3,teaProducer2,"Melon");
        BlackTea tea4 = new BlackTea(4,teaProducer3,"Black Earl Grey");
        HerbalTea tea5 = new HerbalTea(5,teaProducer4,"Herbal");
        GreenTea tea6 = new GreenTea(6,teaProducer2,"Green + Mint");
        GreenTea tea7 = new GreenTea(7,teaProducer4,"Japan Cherry");
        HerbalTea tea8 = new HerbalTea(8,teaProducer1,"Carkade");

        BlackTea teaAdd = new BlackTea(9,teaProducer3,"English breakfast");


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
