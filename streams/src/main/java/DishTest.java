import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


import static java.util.Comparator.*;

public class DishTest {

    public static void main(String[] args) {

        List<Dish> menu= Arrays.asList(
                new Dish("pork", false,800,Type.MEAT),
                new Dish("beef", false,700,Type.MEAT),
                new Dish("chicken", false,400,Type.MEAT),
                new Dish("fries", false,530,Type.OTHER),
                new Dish("rice", false,350,Type.OTHER),
                new Dish("fruit", false,120,Type.OTHER),
                new Dish("pizza", false,550,Type.OTHER),
                new Dish("shrimp", false,300,Type.FISH),
                new Dish("salmon", false,450,Type.FISH)
        );

        //print all dish's name that has less than 400 calories
        System.out.println("=========================TASK 2=============================");
        menu.stream().filter(dish -> dish.getCalories()<400)
                .forEach(dish -> System.out.println(dish.getName()));

        //print the length of the name of each dish
        System.out.println("=========================TASK 2=============================");
        menu.stream().map(dish -> dish.getName().length())
                .forEach(System.out::println);



        //print all dish's name that has less than 400 calories
        System.out.println("======================Task 1 Solution 2=====================");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);


        //print the length of the name of each dish
        System.out.println("=========================TASK 2 Solution 2=============================");
        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        //print three high caloric Dish name(>300)
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()>300)
                .limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);


        System.out.println("**************Sorted names less than 400 calories**************");
        //print all dish name that are below 400 calories in sorted order
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);


    }

}
