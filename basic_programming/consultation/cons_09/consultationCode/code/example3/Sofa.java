package consultation.cons_09.consultationCode.code.example3;

public class Sofa extends Furniture implements FoldOut{

    String material;
    boolean isFabric;

    public Sofa(String manufacture, String type, String catalogNumber, String material, boolean isFabric) {
        super(manufacture, type, catalogNumber);
        this.material = material;
        this.isFabric = isFabric;
    }

    @Override
    public void foldOut() {
        System.out.println("Sofa fold out!");
    }
}
