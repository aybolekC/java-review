package functionalInterfaces;

import java.util.function.*;

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


        System.out.println("//************************PREDICATE****************************//");
        Predicate<Integer> lesserThan= a->a<18; // implementation of the test method that belongs to predicate interface
        System.out.println(lesserThan.test(50));

        System.out.println("//************************CONSUMER****************************//");
        Consumer<Integer> display=i-> System.out.println(i);
        display.accept(50);

        System.out.println("//************************BICONSUMER****************************//");
        BiConsumer<Integer, Integer> addTwo=(x,y) -> System.out.println(x+y);
        addTwo.accept(5,7);

        System.out.println("//************************FUNCTION****************************//");
        Function<String, String> fun=s->"Hello " + s;
        System.out.println(fun.apply("Sasha"));

        System.out.println("//************************SUPPLIER****************************//");
        Supplier<Double> randomValue=()->Math.random();
        System.out.println(randomValue.get());





    }
}
