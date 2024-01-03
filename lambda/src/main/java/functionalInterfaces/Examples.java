package functionalInterfaces;

import java.util.function.Predicate;

public class Examples {

    public static void main(String[] args) {

        //************************PREDICATE****************************//

/*
        Predicate<Integer> lesserThan=new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) { // this is an anonymous class
                return integer<18;
            }
        };

        lesserThan.test(50); */  // this is predicate implementation with an anonymous class



//        Predicate<Integer> lesserThan= public boolean abc(Integer a){
//            return a<18;
//        }

      //My version of the lambda
      //  Predicate<Integer> lesserThan=i-> i<18? true:false;

        Predicate<Integer> lesserThan= a->a<18; // implementation of the test method that belongs to predicate interface
        System.out.println(lesserThan.test(50));





    }




}
