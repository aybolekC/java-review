package doubleColonOperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Demo {

    public static void main(String[] args) {

        //reference to a static method from Calculator class
        Calculate c1=(x,y)->Calculator.findSum(x,y);
        c1.calculate(10,20);

        Calculate c2= Calculator::findSum;
        c2.calculate(10,20);

        //reference to instance method
        Calculate c3=(x,y)-> new Calculator().findMultiply(x,y);
        c3.calculate(15,2);

        //option 1
        Calculator obj=new Calculator();
        Calculate c4= obj::findMultiply;
        c3.calculate(20,2);

        //option 2
        Calculate c5=new Calculator()::findMultiply;
        c5.calculate(6,6);


        BiFunction<String, Integer, String> fn=(str, i)->str.substring(i);
        System.out.println(fn.apply("Developer",6));


        BiFunction<String, Integer, String> fn2= String::substring;
        System.out.println(fn2.apply("Developer",6));

        Consumer<Integer> display=i-> System.out.println(i);
        display.accept(70);


        Consumer<Integer> display2=System.out::println;
        display2.accept(90);

        //how to use double colon for instance method?
        BiFunction<MyClass, Integer, Double> v2=MyClass::method;
        BiFunction<String, String, String> v3=String::concat;




    }
}
