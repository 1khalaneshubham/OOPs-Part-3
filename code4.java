import java.util.*;

public class code4 { 
    public static void main(String[] args) {
     
        Vehical obj1 = new Car();
        obj1.print1();  // yat bap che proprties aahe ani so te leka che properties nahi gheu shkat
        // The method print1() is undefined for the type Vehical
        
        Vehical obj2 = new Vehical();
        obj2.print();
    }
}

class Vehical {
    void print()  {
        System.out.println("Base Class(Vehical)");   
    }
}

class Car extends Vehical {
     void print1()  {
        System.out.println("Derivd Class(Car)");   
    }
}

