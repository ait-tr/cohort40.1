package lesson_19.code.lessoncode.incapsulation.hr.entity;

public class Person {

    private String name;
    private String speciality;

    public Person(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public String getSpeciality() {
        return speciality;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
