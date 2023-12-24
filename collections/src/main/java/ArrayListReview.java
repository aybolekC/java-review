import java.util.*;

public class ArrayListReview {


    public static void main(String[] args) {

        //Create ArrayList and a class
        List<Student> students=new ArrayList<>();

        //Add elements to ArrayList
        students.add(new Student(1,"Jose"));
        students.add(new Student(2,"Sayed"));
        students.add(new Student(3,"Nick"));
        students.add(new Student(4,"Ronnie"));


        System.out.println(students);



        //Iteration on ArrayLists
        //1. For loop with get(index)
        System.out.println("Legacy iteration for loop, while loop");
        for (int i=0; i<students.size(); i++)  // this is legacy for loop
            System.out.println(students.get(i));

        //2. Iterator
        System.out.println("Iteration with Iterator");
        Iterator iter=students.listIterator();
//        while (iter.hasNext()){
//            System.out.println(iter.next());
//        }
          //Forward Iteration
        System.out.println("Forward Iteration with Iterator..............");
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
          //Backwards Iteration
        System.out.println("Backward Iteration with Iterator..............");
        while (((ListIterator<?>) iter).hasPrevious()){
            System.out.println(((ListIterator<?>) iter).previous());
        }
         //3. For each loop
        System.out.println("Printing with foreach loop..............");
        for (Student student:students) {
            System.out.println(student);
        }
         //4. Lambda
        System.out.println("Printing with lambda ..............");
        students.forEach(student -> System.out.println(student));

        //Storing Elements in List
        System.out.println("Printing sorted arraylist with comparator ..............");
        Collections.sort(students,new sortByIdDesc());
        System.out.println(students);

        Collections.sort(students,new sortByIdAsc());
        System.out.println(students);

        Collections.sort(students,new sortByNameDesc());
        System.out.println(students);

        Collections.sort(students,new sortByNameAsc());
        System.out.println(students);
    }

    static class sortByIdDesc implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o2.id-o1.id;
        }
    }
    static class sortByIdAsc implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.id-o2.id;
        }
    }
    static class sortByNameDesc implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }
    static class sortByNameAsc implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.name.compareToIgnoreCase(o2.name);
        }
    }

}
