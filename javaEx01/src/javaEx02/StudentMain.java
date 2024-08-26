package javaEx02;

public class StudentMain {

    public static void main(String[] args) {
        // std 객체(Student 클래스의 인스턴스)
        Student std =  new Student("2024001", "박정곤", 1);

        System.out.println(std);
        std.show();
    }
}
