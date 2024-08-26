package javaEx03.calculator;

public class Computer extends Calculator {

    @Override
    public double areaCircle(double r) {
        System.out.println("Computer areaCircle() 실행");
        return Math.PI * r * r;
    }
}
