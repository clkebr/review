import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MatchingAndFinding {

    public static void main(String[] args) {

        //All match
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);

        //any match
        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian)) System.out.println("the menu is vegetarian friendly");

        //none match
        boolean noneMatch = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(noneMatch);

        //Find any
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish);

        //find first
        Optional<Dish> firstDish = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(firstDish);
    }
}
