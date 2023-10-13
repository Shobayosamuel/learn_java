package main.java.objects;


class Employee {
    float salary = 4000;
}

class Programmer extends Employee {
    int bonus = 10000;

}

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal{
    void bark() {
        System.out.println("Barking...");
    }
}

class Cat extends Animal{
    void meow() {
        System.out.println("meowing...");
    }
}

class BabyDog extends Dog{
    void weep() {
        System.out.println("weeping...");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        c.eat();
    }
}
