import java.util.Arrays;
import java.util.List;

public class DishData {

    public static List<Dish> getAll(){

        return Arrays.asList(
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

    }
}
