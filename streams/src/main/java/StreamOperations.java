import java.util.Arrays;
import java.util.List;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> myList= Arrays.asList(1,2,3,3,4,5,6,6,7,8,9);

        //usage of the foreach method
        //with lambda expression
        myList.forEach(x-> System.out.println(x));

        //with double colon
        myList.forEach(System.out::println);

        //intermittent operations
        System.out.println("====================Filter=================");
        myList.stream()
                .filter(i-> i%3==0)
                .forEach(System.out::println);


        System.out.println("====================Distinct=================");
        myList.stream()
                .filter(i-> i%3==0)
                .distinct()
                .forEach(System.out::println);



        System.out.println("====================LIMIT=================");
        myList.stream()
                .filter(i-> i%3==0)
                .distinct()
                .limit(1)
                .forEach(System.out::println);


        System.out.println("====================SKIP=================");
        myList.stream()
                .filter(i-> i%3==0)
                .distinct()
                .skip(1)
                .forEach(System.out::println);



        System.out.println("====================MAP=================");
        myList.stream()
                .map(number->number*2)
                .filter(i-> i%2==0)
                .filter(i->i>10)
                .forEach(System.out::println);
        //source->stream->intermittent operation->terminal operation(to get out of stream)



    }
}
