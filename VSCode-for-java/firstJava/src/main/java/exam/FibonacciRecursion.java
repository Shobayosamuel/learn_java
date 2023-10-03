package main.java.exam;

public class FibonacciRecursion {
    static int n1 = 0, n2 = 1, n3 = 0;
   static void printFibonacci(int val){
        if (val > 0) {
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonacci(val-1);
        }
    }
    public static void main(String[] args) {
        System.out.print(n1 + " " + n2);
        printFibonacci(10);
    }
}
