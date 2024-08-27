package javaEx04.draw;

public class Triangle extends DrawingObject{

    public Triangle() {
        penColor = "Pink";
    }

    @Override
    public void draw() {
        System.out.println(penColor + "색상으로 삼각형 그리기");
    }
}
