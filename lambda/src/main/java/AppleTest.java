import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {
        List<Apple> inventory=new ArrayList<Apple>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));


        List<Apple> heavyApple=filterApples(inventory, new AppleHeavyPredicate());
        System.out.println(heavyApple);

        List<Apple> greenApple=filterApples(inventory, new AppleGreenColorPredicate());
        System.out.println(greenApple);

        AppleFormatter appleSimpleFormatter=new AppleSimpleFormatter();
        prettyPrintApple(inventory, appleSimpleFormatter);

        AppleFormatter appleFancyFormatter=new AppleFancyFormatter();
        prettyPrintApple(inventory, appleFancyFormatter);


    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate){

        List<Apple> result= new ArrayList<>();

        for(Apple apple: inventory){

            if(applePredicate.test(apple)){
                result.add(apple);
            }
        }


        return result;
    }


    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter){

        for (Apple apple: inventory){
            String output= formatter.accept(apple);
            System.out.println(output);
        }

    }

}
