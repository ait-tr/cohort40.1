package consultation.cons_07.consultationCode.code;

public class ContractedEmployee extends Employee{

    private double salaryPerMount;
    private String vacationPeriod;
    private double hoursByContract;

    public ContractedEmployee(String name, String personalCode, String position, WorkingHoursRecord[] workingHoursRecords, double salaryPerMount, String vacationPeriod, double hoursByContract) {
        super(name, personalCode, position, workingHoursRecords);
        this.salaryPerMount = salaryPerMount;
        this.vacationPeriod = vacationPeriod;
        this.hoursByContract = hoursByContract;
    }

    public double getSalaryPerMount() {
        return salaryPerMount;
    }

    public void setSalaryPerMount(double salaryPerMount) {
        this.salaryPerMount = salaryPerMount;
    }

    public String getVacationPeriod() {
        return vacationPeriod;
    }

    public void setVacationPeriod(String vacationPeriod) {
        this.vacationPeriod = vacationPeriod;
    }

    public double getHoursByContract() {
        return hoursByContract;
    }

    public void setHoursByContract(double hoursByContract) {
        this.hoursByContract = hoursByContract;
    }

    @Override
    void calculateTotalHours() {

    }
}
