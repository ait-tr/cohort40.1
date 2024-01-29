package lesson_05.code.lessoncode.multiCooker;

public class MultiCooker {

    String producer;
    String model;
    int power;
    int volume;

    String dish;
    int currentProgramNumber;
    int programNumbers;
    String nameProgram;
    int timeForProgram;

    public MultiCooker(String producer, String model, int power, int volume) {
        this.producer = producer;
        this.model = model;
        this.power = power;
        this.volume = volume;
    }


    public void changeProgram(int newProgramNumber, String newProgram){
        this.currentProgramNumber = newProgramNumber;
        this.nameProgram = newProgram;
        System.out.println("Программу готовки переключили на: " + nameProgram + "( программа номер: " + currentProgramNumber + ")");
    }

    public void changeDish(String newDish) {
        this.dish = newDish;
        System.out.println("В мультиварку поместили новые продукты для приготовления: " + dish + " в режиме: " + nameProgram);
    }



    @Override
    public String toString() {
        return "MultiCooker{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", power=" + power +
                ", volume=" + volume +
                ", dish='" + dish + '\'' +
                ", currentProgramNumber=" + currentProgramNumber +
                ", programNumbers=" + programNumbers +
                ", nameProgram='" + nameProgram + '\'' +
                ", timeForProgram=" + timeForProgram +
                '}';
    }
}
