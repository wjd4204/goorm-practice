package javaEx02;

public class Calculator {
    //일반적으로 static 필드는 선언과 동시에 초기값을 설정
    // 접근 제어자를 안 붙이면 default로 설정

    static double pi = 3.14159;
    static int plus(int x, int y){
        return x+y;
    }

    static int minus(int x, int y){
        return x-y;
    }
}
