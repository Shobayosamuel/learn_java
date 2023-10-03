package main.java.objects;

class Student {
    int id;
    String name;
    void inserRecord(int i, String n){
        id = i;
        name = n;
    }
    void printRecord(){
        System.out.println(id + " " + name);
    }
    
}

class Rectangle {
    int length;
    int width;
    void setValues(int l, int w){
        length = l;
        width = w;
    }
    void getArea(){
        System.out.println("Area = " + length*width);
    }
}

class Calculation {
    void fact(int n){
        int ans = 1;
        while (n>0) {
            ans = ans * n;
            n--;
        }
        System.out.println(ans);
    }
}


class TestStudent1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.inserRecord(45, "Vincent");
        System.out.println(s1.id);
        System.out.println(s1.name);
        s1.printRecord();
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.setValues(66, 7);
        r2.setValues(8, 5);
        r1.getArea();
        r2.getArea();
        new Calculation().fact(5);
    }
}
