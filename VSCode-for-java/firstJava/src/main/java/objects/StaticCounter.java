package main.java.objects;

class Counter2 {
    static int count = 0;
    Counter2(){
        count++;
        System.out.println(count);
    }
}

//Java Program to demonstrate the use of a static method.  
class Student{  
     int rollno;  
     String name;  
     static String college = "ITS";  
     //static method to change the value of static variable  
     static void change(){  
     college = "BBDIT";  
     }  
     //constructor to initialize the variable  
     Student(int r, String n){  
     rollno = r;  
     name = n;  
     }  
     //method to display values  
     void display(){System.out.println(rollno+" "+name+" "+college);}  
}  


class Calculate {
    static int cube(int x){
        return x*x*x;
    }

}

//Test class to create and display the values of object  
public class StaticCounter{  
    public static void main(String args[]){  
    int result = Calculate.cube(5);
    System.out.println(result);
    }  
}  
