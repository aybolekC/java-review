import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {

        //creating stream from Array
        String[] courses={"Java", "JS","TS"};
        Stream<String> courseStream= Arrays.stream(courses);


        //creating stream from Collection
        List<String> courseList=Arrays.asList("Java", "Spring","DS");
        Stream<String> courseStream2=courseList.stream();


        //creating stream from class objects
        List<Course> myCourses=Arrays.asList(
                new Course("Java",100),
                new Course("DS",101),
                new Course("Spring",102),
                new Course("Microservices",103),
                new Course("System Design",104)
        );

        Stream<Course> myCourseStream=myCourses.stream();


        //creating stream from values
        Stream<Integer> stream=Stream.of(1,2,3,4);


    }
}
