package lesson_10.code.lessoncode.settersAndGetters;

public class Person {

    private String name;
    private String address;
    private String personalCode;

    public Person(String name, String personalCode) {
        this.name = name;
        this.personalCode = personalCode;
    }

    public Person(String name, String address, String personalCode) {
        this.name = name;
        this.address = address;
        this.personalCode = personalCode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", personalCode='" + personalCode + '\'' +
                '}';
    }
}
