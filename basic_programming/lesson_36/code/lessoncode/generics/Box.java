package lesson_36.code.lessoncode.generics;

public class Box<T> {

    private T item;

    public void putItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    /**
     * Рекомендации Oracle об обозначении типов в дженериках

     * T - type, для обозначения параметра в произвольных классах

     * N - number, для чисел

     * E - element, для элементов параметризованных коллекций

     * K - key, для ключей map-структур

     * V - value, для значений map-структур

     S, U, V - применяются, когда в дженерик-классе несколько параметров


     */
}
