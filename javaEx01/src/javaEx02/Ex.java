package javaEx02;

import java.util.Scanner;

public class Ex {

    private static void modifyValue(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("The average is " + sum/arr.length);
        arr[2] = sum/arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 3, 5, 7, 19};
        System.out.println("Before method call: " + arr[2]);
        modifyValue(arr);
        System.out.println("After method call: " + arr[2]);


//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println("a + b = " + (a + b));
//        System.out.println("a - b = " + (a - b));

//        String name = sc.nextLine();
//        int age = sc.nextInt();
//        System.out.println("The name is " + name);
//        System.out.println("The age is " + age);
    }
}
