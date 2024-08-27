package javaEx04.shape;

public class Circle extends Drawing {

    private static final double PI = 3.14;
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("원의 면적은: " + (r*r*PI));
    }
}
