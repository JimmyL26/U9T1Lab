public class VehicleRunner
{
  public static void main(String[] args)
  { 
    // testing all available methods on a Vehicle object
    Vehicle myVehicle = new Vehicle("Some Vehicle", 6);
    System.out.println(myVehicle.getName());
    System.out.println(myVehicle.getWheels());
    myVehicle.move(10);
    myVehicle.turn(90);
    myVehicle.brake(0.25);
    
    // testing all available methods on a Car object
    Car myCar = new Car("Honda Civic", 4, "leather");
    System.out.println(myCar.getName()); // inherited method
    System.out.println(myCar.getWheels()); // inherited method
    System.out.println(myCar.getFabric()); // method ONLY available on Car objects
    myCar.move(30); // inherited method
    myCar.turn(-90); // inherited method
    myCar.brake(0.50); // inherited method
    myCar.honk(); // method ONLY available on Car objects
    myCar.lockDoors(); // method ONLY available on Car objects
 
    // ---- WRITE YOUR TEST CODE BELOW! ----
    // testing all available methods on a Bicycle object

    Bicycle myBicycle = new Bicycle("BMX Bike", 4, 5);
    System.out.println(myBicycle.getName());
    System.out.println(myBicycle.getWheels());
    System.out.println(myBicycle.getGearCount());
    myBicycle.move(80);
    myBicycle.turn(-70);
    myBicycle.brake(0.40);
    myBicycle.ringBell();

//    myVehicle.ringBell();                          //line 1
//    System.out.println(myVehicle.getGearCount());  //line 2
//    myCar.ringBell();                              //line 3
//    myBike.honk();                                 //line 4
//    myBike.lockDoors();                            //line 5

    Airplane myAirplane = new Airplane("Aircraft", 6, 2);
    System.out.println(myAirplane.getName());
    System.out.println(myAirplane.getWheels());
    System.out.println(myAirplane.getWingCount());
    myAirplane.move(100);
    myAirplane.turn(-50);
    myAirplane.brake(0.60);
    myAirplane.takeOff();
  }
}