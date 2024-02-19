package consultation.cons_09.consultationCode.code.example3;

public class Chair extends Furniture{

    Integer numberOfLegs;

    boolean isSoft;

    public Chair(String manufacture, String type, String catalogNumber, Integer numberOfLegs, boolean isSoft) {
        super(manufacture, type, catalogNumber);
        this.numberOfLegs = numberOfLegs;
        this.isSoft = isSoft;
    }

}
