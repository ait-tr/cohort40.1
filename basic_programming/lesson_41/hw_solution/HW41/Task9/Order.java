package code.HW41.Task9;

import java.util.Date;

public class Order {
    private String id;
    private Date date;
    private Double sum;
    private String status;

    public Order(String id, Date date, Double sum, String status) {
        this.id = id;
        this.date = date;
        this.sum = sum;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public Double getSum() {
        return sum;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", sum=" + sum +
                ", status='" + status + '\'' +
                '}';
    }
}
