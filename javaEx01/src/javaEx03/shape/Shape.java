package javaEx03.shape;

public class Shape {

    int width;
    int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void getExtent(){
        int extent = width * height;
        System.out.println("직사각형의 면적은 " + extent + "입니다.");
    }
}
