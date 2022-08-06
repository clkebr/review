package Review;


import lombok.Data;

public class Car {

    private int year;
    private int speed;

    public int getYear() {
        return year;
    }

    public Car(int year, int speed) {
        this.year = year;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", speed=" + speed +
                '}';
    }
}
