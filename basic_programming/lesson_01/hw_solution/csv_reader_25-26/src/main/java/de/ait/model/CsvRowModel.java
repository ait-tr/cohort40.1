package de.ait.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrej Reutow
 * created on 10.06.2023
 */
public class CsvRowModel {

    private final int rowNr;
    private final List<String> errors;
    private final String table;
    private final String transaktionTypKey;
    private final String operationTypKey;
    private final String transactionsCode;
    private final String transaktionNr;
    private final String additionalTransaktionNr;
    private final String betrag;
    private final String currency;
    private final String kontoNr;
    private final String blz;
    private final String transDatum;
    private final String valuta;
    private final String mandatReferenz;
    private final String kundeId;
    private final String vw1;
    private final String vw2;
    private final String bemerkung1;
    private final String bemerkung2;
    private final String bemerkung3;


    public CsvRowModel(int rowNr,
                       String table,
                       String transaktionTypKey,
                       String operationTypKey,
                       String transactionsCode,
                       String transaktionNr,
                       String additionalTransaktionNr,
                       String betrag,
                       String currency,
                       String kontoNr,
                       String blz,
                       String transDatum,
                       String valuta,
                       String mandatReferenz,
                       String kundeId,
                       String vw1,
                       String vw2,
                       String bemerkung1,
                       String bemerkung2,
                       String bemerkung3) {
        this.rowNr = rowNr;
        this.errors = new ArrayList<>();
        this.table = table;
        this.transaktionTypKey = transaktionTypKey;
        this.operationTypKey = operationTypKey;
        this.transactionsCode = transactionsCode;
        this.transaktionNr = transaktionNr;
        this.additionalTransaktionNr = additionalTransaktionNr;
        this.betrag = betrag;
        this.currency = currency;
        this.kontoNr = kontoNr;
        this.blz = blz;
        this.transDatum = transDatum;
        this.valuta = valuta;
        this.mandatReferenz = mandatReferenz;
        this.kundeId = kundeId;
        this.vw1 = vw1;
        this.vw2 = vw2;
        this.bemerkung1 = bemerkung1;
        this.bemerkung2 = bemerkung2;
        this.bemerkung3 = bemerkung3;
    }

    public String getErrorMsg() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < errors.size(); i++) {
            String rowErrorMsg = String.format("Строка %d, Ошибка #%d, %s", rowNr, (i + 1), errors.get(i));
            sb.append(rowErrorMsg);
            sb.append(System.lineSeparator());
        }
        return sb.length() > 1 ? sb.deleteCharAt(sb.length() - 1).toString() : sb.toString();
    }

    public int getRowNr() {
        return rowNr;
    }

    public List<String> getErrors() {
        return errors;
    }

    public String getTable() {
        return table;
    }

    public String getTransaktionTypKey() {
        return transaktionTypKey;
    }

    public String getOperationTypKey() {
        return operationTypKey;
    }

    public String getTransactionsCode() {
        return transactionsCode;
    }

    public String getTransaktionNr() {
        return transaktionNr;
    }

    public String getAdditionalTransaktionNr() {
        return additionalTransaktionNr;
    }

    public String getBetrag() {
        return betrag;
    }

    public String getCurrency() {
        return currency;
    }

    public String getKontoNr() {
        return kontoNr;
    }

    public String getBlz() {
        return blz;
    }

    public String getTransDatum() {
        return transDatum;
    }

    public String getValuta() {
        return valuta;
    }

    public String getMandatReferenz() {
        return mandatReferenz;
    }

    public String getKundeId() {
        return kundeId;
    }

    public String getVw1() {
        return vw1;
    }

    public String getVw2() {
        return vw2;
    }

    public String getBemerkung1() {
        return bemerkung1;
    }

    public String getBemerkung2() {
        return bemerkung2;
    }

    public String getBemerkung3() {
        return bemerkung3;
    }

    @Override
    public String toString() {
        return "CsvRowModel{" +
                "rowNr=" + rowNr +
                ", table='" + table + '\'' +
                ", transaktion_typ_key='" + transaktionTypKey + '\'' +
                ", operation_typ_key='" + operationTypKey + '\'' +
                ", transactions_code='" + transactionsCode + '\'' +
                ", transaktion_nummer='" + transaktionNr + '\'' +
                ", additional_transaktion_number='" + additionalTransaktionNr + '\'' +
                ", betrag='" + betrag + '\'' +
                ", currency='" + currency + '\'' +
                ", kontonr='" + kontoNr + '\'' +
                ", blz='" + blz + '\'' +
                ", trans_datum='" + transDatum + '\'' +
                ", valuta='" + valuta + '\'' +
                ", mandateferenz='" + mandatReferenz + '\'' +
                ", kunde_id='" + kundeId + '\'' +
                ", vw_1='" + vw1 + '\'' +
                ", vw_2='" + vw2 + '\'' +
                ", bemerkung_1='" + bemerkung1 + '\'' +
                ", bemerkung_2='" + bemerkung2 + '\'' +
                ", bemerkung_3='" + bemerkung3 + '\'' +
                '}';
    }
}
