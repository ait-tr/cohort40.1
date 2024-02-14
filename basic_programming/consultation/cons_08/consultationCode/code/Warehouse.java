package consultation.cons_08.consultationCode.code;

public class Warehouse {

    private Good[] goods;
    private int indexNull = -1;
    Validation validation = new Validation();

    public Warehouse(int warehouseSize) {
        this.goods = new Good[warehouseSize];
    }

    public Good[] getGoods() {
        return goods;
    }

    public int getIndexNull() {
        return indexNull;
    }

    public int add(Good newGood){
        if (validation.checkGoodParameters(newGood)) {
        indexNull++;
        goods[indexNull] = newGood;}

        return indexNull;
    }

    public Good findById(int id){
        for (int i = 0; i < goods.length; i++) {
            if (goods[i].getId() == id){
                return goods[i];
            }
        }
        return null;
    }

    public void showAllGoods(){
        for (int i = 0; i < goods.length; i++) {
            Good currentGood = goods[i];
            System.out.println("===================");
            System.out.println("Категория товара: " + currentGood.getGoodCategory());
            System.out.println("Номер по каталогу: " + currentGood.getCatalogNumber());
            System.out.println("Наименование товара : " + currentGood.getGoodName());
        }
    }
}
