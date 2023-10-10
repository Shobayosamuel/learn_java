package main.java.objects;

public class Emp {
   int id;
   String name;
   Address address;

   public Emp(int id, String name, Address address){
    this.id = id;
    this.name = name;
    this.address = address;
   }

   void display(){
    System.out.println(id + " " + name);
    System.out.println(address.city + " " + address.state + " " + address.country);
   }

   public static void main(String[] args) {
    Address address1 = new Address("Los Angeles", "California",  "America");
    Address address2 = new Address("Lagos", "Lagos",  "Nigeria");

    Emp emp1 = new Emp(1, "sammy", address1);
    Emp emp2 = new Emp(2, "Daniel", address2);

    emp1.display();
    emp2.display();
   }
}
