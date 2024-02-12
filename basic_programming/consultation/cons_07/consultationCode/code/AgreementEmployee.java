package consultation.cons_07.consultationCode.code;

public class AgreementEmployee extends Employee{

    private double hourlyRate;

    public AgreementEmployee(String name, String personalCode, String position, WorkingHoursRecord[] workingHoursRecords, double hourlyRate) {
        super(name, personalCode, position, workingHoursRecords);
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    void calculateTotalHours() {
    WorkingHoursRecord[] personalWorkingHoursArray = getWorkingHoursRecords();
        for (int i = 0; i < personalWorkingHoursArray.length; i++) {
            WorkingHoursRecord currentRecord = personalWorkingHoursArray[i];
            currentRecord.setHoursWorked(
                    (double) (currentRecord.getFinishedTime().getTime() - currentRecord.getStartTime().getTime()) / 60000
                    );


            setTotalHoursByPeriod(getTotalHoursByPeriod() + currentRecord.getHoursWorked());
        }
    }
}
