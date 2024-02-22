package lesson_28.code.lessoncode.hashCode;

public class HshCodeCollisia {
    public static void main(String[] args) {
        Magazine magazine1 = new Magazine("Техника молодежи","номер 12/88");

        Magazine magazine2 = new Magazine("Техника молодежи","номер 02/90");

        System.out.println(magazine1.hashCode());
        System.out.println(magazine2.hashCode());

        System.out.println(magazine1.equals(magazine2));

    }
}
