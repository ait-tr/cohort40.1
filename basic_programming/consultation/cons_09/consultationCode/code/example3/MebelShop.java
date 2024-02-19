package consultation.cons_09.consultationCode.code.example3;

public class MebelShop {
    public static void main(String[] args) {
        Chair chair = new Chair("Paolo Pazolini", "chair", "123=4556=7",4,true);
        Table table = new Table("Table expert", "table", "WX1234567", 6,"wood (oak)", true);
        Sofa sofa = new Sofa("IKEA", "sofa","guterblumen", "polisterol", true);

        Furniture[] furnitures = {table, chair, sofa};

        FoldOut[] foldOuts = {sofa, table};

        for (int i = 0; i < foldOuts.length; i++) {
            foldOuts[i].foldOut();
        }
    }
}
