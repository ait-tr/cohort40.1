package lesson_39.code.standartFunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<UserRole> users = new ArrayList<>();

        users.add(new UserRole("Alex", "admin"));
        users.add(new UserRole("Thea", "member"));
        users.add(new UserRole("Alex2", "admin"));
        users.add(new UserRole("Alex3", "admin"));
        users.add(new UserRole("Alex4", "admin"));
        users.add(new UserRole("Alex5", "member"));

        // -----  сделаем выборку user с ролью admin

        // CompareUserRole myPredicateImpl = new CompareUserRole();

        //List<UserRole> admins = process(users, myPredicateImpl);


        List<UserRole> admins = process(users, (UserRole user) -> user.getRole().equals("admin"));
        System.out.println(admins);



        List<UserRole> members = process(users, (UserRole user) -> user.getRole().equals("member"));
        System.out.println(members);

    }

//    public static List<UserRole> process(List<UserRole> users, String userRole){
//        List<UserRole> resultList = new ArrayList<>();
//
//        for (UserRole currentUser : users){
//            if (currentUser.getRole().equals(userRole)) {
//                resultList.add(currentUser);
//            }
//        }
//
//        return resultList;
//    }

    // имея жесткий критерий поиска
    // мы вынуждены для каждого нового критерия
    // создавать отдельные ПЕРСОНАЛЬНЫЕ методы !!!!

    public static List<UserRole> process(List<UserRole> users, Predicate<UserRole> predicate){
        List<UserRole> resultList = new ArrayList<>();

        for (UserRole currentUser : users){
            if (predicate.test(currentUser)) {
                resultList.add(currentUser);
            }
        }
        return resultList;
    }
}
