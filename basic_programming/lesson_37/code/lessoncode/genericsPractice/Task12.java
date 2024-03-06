package lesson_37.code.lessoncode.genericsPractice;

public class Task12 <T, U> {
    T type1;
    U type2;

    public Task12(T type1, U type2) {
        this.type1 = type1;
        this.type2 = type2;
    }

    public T getType1() {
        return type1;
    }

    public U getType2() {
        return type2;
    }

    public void print(){
        System.out.println(type1);
        System.out.println(type2);
    }


}
