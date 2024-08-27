package javaEx04.phone;

public class IPhone implements IsSmartPhone{

    private String name;

    public IPhone() {
        this.name = "아이폰";
    }

    @Override
    public void sendCall() {
        System.out.println(name + "으로 전화를 겁니다.");
    }

    @Override
    public void receiveCall() {
        System.out.println(name + "으로 전화를 받습니다.");
    }

    @Override
    public void sendSMS() {

    }

    @Override
    public void receiveSMS() {

    }
}
