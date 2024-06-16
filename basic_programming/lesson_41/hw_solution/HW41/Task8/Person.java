package code.HW41.Task8;

public class Person {
    private String name;
    private Integer age;
    private Boolean isFemale;
    private Double salary;

    public Person(String name, Integer age, Boolean isFemale, Double salary) {
        this.name = name;
        this.age = age;
        this.isFemale = isFemale;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getFemale() {
        return isFemale;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isFemale=" + isFemale +
                ", salary=" + salary +
                '}';
    }
}
