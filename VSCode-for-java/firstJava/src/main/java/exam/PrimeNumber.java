package main.java.exam;

public class PrimeNumber {
   public static void main(String[] args) {
    int num = 10;
    if (num < 2) {
      System.out.println("It is not a prime number");
    }
    int newVal = (int) Math.sqrt(num);
    for (int i = 2; i<=newVal;){
      if (newVal % i == 0) {
        System.out.println("It is not a prime number");
        break;
      }else {
        System.out.println("It is a prime number");
        break;
      }
    }
   }
}
