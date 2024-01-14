package inheritance;

public class Car extends Vehicle{
    int numOfDoors;
    public Car(){
      //  this(5,200);
       System.out.println("This is car default constructor");
    }
    public Car(int numOfDoors,int maxSpeed) {
      //  super(maxSpeed);

        super();
       // this(); Only super or this is present in first line of constructor otherwise it gices error
        this.numOfDoors=numOfDoors;
       //Gives erro// // super();  it ia always present in first line of child constructor
        System.out.println("Is it working");


    }
    public void  getNumberOfDoors(){
        System.out.println(numOfDoors +" for this car");
    }
}
