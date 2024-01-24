import java.util.*;

public class code5 {

    public static void main(String[] args) {
         
        System.out.println(Book.Count);
        Book b1 = new Book(150); // Book Add
        Book b2 = new Book(250); // Book Add
        System.out.println(Book.Count);
    }
}

class Book {
    int Price;
    static int Count;

    public Book(int Price){
        this.Price = Price;
        Count++;
    }
}