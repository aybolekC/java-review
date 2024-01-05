import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

        //print all emails - One employee has one email - One to One
        EmployeeData.readAll()
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        //print all phone numbers
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .forEach(System.out::println);

        //how to print phone number one by one - each employee has 2 phone numbers
        System.out.println("how to print phone number one by one - each employee has 2 phone numbers");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);


        //how to print phone number one by one - each employee has 2 phone numbers == more clean code version
        System.out.println("how to print phone number one by one - each employee has 2 phone numbers");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);


    }
}
