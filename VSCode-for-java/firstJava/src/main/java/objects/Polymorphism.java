package main.java.objects;

class Bike{
    void run(){
        System.out.println("running");
    }
}

class Splendor extends Bike{
    void run(){
        System.out.println("running safely with 60km");
    }
}

//Polymorphism

class Bank{  
    float getRateOfInterest(){return 0;}  
}  
class SBI extends Bank{  
    float getRateOfInterest(){return 8.4f;}  
}  
class ICICI extends Bank{  
    float getRateOfInterest(){return 7.3f;}  
}  
class AXIS extends Bank{  
    float getRateOfInterest(){return 9.7f;}  
}  

public class Polymorphism {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println(b.getRateOfInterest());
    }
}
