package task.functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<User> users=new ArrayList<>();

        users.add(User.builder().firstName("Mike").lastName("Smith").build());
        users.add(new User("Aya","Hudston", 40));
        users.add(new User("Neymar","Marcus", 25));
        users.add(new User("Yusup","Evan", 15));
        users.add(new User("Ali","Edison", 12));
        users.add(new User("Emily","Parker", 45));


        //print all elements in the list
        System.out.println("==============print all elements in the list=======================");
        printName(users,p->true);

        //print all users that last name starts with E
        System.out.println("============print all users that last name starts with E================");
        printName(users, user->user.getLastName().startsWith("E"));



    }

    private static void printName(List<User> users, Predicate<User> p){
        for (User user: users) {
            if(p.test(user)){
                System.out.println(user.toString());
            }
        }

    }


    /*  // implementation my way
        //print all elements in the list
        Consumer<List<User>> display= users1-> System.out.println(Arrays.asList(users1));
        display.accept(users);

        //print all users that last name starts with E
        Function<List<User>, List<User>> startingWithE= users1 -> {
            List<User> lastNameStartingWithE=new ArrayList<>();
            for (User user: users1) {
                if(user.getFirstName().charAt(0)=='E'){
                    lastNameStartingWithE.add(user);
                }
            }
            return lastNameStartingWithE;
        }; */



}
