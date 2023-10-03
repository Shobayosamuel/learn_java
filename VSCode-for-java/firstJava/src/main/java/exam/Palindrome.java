package main.java.exam;

public class Palindrome {
    public static void main(String[] args) {
        int num = 627, r, temp;
        int sum = 0;
        temp = num;
        while (num>0) {
            r = num%10;
            sum = (sum*10)+r;
            num = num/10;
        }
        if (temp == sum) {
            System.out.println("Palindrome Number");
        } else{
            System.out.println("Number is not palindrome");
        }

    }
}
