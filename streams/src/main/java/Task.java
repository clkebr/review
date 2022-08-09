import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.comparing;

public class Task {
    public static void main(String[] args) {

//        Given a list of words, print the number of characters for each word.

        List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");

        words.stream()
                .map(String::length)
                .forEach(System.out::println);

        System.out.println("----------");

//        Print all dish’s name that has less than 400 calories.

        List<Dish> menu = Arrays.asList(
                new Dish("pork",false,800,Type.MEAT),
                new Dish("beef",false,700,Type.MEAT),
                new Dish("chicken",false,400,Type.MEAT),
                new Dish("fries",true,530,Type.OTHER),
                new Dish("rice",true,350,Type.OTHER),
                new Dish("fruit",true,120,Type.OTHER),
                new Dish("pizza",true,550,Type.OTHER),
                new Dish("prawns",false,300,Type.FISH),
                new Dish("salmon",false,450,Type.FISH)
        );
        //1.way
        menu.stream()
                .filter(each-> each.getCalories()<400)
                .forEach(x-> System.out.println(x.getName()));
        //2.way
        menu.stream()
                .filter(dish -> dish.getCalories()<400)
                        .map(Dish::getName)
                                .forEach(System.out::println);

        System.out.println("----------");


//        Print the length of the name of each dish
        //1.way
        menu.stream()
                .map(dish->dish.getName().length())
                .forEach(System.out::println);

        //2.way
        menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

//        print three high caloric dish name(>300)

        menu.stream()
                .filter(dish ->dish.getCalories()>300 )
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

//          Print all dish name that are below 400 calories in sorted

        menu.stream()
                .filter(dish-> dish.getCalories()<400)
                .sorted(comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);


    }
}
