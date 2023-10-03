package main.java.decisionTree;

import java.util.Scanner;

public class TestResult {
   public static void main(String[] args) {
    System.out.println("Enter the year:");
    Scanner scanner = new Scanner(System.in);
    int year = scanner.nextInt();
    scanner.close();
    if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
        System.out.println("Leap Year");
    }
    else{
        System.out.println("Common year");
    }
    int number = 13;
    String output = (number%2==0)?"Even Number":"Odd Number";
    System.out.println(output);
   }
}
