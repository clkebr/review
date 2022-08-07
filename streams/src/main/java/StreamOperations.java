import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 6, 7, 99, 45, 6, 689, 0);
        list.forEach(System.out::println);

        System.out.println("----------");

        //Filter operation
         list.stream()
                 .filter(integer -> integer % 3 == 0)
                 .distinct()
                 .forEach(System.out::println);

        System.out.println("----------");

        // Limit
        list.stream()
                .filter(x->x%2==0)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("----------");

        //skip
        list.stream()
                .filter(integer -> integer>6)
                .skip(2) //skip first two
                .forEach(System.out::println);

        System.out.println("----------");

        // map
        list.stream()
                .map(integer -> integer*2)
                .filter(integer -> integer>50)
                .forEach(System.out::println);

    }
}
