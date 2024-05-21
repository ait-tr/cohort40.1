package lesson_25.code.lessoncode.library;

class ReaderService {
    private ReaderRepository readerRepository;

    public ReaderService(ReaderRepository repository) {
        this.readerRepository = repository;
    }

    public void addReader(Reader reader) {
        readerRepository.add(reader);
    }

    public void removeReader(Reader reader) {
        readerRepository.remove(reader);
    }

    public Reader findReader(String name) {
        return readerRepository.find(name);
    }
}
