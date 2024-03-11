package lesson_39.code.standartFunctionalInterfaces;

public class UserRole {
    private String name;
    private String role;

    public UserRole(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
