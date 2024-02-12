package consultation.cons_07.consultationCode.code;

public abstract class Employee {
    private String name;
    private String personalCode;
    private String position;
    private WorkingHoursRecord[] workingHoursRecords;
    private double totalHoursByPeriod;

    public Employee(String name, String personalCode, String position, WorkingHoursRecord[] workingHoursRecords) {
        this.name = name;
        this.personalCode = personalCode;
        this.position = position;
        this.workingHoursRecords = workingHoursRecords;
    }

    abstract void calculateTotalHours();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public WorkingHoursRecord[] getWorkingHoursRecords() {
        return workingHoursRecords;
    }

    public void setWorkingHoursRecords(WorkingHoursRecord[] workingHoursRecords) {
        this.workingHoursRecords = workingHoursRecords;
    }

    public double getTotalHoursByPeriod() {
        return totalHoursByPeriod;
    }

    public void setTotalHoursByPeriod(double totalHoursByPeriod) {
        this.totalHoursByPeriod = totalHoursByPeriod;
    }


}
