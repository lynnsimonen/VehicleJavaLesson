package edu.wctc;

public class Main {

    public static void main(String[] args) {
	    // So we created the public class Vehicle implements Drivable
        //now we can create some vehicles

        Vehicle car = new Vehicle(4,100.00);
        System.out.println("Cars Max Speed "+ car.getSpeed());
        System.out.println("Num of Wheels" + car.getWheels());

        //Now we will create an abstract class called Crashable
        car.setCarStrength(10);
        System.out.println("Strength: " + car.getCarStrength());

        //That is how you impmlement abstract and interface classes and abstract methods!



    }
}
