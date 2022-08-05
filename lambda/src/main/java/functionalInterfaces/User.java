package functionalInterfaces;

import lombok.Builder;
import lombok.Data;

import java.util.function.Consumer;
import java.util.function.Predicate;

@Data
@Builder
public class User {

    private String firstName;
    private String lastName;
    private int age;



}
