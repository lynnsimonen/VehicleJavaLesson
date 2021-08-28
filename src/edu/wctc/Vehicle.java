package edu.wctc;

public class Vehicle extends Crashable implements Drivable{

    //go over to Drivable interface and grab all methods to have to create them in anything
    //that implements the Drivable interface
    //MUST define all things in interface

    //can add new methods
    int numOfWheels = 2;
    double theSpeed = 0;
    int carStrength = 0;

    //ANY METHODS FROM THE INTERFACE MUST BE AS VISIBLE AS THEY WERE IN THEIR ORIGINAL INDERFACE FILE
    //INTERFACE FIELDS & METHODS ARE PUBLIC AND ABSTRACT BY DEFAULT
    public int getWheels() {
        return this.numOfWheels;
    }
    public void setWheels(int numWheels){
        this.numOfWheels = numWheels;
    }

    public double getSpeed() {
     return this.theSpeed;
    }

    public void setSpeed(double speed) {
        this.theSpeed = speed;
    }

    //Now create a constructor so we can create new vehicles.
    public Vehicle(int wheels, double speed) {
        this.numOfWheels = wheels;
        this.theSpeed = speed;
    }

    //Here we are implementing Crashable methods
    //Remove "abstract" from each line
    //public abstract void setCarStrength(int carStrength);
    //public abstract int getCarStrength();
    public void setCarStrength(int carStrength) {
        this.carStrength = carStrength;
    }
    public int getCarStrength(){
        return this.carStrength;
    }
    //Now we can go over to Main class to play around.
}
