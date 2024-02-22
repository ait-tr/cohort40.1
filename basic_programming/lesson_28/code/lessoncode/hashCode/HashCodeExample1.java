package lesson_28.code.lessoncode.hashCode;

public class HashCodeExample1 {
    public static void main(String[] args) {
        String str1 = "HashCode1";

        System.out.println(str1.hashCode());

        String str2 = "HashCode2";

        System.out.println(str2.hashCode());

        Person myPerson = new Person();
        System.out.println(myPerson.hashCode());
        System.out.println(myPerson.hashCode());
        System.out.println(myPerson.hashCode());

        Person myPerson2 = new Person();
        System.out.println(myPerson2.hashCode());

    }
}
