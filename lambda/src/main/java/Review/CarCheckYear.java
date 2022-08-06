package Review;

public class CarCheckYear implements CarPredicate{
    @Override
    public Boolean test(Car car) {
       return car.getYear()>2015;
    }
}
