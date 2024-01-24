import java.util.*;

public class Abstraction {
    public static void main(String[] args) {
        
        Mustang myHorse = new Mustang();
        // Aniumal -> Horse -> Mustang
        // Horse h = new Horse();
        // h.eat();
        // h.walk();

        // System.out.println("===============================");

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();
    
        // // Animal a = new Animal();  // Animal nav cha object nahi create hot bahi
    
        // System.out.println(h.color);
    }
}

abstract class Animal {
    String color;

    Animal(){
        System.err.println("Animal constructor called ");
    }
    void eat(){
        System.out.println("Animal Eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse constructor called ");
    }
    void changeColor() {
        color = "dark brown";
    }
    void walk(){
        System.out.println("Walk on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang(){
        System.out.println("Mustang constructor called ");
    }
}

class Chicken extends Animal {
    void walk(){
        System.out.println("walk on two legs");
    }
}