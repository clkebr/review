package DoubleColonOperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Demo {

    public static void main(String[] args) {
        // if reference calls directly method, classname::methodName

        //reference to static method
        Calculate s1 = ((x, y) -> Calculator.findSum(x,y));
        s1.calculate(10,20);

        Calculate s2 = Calculator::findSum;
        s2.calculate(100,35);

        //reference to instance method
        Calculate m1 = ((x, y) -> new Calculator().findMultiply(x,y));
        m1.calculate(5,6);

        Calculator obj = new Calculator();
        Calculate m2 = obj::findMultiply;
        m2.calculate(6,6);

        Calculate m3 = new Calculator()::findMultiply;
        m3.calculate(8,9);

        BiFunction <String,Integer,String> func = (str,i)-> str.substring(i);
        System.out.println(func.apply("to be developer",6));

        BiFunction <String,Integer,String> func2 = String::substring;
        System.out.println(func2.apply("to be developer",6));

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(20);

        Consumer<Integer> display2 = System.out::println;
        display2.accept(60);


    }
}
