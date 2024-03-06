package lesson_37.code.pecs;


public class BoxDemo {
    public static void main(String[] args) {
        Box<Paper> boxForPaper = new Box<>();
        Box<Plastic> boxForPlastic = new Box<>();
        Box<Glass> boxForGlass = new Box<>();


        Paper paperType1 = new Paper();
        Plastic plasticType1 = new Plastic();
        Glass glassType1 = new Glass();


        boxForPaper.setItem(paperType1);


        boxForPlastic.setItem(plasticType1);
        boxForGlass.setItem(glassType1);


        //-------------------

        System.out.println(boxForPaper);

        Carton carton = new Carton();

        GarbageUtils utils = new GarbageUtils();

        utils.addGarbageToBox(boxForPaper, carton);


        System.out.println(boxForPaper);

        Glass garbageType1 = new Glass();

        utils.addGarbageToBox( boxForGlass, garbageType1);

        Box<Garbage> boxForAll = new Box<>();

        utils.addGarbageToBox(boxForAll,garbageType1);
        utils.addGarbageToBox(boxForAll,paperType1);
        utils.addGarbageToBox(boxForAll,plasticType1);




    }
}
