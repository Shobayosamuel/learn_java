package main.java.objects;

/**
 * Account: class that has account details
 * deposit: method to put in funds to your account
 * withraw: method to remove funds from your account
 * 
 */
class Account {
    int accNo;
    String name;
    float amount;
    void insert(int acc, String na, float amt){
        accNo = acc;
        name = na;
        amount = amt;
    }
    void deposit(float amt){
        amount = amount + amt;
        System.out.println(amt + " deposited");
    }
    void withdraw(float amt){
        if (amt > amount){
            System.out.println("Insufficient balance");
            System.out.println("Your remaining balance is " + amount);
        }else {
            amount = amount - amt;
            System.out.println("You successfully withrew " + amt);
            System.out.println("Your remaining balance is " + amount);
        }
    }
    void checkBalance(){
        System.out.println("Your balance is " + amount);
    }
    void display(){
        System.out.println(accNo + " " + name + " " + amount);
    }
}

public class TestAccount {
    public static void main(String[] args) {
        Account a1=new Account();  
        a1.insert(832345,"Ankit",1000);  
        a1.display();  
        a1.checkBalance();  
        a1.deposit(40000);  
        a1.checkBalance();  
        a1.withdraw(15000);  
        a1.checkBalance();  
    }
}
