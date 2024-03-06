package lesson_37.code.lessoncode.genericsPractice;

import java.util.List;

public class Task13<T,U> {
    T type1;
    List<U> type2;

    public Task13(T type1, List<U> type2) {
        this.type1 = type1;
        this.type2 = type2;
    }

    public T getType1() {
        return type1;
    }

    public List<U> getType2() {
        return type2;
    }

    public void print(){
        System.out.println(type1);
        System.out.println(type2);
    }


}
