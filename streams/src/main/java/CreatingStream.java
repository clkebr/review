import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {

        //creating Stream from array
        String[] courses = {"Java", "JS", "TS", "Python"};
        Stream<String> courseStream = Arrays.stream(courses);

        //creating stream from collection (most common)
        List<String> courseList = Arrays.asList("Java", "html", "CSS");
        Stream<String> listStream = courseList.stream();

        List<Course> myCourses = Arrays.asList(
                new Course("Java", 101),
                new Course("DS", 102),
                new Course("Spring", 103),
                new Course("Microservices", 104)
        );
        Stream<Course> courseStream1 = myCourses.stream();


        //Creating stream from Values
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
    }


}
