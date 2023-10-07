package main.java.objects;

class Operation{
    int square(int n){
        return n*n;
    }
}

class Circle{
    double pi = 3.142;

    double area(int radius){
        Operation op = new Operation();
        return op.square(radius) * this.pi;
    }
}

public class Aggregation {
   public static void main(String[] args) {
    Circle c=new Circle();  
    double result=c.area(5);  
    System.out.println(result);
   }
}
