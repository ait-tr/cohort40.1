package consultation.cons_08.consultationCode.code;

abstract class Good {
    private int id;
    private String catalogNumber;
    private String goodName;
    private String producer;
    private boolean isPresent;
    private String goodCategory;

    public Good(int id, String catalogNumber, String goodName, String producer, String goodCategory) {
        this.id = id;
        this.catalogNumber = catalogNumber;
        this.goodName = goodName;
        this.producer = producer;
        this.goodCategory = goodCategory;
    }

    public int getId() {
        return id;
    }

    public String getCatalogNumber() {
        return catalogNumber;
    }

    public String getGoodName() {
        return goodName;
    }

    public String getProducer() {
        return producer;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public String getGoodCategory() {
        return goodCategory;
    }

    abstract void checkGoodOnWarehouse();

//        // обращаться к сладу и проверять есть ли товар
//        this.isPresent = true; // или false в результате проверки склада


}
