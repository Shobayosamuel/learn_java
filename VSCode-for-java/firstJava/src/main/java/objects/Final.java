package main.java.objects;
class Bike9{
    final int speed_limit = 90;
    void run(){
        speed_limit = 400;
    }
}

//variables with the keyword FINAL cannot be overidden
//If you make a class final, you cannot extend it

public class Final {
    public static void main(String[] args) {
        Bike9 b1 = new Bike9();
        b1.run();
    }
}
