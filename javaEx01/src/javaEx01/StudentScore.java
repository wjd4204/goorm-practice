package javaEx01;

import java.util.Arrays;
import java.util.Scanner;

public class StudentScore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] scores = {
                {90,70,80,100},
                {85,65,77,90},
                {80,75,85,95}
        };

        for(int i=0;i<scores.length;i++){
            int sum = 0;
            for(int j=0;j<scores[i].length;j++){
                sum += scores[i][j];
            }
            double avg = sum/ (double) scores[i].length;
            System.out.println((i+1) + "번 학생의 평균 점수: " + avg);
        }


    }
}
