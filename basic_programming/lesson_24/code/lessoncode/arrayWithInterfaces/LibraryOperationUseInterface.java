package lesson_24.code.lessoncode.arrayWithInterfaces;

public class LibraryOperationUseInterface {
    LibraryRepository repository;

    public LibraryOperationUseInterface(LibraryRepository repository) {
        this.repository = repository;
    }


    public void operations() {
        repository.fill();

        for (int i = 0; i < repository.getItems().length; i++) {
            repository.printInfo();
        }

    }
}
