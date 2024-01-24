import java.util.*;

public class StaticKeyword {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.SchoolName = "JSPM";

        Student s2 = new Student();
        System.out.println(s2.SchoolName);

        Student s3 = new Student();
        s3.SchoolName = "MIT";

        System.out.println(s2.SchoolName);
    }
}

class Student {
    static int returnPercentage(int math ,int phy ,int chem){
        return (math+phy+chem)/3;
    }
    String name; 
    int Roll;

    static String SchoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}