package code.HW41.Task6;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Integer age;
    private ArrayList<String> programmingLanguages;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.programmingLanguages = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(ArrayList<String> programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }
    public ArrayList<String> addLanguage(String language){
        programmingLanguages.add(language);
        return programmingLanguages;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", programmingLanguages=" + programmingLanguages +
                '}';
    }
}
