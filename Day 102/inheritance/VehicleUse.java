package inheritance;

public class VehicleUse {
    public static void main(String args[]){
        Vehicle v=new Vehicle();
        v.color="Red";
        v.maxSpeed=80;
        v.print();

        Car c=new Car();
        c.color="black";
        c.maxSpeed=100;
        c.numOfDoors=4;

        c.print();


        Bicycle b=new Bicycle();
        b.print();

    }
}
