package javaEx06;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> students = new HashMap<>();
        for(int i=0;i<3;i++){
            System.out.print("name: ");
            String name = sc.nextLine();
            System.out.print("score: ");
            int score = sc.nextInt();
            students.put(name, score);
            sc.nextLine();
        }
        System.out.print("삭제할 학생의 이름을 검색하세요: ");
        String input = sc.nextLine();
        if(students.containsKey(input)){
            students.remove(input);
            System.out.println("삭제가 완료되었습니다.");
        } else{
            System.out.println("해당 학생은 존재하지 않습니다.");
        }

        for(String name : students.keySet()){
            System.out.println("name: " + name + ", score: " + students.get(name));
        }

        System.out.print("특정 학생의 이름을 검색하세요: ");
        input = sc.nextLine();
        if(students.containsKey(input)){
            System.out.println("name: " + input + ", score: " + students.get(input));
        } else{
            System.out.println("해당 학생은 존재하지 않습니다.");
        }
    }
}
