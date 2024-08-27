package javaEx03.animal;

public class Dog extends Animal {

    @Override
    public void show() {
        System.out.println("강아지");;
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
