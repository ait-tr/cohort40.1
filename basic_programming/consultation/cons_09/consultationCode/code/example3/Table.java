package consultation.cons_09.consultationCode.code.example3;

public class Table extends Furniture implements FoldOut{

    Integer numberOfLegs;

    String material;

    boolean isRound;

    public Table(String manufacture, String type, String catalogNumber, Integer numberOfLegs, String material, boolean isRound) {
        super(manufacture, type, catalogNumber);
        this.numberOfLegs = numberOfLegs;
        this.material = material;
        this.isRound = isRound;
    }


    @Override
    public void foldOut() {
        System.out.println("Стол складной");
    }
}
