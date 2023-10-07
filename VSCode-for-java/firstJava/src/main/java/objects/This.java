package main.java.objects;

/*
 * How to use this keyword
 */

class Student {
    int rollno;
    String name;
    float fee;

    Student(int rollno, String name, float fee){
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }
    Student(){}
    void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }
}

public class This {
    public static void main(String[] args) {
        Student s1 = new Student(2, "Greg", 288);
        s1.display();
    }
}
