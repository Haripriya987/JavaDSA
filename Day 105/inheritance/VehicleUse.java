package inheritance;

public class VehicleUse {
    public static void main(String args[]){

        Vehicle v=new Car(2,50);
        v.maxSpeed=200;
        //v.numberOfDoors=3; It gives error Because this member is not in Vehicle class
        v.print();//It is overriden method so it will call car class method  print
        // v.numberOfDoors();  //This method is not in vehicle so it throws an error


//        Vehicle v=new Vehicle();
//        v.color="Red";
//        v.maxSpeed=80;
//        v.print();
//
//        Car c=new Car(4,20);
//        c.color="black";
//        c.maxSpeed=100;
//        c.numOfDoors=4;
//
//        c.print();
//
//
//        Bicycle b=new Bicycle();
//        b.print();

    }
}
//If we have reference to base class that reference  can be referred to all objects of sub  classes or derived classes
//Parent class reference  will point to any object Of Derived class