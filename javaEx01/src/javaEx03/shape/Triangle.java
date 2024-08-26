package javaEx03.shape;

public class Triangle extends Shape {

    public Triangle(int width, int height) {
        super(width, height);
    }

    @Override
    public void getExtent() {
        int extent = (width * height) / 2;
        System.out.println("삼각형의 면적은 " + extent + "입니다.");
    }
}
