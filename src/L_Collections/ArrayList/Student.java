package L_Collections.ArrayList;

public class Student {
    private int rollNo;
    private String name;

    public Student() {
    }

    public Student(int rollNo, String name) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Setter Method
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter Method
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
}
