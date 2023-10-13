package main.java.objects;

class Animal{
    String color = "white";
}

class Dog extends Animal{
    String color = "Blue";

    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}


public class Super {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}
