package javaEx04.shape;

public class Rectangle extends Drawing {

    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public void draw() {
        System.out.println("사각형의 면적은: " + (width * height));
    }
}
