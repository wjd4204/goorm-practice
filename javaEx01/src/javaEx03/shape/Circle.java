package javaEx03.shape;

public class Circle extends Shape {

    double pi = 3.14;
    int r;

    public Circle(int width, int height, int r) {
        super(width, height);
        this.r = r;
    }

    public void getExtent(){
        double extent = r * r * pi;

        System.out.println("원의 면적은 " + extent + "입니다.");
    }
}
