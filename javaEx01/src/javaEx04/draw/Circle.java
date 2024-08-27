package javaEx04.draw;

public class Circle extends DrawingObject{

    public Circle(){
        penColor = "Blue";
    }

    @Override
    public void draw() {
        System.out.println(penColor + "색상으로 선 그리기");
    }
}
