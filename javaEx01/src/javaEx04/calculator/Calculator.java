package javaEx04.calculator;

public class Calculator {

    public final int add(int a, int b){
        return a+b;
    }

    public final int sub(int a, int b){
        return a-b;
    }

    public final int mul(int a, int b){
        return a*b;
    }

    public final int div(int a, int b){
        if(b == 0)
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        return a/b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(3,5));
        System.out.println(calc.sub(8,4));
        System.out.println(calc.mul(8,4));
        System.out.println(calc.div(63,7));
        System.out.println(calc.div(8,0));
        System.out.println("end");

    }
}
