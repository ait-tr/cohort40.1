package lesson_28.code.lessoncode.practice.var1;

class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }
}
