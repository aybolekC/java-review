import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100,"Mike","mike17@gmail.com", Arrays.asList("2816765432","2816765432")),
                new Employee(101,"Manoj","manoj_kumar@gmail.com", Arrays.asList("2816765432","2816765432")),
                new Employee(102,"Hamza","hamza_javed@gmail.com", Arrays.asList("2816765432","2816765432"))

                );


    }
}
