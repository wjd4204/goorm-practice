package javaEx04.controll;

public class SmartRemoteControlMain {

    public static void main(String[] args) {
        RemoteControl rc = new SmartTV();
        rc.turnOn();
        rc.setVolume(10);
        rc.turnOff();

        Searchable sch = new SmartTV();
        sch.search("www.naver.com");

        SmartTV tv = new SmartTV();
        tv.turnOn();
        tv.turnOff();
        tv.search("www.daum.net");
    }
}
