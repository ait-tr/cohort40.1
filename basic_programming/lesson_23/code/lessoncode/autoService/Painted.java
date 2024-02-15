package lesson_23.code.lessoncode.autoService;

public class Painted implements Serviceable{

    private String typeWorkDescription;
    private String workStatus;

    public Painted(String typeWorkDescription) {
        this.typeWorkDescription = typeWorkDescription;
        this.workStatus = "Start painting";
    }

    @Override
    public void assignWork(String typeWorkDescription) {
        this.workStatus = "In Progress";
    }

    @Override
    public String getWorkStatus() {
        return typeWorkDescription + " - " + workStatus;
    }
}
