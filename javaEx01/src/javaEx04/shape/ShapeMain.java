package javaEx04.shape;

import java.util.List;

public class ShapeMain {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(4, 5);
        shapes[2] = new Triangle(7,8);

        for(int i=0;i<3;i++){
            shapes[i].draw();
        }

    }
}
