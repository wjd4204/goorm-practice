package javaEx05;

// 작업 스레드: 비프음 출력
// 작업 스레드를 생성하기 위한 클래스
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println("Runnable is running - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.fillInStackTrace();
            }
        }
    }

}
