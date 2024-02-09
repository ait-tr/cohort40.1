package lesson_19.code.lessoncode.incapsulation;

public class Student {

    private int studentId;
    private String name;
    private String group;
    private String password;

    public Student(int studentId, String name, String group, String password) {
        this.studentId = studentId;
        this.name = name;
        this.group = group;
        this.password = password;
    }


    public int getStudentId() {
        return studentId;
    }


    public String getName() {
        return name;
    }


    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void changePassword(String newPassword){
        // проверить подлинность и права доступа пользователя
        // проверить правильность нового пароля (длина, какие символы и т д)
        // только после всех проверок
        this.password = newPassword;
    }

    public void printStudentData(){
        System.out.println("Студент: ");
        System.out.println("Id: " + studentId);
        System.out.println("Имя: " + name);
        System.out.println("Группа: " + group);

    }


}
