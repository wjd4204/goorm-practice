package javaEx03;

public class Child extends Parent{

    private int c;

    public void setChild(){
        c = 20;
    }

    public void showChild(){
        //자식 클래스에서 부모 클래스의 멤버 메서드 호출
        showParent();
        System.out.println("자식클래스 c: " + c);
    }
}
