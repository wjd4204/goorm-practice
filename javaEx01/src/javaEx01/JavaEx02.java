package javaEx01;

import java.util.Scanner;

public class JavaEx02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(number + " x " + i + " = " + number * i);
        }

        int limit = sc.nextInt();
        int sum = 0;
        int count = 1;
        while(count<=limit){
            sum += count;
            count++;
        }
        System.out.println("1부터 " + limit + "까지의 합은 " + sum);


        int secret = sc.nextInt();
        int guess;
        do{
            System.out.println("숫자를 맞춰보세요: (1-10)");
            guess = sc.nextInt();
        } while(guess != secret);{
            System.out.println("대단해요, 맞췄군요!");
        }

        System.out.println("bye");
    }
}
