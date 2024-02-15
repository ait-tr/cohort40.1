package lesson_23.code.lessoncode.autoService;

public class Repair implements Serviceable{

    private String typeWorkDescription;
    private String workStatus;

    public Repair(String typeWorkDescription) {
        this.typeWorkDescription = typeWorkDescription;
        this.workStatus = "Assigned";
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
