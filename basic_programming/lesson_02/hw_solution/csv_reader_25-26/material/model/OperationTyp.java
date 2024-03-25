package de.ait.model;

/**
 * @author Andrej Reutow
 * created on 16.06.2023
 */
public enum OperationTyp {
    EXTERN(1),
    KZUK(2),
    SEPA(3);


    private int key;

    OperationTyp(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }
}
