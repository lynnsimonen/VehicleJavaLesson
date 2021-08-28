package edu.wctc;

public abstract class Crashable {

    //Use an abstract class whenever you want to create a class in which every method
    //doesn't necessarily have to be implemented to use the abstract class
    //Create a variable that is NOT a constant (it CAN change).
    boolean carDrivable = true;

    public void youCrashed(){
        this.carDrivable = false;
    }
    //These will need to be implemented in Vehicle class before using.
    public abstract void setCarStrength(int carStrength);
    public abstract int getCarStrength();

    //Now we've created an abstract class!!!  Go over to Vehicle class and use it!!!


}
