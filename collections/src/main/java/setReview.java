import java.util.HashSet;
import java.util.Set;

public class setReview {

    public static void main(String[] args) {

        //1. create a set
        Set<Student> mySet=new HashSet<>();

        //2. add element
        mySet.add(new Student(7,"Ibadet"));
        mySet.add(new Student(8,"Ahmet"));
        mySet.add(new Student(9,"Muhabbet"));


        System.out.println(mySet);

        Set<Integer> numSet=new HashSet<>();

        numSet.add(1);
        numSet.add(2);

        System.out.println(numSet);
        System.out.println(numSet.add(2));



    }



}
