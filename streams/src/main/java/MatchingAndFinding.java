import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MatchingAndFinding {

    public static void main(String[] args) {
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
        //All match
        boolean isHealthy = menu.stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);

        //any match
        if(menu.stream().anyMatch(Dish::isVegetarian)) System.out.println("the menu is vegetarian friendly");

        //none match
        boolean noneMatch = menu.stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(noneMatch);

        //Find any
        Optional<Dish> dish = menu.stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish);

        //find first
        Optional<Dish> firstDish = menu.stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(firstDish);
    }
}
