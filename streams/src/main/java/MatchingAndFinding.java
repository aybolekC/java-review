import java.util.Optional;

public class MatchingAndFinding {

    public static void main(String[] args) {

        //AllMatch -- all the dishes are less than 1000 calories
       boolean isHealthy= DishData.getAll().stream()
                .allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);

       //AnyMatch - if the dish has any vegetarian option - then menu is vegetarian friendly
        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The Menu is vegetarian friendly");
        }

        //None match
        boolean isHealthy2=DishData.getAll().stream()
                .noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy2);

        //FIND ANY
        Optional<Dish> dish=DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();

        System.out.println(dish);

        //Find First
        Optional<Dish> dish2=DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();

        System.out.println(dish2);





    }
}
