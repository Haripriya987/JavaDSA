import java.util.Scanner;

public class ClassAndObjectDemo {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    Student s1=new Student();//creating object gor student class
       // Student arr[]=new Student[2];
        System.out.println(s1.name);
        System.out.println(s1.rollNumber);
        s1.name="ABC";
        s1.rollNumber=32;
        System.out.println(s1.name);
        System.out.println(s1.rollNumber);

    }
}
class Student{
    String name;
    int rollNumber;

}