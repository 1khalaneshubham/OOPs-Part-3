import java.util.*;

public class code3 {
    public static void main(String[] args) {
     
        Vehical obj1 = new Car();
        obj1.print();  // Function Overriding

        Vehical obj2 = new Vehical();
        obj2.print();
    }
}

class Vehical {
    void print(){
        System.out.println("Base Class(Vehical)");   
    }
}

class Car extends Vehical {
     void print(){
        System.out.println("Derivd Class(Car)");   
    }
}
