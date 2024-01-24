import java.util.*;

public class code6 {
    public static void main(String[] args) {
        
        Test obj = new Test();
        obj.set_marks(98);
        System.out.println(Test.marks);
    }
}

class Test {
    static int marks;
    void set_marks(int marks){
        this.marks = marks;
    }
}