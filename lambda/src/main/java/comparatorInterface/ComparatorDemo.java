package comparatorInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class ComparatorDemo {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(10,0,15,5,20);
        System.out.println(list);

        //sorting ascending order
        Collections.sort(list);
        System.out.println(list);

        //sorting descending order
        Collections.sort(list, new MyComparator());
        System.out.println(list);


        Collections.sort(list, ((o1, o2)->(o1>o2) ? -1 : (o1<o2) ? 1 : 0));
        System.out.println(list);

        //Ascending order
        list.sort((o1,o2)->o1.compareTo(o2));
        System.out.println(list);

        //Descending order
        list.sort((o2,o1)->o1.compareTo(o2));
        System.out.println(list);

        List<Apple> myInventory=Arrays.asList(
                new Apple(80,Color.GREEN),
                new Apple(155,Color.GREEN),
                new Apple(300,Color.RED),
                new Apple(70,Color.GREEN)
        );

        //sorting apples based on weight
       Comparator<Apple> sortApple= comparing(apple->apple.getWeight());
       myInventory.sort(sortApple);
       System.out.println(myInventory);

       //writing in more efficient way
       myInventory.sort(comparing((apple)->apple.getWeight()));

       //more more efficient way
        myInventory.sort(comparing(Apple::getWeight));

        //reversed
        myInventory.sort(comparing(Apple::getWeight).reversed());

        //chaining
        myInventory.sort(comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));

        System.out.println(myInventory);






    }
}
