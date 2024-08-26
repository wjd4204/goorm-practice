package javaEx03;

public class Employee {

    String name;
    long salary; // 연봉
    String level; // 직급

    public Employee(String name, int salary, String level) {
        this.name = name;
        this.salary = salary;
        this.level = level;
    }

    public void show(){
        System.out.println("제 이름은 " + name + "이고, " + salary + "만큼의 연봉을 받고 있으며, 현재" + level + "입니다.");
    }
}
