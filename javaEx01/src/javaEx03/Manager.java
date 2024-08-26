package javaEx03;

public class Manager extends Employee{

    int employees;

    public Manager(String name, int salary, String level, int employees) {
        super(name, salary, level);
        this.employees = employees;
    }

    @Override
    public void show() {
        System.out.println("제 이름은 " + name + "이고, " + salary + "만큼의 연봉을 받고 있으며, 현재" + level + "입니다.");
        System.out.println("또한 " + employees + " 명의 직원을 관리하고 있습니다.");
    }
}
