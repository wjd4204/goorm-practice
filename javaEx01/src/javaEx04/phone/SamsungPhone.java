package javaEx04.phone;

public class SamsungPhone implements IsSmartPhone{
    private String name;

    public SamsungPhone() {
        this.name = "삼성폰";
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
        System.out.println(name + "으로 전화를 겁니다.");
    }

    @Override
    public void receiveSMS() {

    }
}
