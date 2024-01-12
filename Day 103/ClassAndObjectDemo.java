import java.util.Scanner;

public class ClassAndObjectDemo {
    public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    Student s1=new Student();//creating object gor student class
       // Student arr[]=new Student[2];
        System.out.println(s1.name);
       // System.out.println(s1.rollNumber);
        s1.name="ABC";
        s1.setRollNumber(32);
       // s1.rollNumber=32;
        System.out.println(s1.name);
        System.out.println(s1.getRollNumber());
      //  System.out.println(s1.rollNumber);
        Student s3;

    }
}
class Student{
    String name;
   private int rollNumber;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        rollNumber = rollNumber;
        System.out.println(rollNumber);
    }
}

//this keyword is a reference variable that refers to current object.