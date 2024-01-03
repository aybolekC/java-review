import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class AppleTest2 {

    public static void main(String[] args) {
        List<Apple> inventory=new ArrayList<Apple>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.RED));
        inventory.add(new Apple(50,Color.GREEN));


        List<Apple> heavyApple=filterApples(inventory, apple->apple.getWeight()>150);
        System.out.println(heavyApple);

        List<Apple> greenApple=filterApples(inventory, apple -> apple.getColor().equals(Color.GREEN));
        System.out.println(greenApple);

        prettyPrintApple(inventory, apple -> System.out.println("An apple of " + apple.getWeight() +" g"));

        prettyPrintApple(inventory, apple -> {
           String characteristic= apple.getWeight()>150 ? "Heavy" : "Light";
            System.out.println("A " + characteristic + " " + apple.getColor() + " apple");
        });


    }

    private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> predicate){

        List<Apple> result= new ArrayList<>();

        for(Apple apple: inventory){

            if(predicate.test(apple)){
                result.add(apple);
            }
        }


        return result;
    }


    public static void prettyPrintApple(List<Apple> inventory, Consumer<Apple> formatter){

        for (Apple apple: inventory){
            formatter.accept(apple);
        }

    }

}
