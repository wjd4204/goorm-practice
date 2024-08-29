package javaEx06.generic;

public class GBoxMain {

    public static void main(String[] args) {
        GBox<String> box1 = new GBox<String>();
        box1.setT("hello");

        String str = box1.getT(); // 강제 타입 변환 없음
        System.out.println(str);

        GBox<Integer> box2 = new GBox<Integer>();
        box2.setT(10);

        int value = box2.getT();
        System.out.println(value);

        GBox<Apple> box = new GBox<>();
        box.setT(new Apple());
        Apple apple = box.getT();
        System.out.println(apple);

    }
}
