package main.java.objects;

class Adder{
    static int add(int a, int b){
        return a+b;
    }
    static double add(double a, double b){
        return a+b;
    }
}

public class Overloading {
   public static void main(String[] args) {
    System.out.println(Adder.add(2, 4));
    System.out.println(Adder.add(33.4, 4.2));
   }
}
