package consultation.cons_08.consultationCode.code;

public class App {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(10);
        Electronics electronicGood1 = new Electronics(1,"12345","iPhone 15","Apple");
        Electronics electronicGood2 = new Electronics(2,"w56245623","Samsung","Samsung");
        Electronics electronicGood3 = new Electronics(3,"24t234dfg34","Xiaomi","Xiaomi");

        AutoDetails autoDetailGood1 = new AutoDetails(4,"dfzbdzbrt3","TOYOTA details", "Toyota");
        AutoDetails autoDetailGood2 = new AutoDetails(5,"53245y4w5eyh","FORD details", "Ford");
        AutoDetails autoDetailGood3 = new AutoDetails(6,"7584845u","Volvo details", "Volvo");

        Clothing clothingGood1 = new Clothing(7,"23t346t6","Max Mara clothes", "MaxMara");
        Clothing clothingGood2 = new Clothing(8,"75985ei83","Briony clothes", "Briony");
        Clothing clothingGood3 = new Clothing(9,"34634574","Hugo Boss clothes", "Hugo Boss");
        Clothing clothingGood4 = new Clothing(10,"79065837","Minima clothes", "Minima");


        warehouse.add(electronicGood1);
        warehouse.add(electronicGood2);
        warehouse.add(electronicGood3);

        warehouse.add(autoDetailGood1);
        warehouse.add(autoDetailGood2);
        warehouse.add(autoDetailGood3);

        warehouse.add(clothingGood1);
        warehouse.add(clothingGood2);
        warehouse.add(clothingGood3);
        warehouse.add(clothingGood4);

        warehouse.showAllGoods();

        System.out.println(warehouse.findById(4));

    }
}
