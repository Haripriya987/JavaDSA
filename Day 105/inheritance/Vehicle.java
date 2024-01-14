package inheritance;

public class Vehicle {
    String color;
    int maxSpeed;
    Vehicle(){
        System.out.println("This is Vehicle contructor");
    }
    Vehicle(int speed){
        maxSpeed=speed;
    }
     void print(){
         System.out.println("Vehicle"+ "color"+ color + "maxSpeed "+ maxSpeed);
     }
}
