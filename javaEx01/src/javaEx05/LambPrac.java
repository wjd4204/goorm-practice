package javaEx05;

import java.util.Scanner;

public class LambPrac {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        String expression = sc.nextLine();

        Runnable result = (() -> {
            if(expression == "+") {
                System.out.println(a + b);
            }
            else if(expression.equals("-")) {
                System.out.println(a - b);
            }
            else if(expression.equals("*")) {
                System.out.println(a * b);
            }
            else if(expression.equals("/")) {
                System.out.println(a / b);
            }
        });

        result.run();
    }
}
