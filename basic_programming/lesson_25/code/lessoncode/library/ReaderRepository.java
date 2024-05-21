package lesson_25.code.lessoncode.library;

class ReaderRepository {
    private Reader[] readers = new Reader[10];
    private int count = 0;

    public void add(Reader reader) {
        if (count < readers.length) {
            readers[count++] = reader;
        }
    }

    public void remove(Reader reader) {
        // Удаление читателя из массива
    }

    public Reader find(String name) {
        for (int i = 0; i < count; i++) {
            if (readers[i].getName().equals(name)) {
                return readers[i];
            }
        }
        return null;
    }
}
