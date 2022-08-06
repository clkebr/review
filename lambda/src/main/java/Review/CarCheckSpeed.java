package Review;

public class CarCheckSpeed implements  CarPredicate{
    @Override
    public Boolean test(Car car) {
       return car.getSpeed()>160;
    }
}
