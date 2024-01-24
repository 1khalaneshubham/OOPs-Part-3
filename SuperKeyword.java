import java.util.*;

public class SuperKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    } 
}

class Animal {
    String color;
    Animal(){
        System.out.println("Animal constructor is called ");
    }
}

class Horse extends Animal {
    Horse() {
        // super(); // Animal chy contrt la pn call kart hey super key te pn exact called kart
        super.color = "brown";
        System.out.println("Horse constructor is called ");
    }
}