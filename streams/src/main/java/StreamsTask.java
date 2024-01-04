import java.util.Arrays;
import java.util.List;

public class StreamsTask {
    public static void main(String[] args) {

        List<String> words= Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");

        words.stream().map(w->w.length()).forEach(System.out::println);

        //more simplified way
        System.out.println("=============More simplified way=================");
        words.stream().map(String::length).forEach(System.out::println);
    }
}
