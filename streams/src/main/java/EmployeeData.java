import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

public static Stream<Employee> readAll(){
    return Stream.of(
            new Employee(100, "Mike", "mike@test.com", Arrays.asList("234545454545", "677889545454545")),
            new Employee(101, "Ebr", "ebr@test.com", Arrays.asList("2347787454545", "678909545454545")),
            new Employee(102, "Peter", "ptr@test.com", Arrays.asList("23454676464545", "67788987676454545"))
    );
}


}
