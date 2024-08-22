package javaEx01;

public class ArrayEx {

    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,10};

        System.out.println("배열의 길이: " + numbers.length);
        System.out.println("배열의 첫 번째 요소: " + numbers[0]);
        System.out.println("배열의 두 번째 요소: " + numbers[1]);
        System.out.println("배열의 마지막 요소: " + numbers[numbers.length - 1]);

        numbers[0] = 1;
        System.out.println("변경 후 배열의 첫 번재 요소: " + numbers[0]);

        //배열 요소 순회
        System.out.println("배열 요소 순회: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
