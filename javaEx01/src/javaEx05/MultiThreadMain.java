package javaEx05;

public class MultiThreadMain {

    public static void main(String[] args) {
        MultiThread t1 = new MultiThread(1);
        MultiThread t2 = new MultiThread(2);

        t1.start();
        t2.run2();

    }
}
