package javaEx01;

import java.util.*;

public class JavaEx01 {

    public static void main(String[] args) {
        // console 출력
        System.out.println("Hello, Java!");
        System.out.print("Enter your name: ");

        // console 입력
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        System.out.println("Welcome, " + name + "!");

        // 데이터 타입
        // 정수형
        int age = 25;
        long population = 89000000000000L;

        // 문자형
        double height = 169.4;
        float weight = 70.5f;

        // 문자형
        char ch = '3';
        //논리형
        boolean isStudent = true;

        System.out.println("Age: " + age);

        // 명시적 형변환(타입 캐스팅) : 큰 타입에서 작은 타입으로 수동 변환

        double pi = 3.14;
        int truncatedPi = (int) pi;

        System.out.println("pi: " + pi + ", truncatedPi: " + truncatedPi);

        //연산자
        // 산술연산자 : +, -, *, /, %
        // 비교연산자 : ==, !=, <, >, <=, >=
        // 논리연산자 : &&, ||, !

        // 수를 입력 받아 홀수 인지 짝수 인지 판별하는 프로그램
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if(num % 2==0)
            System.out.println(num + " is even");
        else System.out.println(num + " is odd");

        // if
        if (num < 10) System.out.println(num + "은 한 자리 숫자입니다.");
        else if(num < 100) System.out.println(num + "은 두 자리 숫자입니다.");
        else if(num < 1000) System.out.println(num + "은 세 자리 숫자입니다.");

        // switch
        switch(num){ // switch문의 변수는 프리미티브 타입
            case 1:
                System.out.println("일");
                break;
            case 2:
                System.out.println("이");
                break;
            default:
                System.out.println("아무것도 아님");
                break;
        } // end fo switch

        // 반복문
        // for: 고정된 횟수만큼.
        // while문: 조건식이 참일 동안 반복
        // do-while문: 코드 블록을 먼저 실행하고, 조건이 참이면 반복실행

    } // end of main
}
