package javaEx03.shape;

public class ShapeMain {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];
        shapes[0] = new Rectangle(3, 4);
        shapes[1] = new Triangle(4, 8);
        shapes[2] = new Shape(2, 3);
        shapes[3] = new Circle(0, 0, 7);

        for(int i=0;i<4;i++){
            shapes[i].getExtent();
        }
    }
}
