package Review;

import java.util.ArrayList;
import java.util.List;

public class CarTest {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(0,new Car(2020,200));
        cars.add(1,new Car(1980,120));
        cars.add(2,new Car(2000,160));
        cars.add(3,new Car(2010,180));


        CarCheckSpeed speed =new CarCheckSpeed();
        CarCheckYear year = new CarCheckYear();


        System.out.println(filterCar(cars, speed));
        System.out.println(filterCar(cars, year));


    }

    public static List<Car> filterCar(List<Car> carList,CarPredicate carPredicate ){
        List<Car> result = new ArrayList<>();
        for (Car car:carList) {
            if(carPredicate.test(car)){
                result.add(car);
            }
        }
        return result;
    }
}
