package main.java.objects;

class A1{
    A1 foo(){
        return this;
    }
    void print(){
        System.out.println("Inside the class A1");
    }
}

class A2 extends A1{
    @Override
    A1 foo(){
        return this;
    }
    void print(){
        System.out.println("Inside the class A2");
    }
}

class A3 extends A2{
    @Override
    A1 foo(){
        return this;
    }
    void print(){
        System.out.println("Inside the class A3");
    }
}

public class Covariant {
   public static void main(String[] args) {
    A1 a1 = new A1();
    A2 a2 = new A2();
    A3 a3 = new A3();
    a1.print();
    a2.print();
    a3.print();
   }
}

