package lesson_36.code.lessoncode.generics.methods;

public interface GarbageHandler<T, S>{
    void handle(T what, S how);

    <E> void dangerousWasteTransfer(E dangerousWaste);

}
