package doubleColonOperator;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {

        //zero-arg constructor
       Supplier<Car>  c1=()->new Car();
       System.out.println(c1.get().getModel());

       Supplier<Car>  c2=Car::new;
       System.out.println(c2.get().getModel());

        //one-arg constructor
        Function<Integer, Car> f1=make->new Car(make);
        Car bmw=f1.apply(2001);
        System.out.println(bmw.getModel());

        Function<Integer, Car> f2=Car::new;
        Car mercedes=f1.apply(2020);
        System.out.println(mercedes.getModel());


        //all-arg constructor
        BiFunction<String, Integer, Car>  b1=(make, model) -> new Car(make, model);
        Car honda=b1.apply("Honda", 2007);
        System.out.println(honda.getMake()+" "+ honda.getModel());

        BiFunction<String, Integer, Car>  b2=Car::new;
        Car nissan=b2.apply("Nissan", 2023);
        System.out.println(nissan.getMake()+" "+ nissan.getModel());

    }
}
