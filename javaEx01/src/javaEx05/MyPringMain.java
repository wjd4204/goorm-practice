package javaEx05;

public class MyPringMain {

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        myRunnable.run();

        Thread thread = new Thread(myRunnable);

        // start() 메서드를 호출
        thread.start();
    }
}
