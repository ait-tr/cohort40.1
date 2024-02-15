package lesson_23.code.lessoncode.autoService;

public interface Serviceable {

    void assignWork(String typeWorkDescription);
    String getWorkStatus();
    void changeWorkStatus(String newStatus);
}
