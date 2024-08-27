package javaEx04.shape;

public class Triangle extends Drawing {

    private final int width;
    private final int height;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public void draw() {
        System.out.println("삼각형의 면적은: " + (width * height / 2));
    }
}
