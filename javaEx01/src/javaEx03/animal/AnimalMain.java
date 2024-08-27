package javaEx03.animal;

public class AnimalMain {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.show();
        a.sound();

        Cat c = new Cat();
        c.show();
        c.sound();

        Dog d = new Dog();
        d.show();
        d.sound();

        Animal ap = null;
        ap = new Cat();
        ap.show();
        ap.sound();

        System.out.println("----------------------------------");

        // 자식 타입으로 변환하고자 할 때 : 강제 타입 변환
        // 현재 ap 는 Animal 타입 : Animal 클래스의 메서드만 사용 가능
        // 오버라이딩된 메서드는 예외
    }
}
