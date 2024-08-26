package javaEx03;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee em = new Employee("Tom", 3000, "사원");
        em.show();

        Manager m = new Manager("Brian", 5000, "팀장", 3);
        m.show();


    }
}
