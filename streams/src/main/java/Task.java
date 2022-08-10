import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

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
        
        //1.way
        DishData.getAll().stream()
                .filter(each-> each.getCalories()<400)
                .forEach(x-> System.out.println(x.getName()));
        //2.way
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                        .map(Dish::getName)
                                .forEach(System.out::println);

        System.out.println("----------");


//        Print the length of the name of each dish
        //1.way
        DishData.getAll().stream()
                .map(dish->dish.getName().length())
                .forEach(System.out::println);

        //2.way
        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

//        print three high caloric dish name(>300)

        DishData.getAll().stream()
                .filter(dish ->dish.getCalories()>300 )
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

//          Print all dish name that are below 400 calories in sorted

        DishData.getAll().stream()
                .filter(dish-> dish.getCalories()<400)
                .sorted(comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("----------");

//          Create a list of States and print all the cities.
        List<State> states = Arrays.asList(
                new State("Berlin"),
                new State("Baden-Württemberg"),
                new State("Bavyera"));

        states.get(0).addCity("Berlin");
        states.get(0).addCity("Mitte");
        states.get(0).addCity("Neukölln");
        states.get(1).addCity("Stuttgart");
        states.get(1).addCity("Heidelberg");
        states.get(1).addCity("Mannheim");
        states.get(2).addCity("Munich");
        states.get(2).addCity("Augsburg");
        states.get(2).addCity("Nürnberg");

//        states.stream()
//                .flatMap(state ->state.getCities().stream())
//                .forEach(System.out::println);


        states.stream()
                .map(State::getCities)
                .flatMap(List::stream)
                .forEach(System.out::println);

        System.out.println("----------");

//        Given a list of numbers how would you return a list of the square of each number?
//        For example, given [1,2,3,4,5] you should return [1,4,9,16,25]

        int[] arr = {1, 2, 3, 4, 5};

        int[] ints = Arrays.stream(arr)
                .map(x -> x * x)
                .toArray();
        System.out.println(Arrays.toString(ints));

//     TODO:   Given two lists of numbers, how would you return all pairs of numbers?
//        For example, given a list [1,2,3] and a list [3,4]
//        you should return [(1,3),(1,4),(2,3),(2,4),(3,3),(3,4)]


        System.out.println("*************************");

//        Find all transactions in the year 2011 and sort them by value(small to high)

        TransactionData.getAll().stream()
                .filter(trans-> trans.getYear()==2011)
                .sorted(comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("*************************");

//        What are all the unique cities where the traders work?

        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);

        System.out.println("*************************");

//        Find all traders from Cambridge and sort them by name.

        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .distinct()
                .filter(trader -> trader.getCity()=="Cambridge")
                .sorted(comparing(Trader::getName))
                .forEach(System.out::println);
        System.out.println("*************************");

//        Return a string of all traders’ names sorted alphabetically.

        TransactionData.getAll().stream()
                .map(Transaction::getTrader)
                .sorted(comparing(Trader::getName))
                .map(Trader::getName)
                .distinct()
                .forEach(System.out::println);

        System.out.println("*************************");

//        Are any traders based in Milan?

        boolean anyMatch = TransactionData.getAll().stream().anyMatch(data -> data.getTrader().getCity() == "Milan");
        System.out.println(anyMatch);

        System.out.println("*************************");

//        Print the values of all transactions from the traders living in Cambridge.

        TransactionData.getAll().stream()
                .filter(data->data.getTrader().getCity()=="Cambridge")
                .map(Transaction::getValue)
                .forEach(System.out::println);

        System.out.println("*************************");

//         What is the highest value of all the transactions?

        Optional<Integer> maxValue = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println(maxValue);

//         Find the transaction with the smallest value.
        Optional<Integer> minValue = TransactionData.getAll().stream()
                .map(Transaction::getValue)
                .reduce(Integer::min);
        System.out.println(minValue);


        // todo: generate the first 20 elements of the series of Fibonacci tuples using iterate method.

    }
}
