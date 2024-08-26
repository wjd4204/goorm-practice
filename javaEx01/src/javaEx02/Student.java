package javaEx02;

public class Student {

    private String strNo; // 학번
    private String stdName; // 이름
    private int stdYear; // 학년

    //매개변수가 있는 생성자
    // 생성자: 클래스 이름과 동일한 메서드
    // 호출하지 않아도 객체가 생성될 때 자동 호출
    public Student(String strNo, String stdName, int stdYear) {
        super();
        this.strNo = strNo;
        this.stdName = stdName;
        this.stdYear = stdYear;
    }

    public String getStrNo() {
        return strNo;
    }

    public void setStrNo(String strNo) {
        this.strNo = strNo;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getStdYear() {
        return stdYear;
    }

    public void setStdYear(int stdYear) {
        this.stdYear = stdYear;
    }

    @Override
    public String toString() {
        return "toString: Student [" +
                "strNo='" + strNo +
                ", stdName='" + stdName +
                ", stdYear=" + stdYear +
                ']';
    }

    public void show(){
        System.out.println("Student [stdNo=" + strNo + ", stdName=" + stdName + ", stdYear=" + stdYear + "]");
    }
}
