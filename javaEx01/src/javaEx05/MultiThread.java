package javaEx05;

public class MultiThread extends Thread {

    private int id;

    public MultiThread(int id) {
        this.id = id;
    }

    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("ThreadId: " + id + ", print: " + i);
        }
    }

    public void run2(){
        for(char a = 'a';a<='j';a++){
            System.out.println("ThreadId: " + id + ", print: " + a);
        }
    }

}
