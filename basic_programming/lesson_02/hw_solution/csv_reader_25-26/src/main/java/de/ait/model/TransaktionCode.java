package de.ait.model;

/**
 * @author Andrej Reutow
 * created on 16.06.2023
 */
public enum TransaktionCode {
    SDD(1, "SEPA Direct Debit"),
    SCT(2, "SEPA Credit Transfer");

    private final int key;

    private final String description;

    TransaktionCode(int key, String description) {
        this.key = key;
        this.description = description;
    }

    public int getKey() {
        return key;
    }

    public String getDescription() {
        return description;
    }
}
