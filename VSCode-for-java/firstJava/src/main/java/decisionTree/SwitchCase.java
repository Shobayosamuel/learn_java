package main.java.decisionTree;

import java.util.Scanner;
enum DaysOfWeek {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
public class SwitchCase {
   public static void main(String[] args) {
    System.out.println("Input the number");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    switch (number) {
        case 11:
            System.out.println("The number is 11");
            break;
        case 23:
            System.out.println("The number is 23");
            break;
        case 20:
            System.out.println("The number is 20");
            break;
        default:
            System.out.println("Not a case here");
    }
    System.out.println("Tell me your letter");
    char ch = scanner.next().charAt(0);
    switch (ch) {
        case 'a':
            System.out.println("Vowel");
            break;
        case 'e':
            System.out.println("Vowel");
            break;
        case 'i':
            System.out.println("Vowel");
            break;
        case 'o':
            System.out.println("Vowel");
            break;
        case 'u':
            System.out.println("Vowel");
            break;
        default:
            System.out.println("Consonant");
    }
    scanner.close();
    DaysOfWeek today = DaysOfWeek.WEDNESDAY;
    switch (today) {
        case WEDNESDAY:
            System.out.println("Wednesday");
            break;
    
        default:
            break;
    }
   }
}
