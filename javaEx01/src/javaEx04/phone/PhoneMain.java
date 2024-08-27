package javaEx04.phone;

public class PhoneMain {

    public static void main(String[] args) {
        IsSmartPhone isp = new SamsungPhone();
        isp.sendCall();

        IsSmartPhone isp2 = new IPhone();
        isp2.sendCall();
    }
}
