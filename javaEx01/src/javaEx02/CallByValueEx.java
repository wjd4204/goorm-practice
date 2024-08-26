package javaEx02;

public class CallByValueEx {

    public static void main(String[] args) {
        int originalValue = 5;
        System.out.println("Before method call: " + originalValue);
        modifyValue(originalValue);
        System.out.println("After method call: " + originalValue);
    }

    public static void modifyValue(int value){
        value = 10;
        System.out.println("Inside method: " + value);
    }
}
