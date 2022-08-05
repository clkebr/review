package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(User.builder().firstName("ebru").lastName("celik").age(37).build());
        users.add(User.builder().firstName("ercan").lastName("celik").age(38).build());
        users.add(User.builder().firstName("thomas").lastName("Ericsson").age(22).build());
        users.add(User.builder().firstName("vonya").lastName("womack").age(45).build());
        users.add(User.builder().firstName("dimitris").lastName("mele").age(45).build());


        //print all elements in the list
        print(users,user -> true);
        System.out.println("**********************");
        // print all user that last name starts with E
        print(users, each -> each.getLastName().startsWith("E"));
        
    }
    private static void print (List<User> users, Predicate<User> p){
        for (User user :
                users) {
            if (p.test(user)) System.out.println(user.toString());
        }

    }
}
