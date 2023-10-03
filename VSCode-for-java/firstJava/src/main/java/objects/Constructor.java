package main.java.objects;
/**
 * The use of parameterized constructors
 */
class Student4 {
    int id;
    String name;
    Student4(int i, String n){
        id = i;
        name = n;
    }
    void display(){
        System.out.println(id + " " + name);
    }
}

/*
 * Constructor overloading
 * Using different for different number of inputs and types for one class
 */

class Student5 {
    int id;
    String name;
    int age;

    //creating two arg constructor
    Student5(int i, String n){
        id = i;
        name = n;
    }

    //creating three arg constructor
    Student5(int i, String n, int a){
        id = i;
        name = n;
        age = a;
    }
    void display(){
        System.out.println(id + " " + name + " " + age);
    }

}

/*
 * Java copying values with constructor
 */
class Student6 {
    int id;
    String name;

    Student6(int i, String n){
        id = i;
        name = n;
    }
    Student6(Student6 s){
        id = s.id;
        name = s.name;
    }
    void display(){
        System.out.println(id + " " + name);
    }
}

class Student7 {
    int id;
    String name;

    Student7(int i, String n){
        id = i;
        name = n;
    }
    Student7(){}
    void display(){
        System.out.println(id + " " + name);
    }
}


public class Constructor {
    public static void main(String[] args) {
        // Student4 s1 = new Student4(111,"Karan");  
        // Student4 s2 = new Student4(222,"Aryan");  
        // //calling method to display the values of object  
        // s1.display();  
        // s2.display();  

        // Student5 s3 = new Student5(111,"Karan");  
        // Student5 s4 = new Student5(222,"Aryan",25);  
        // s3.display();  
        // s4.display(); 
        // Student6 s1 = new Student6(111,"Karan");  
        // Student6 s2 = new Student6(s1);  
        // s1.display();  
        // s2.display();
        Student7 s1 = new Student7(22, "Sammy");
        Student7 s2 = new Student7();
        s2.id = s1.id;
        s2.name = s1.name;
        s1.display();
        s2.display();
    }
}
