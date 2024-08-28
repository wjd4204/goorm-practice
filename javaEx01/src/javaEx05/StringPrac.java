package javaEx05;

import java.util.Scanner;

public class StringPrac {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb =  new StringBuilder(str);
        sb.reverse();
        str = String.valueOf(sb);
        str = str.toUpperCase();

        System.out.println(str);

    }
}
