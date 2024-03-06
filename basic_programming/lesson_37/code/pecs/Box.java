package lesson_37.code.pecs;

public class Box<T extends Garbage> {

    private T item;

    public void putItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public double getItemWeight(){
        return item.getWeight();
    }

    @Override
    public String toString() {
        return "Box{" +
                "item=" + item +
                '}';
    }
}
