package edu.wctc;

public interface Drivable {

    //Java doesn't allow you to inherit from multiple different classes
    //ALL METHODS ARE PUBLIC IN HERE SO THEY WILL BE PUBLIC IN CLASSES THAT USE THIS CLASS.
    //So that is why we use interfaces and abstract classes to solve the problem of adding
    //functionality when our Main class is already inheriting from another class.
    //Interface is what we'd use.  Interfaces are adjectives because objects are nouns.
    //Interface - Empty class that tells someone or provides someone with methods
    //they must implement if they want to use this interface.
    //Other than that, it is just like any other class.  We can put fields inside of an interface
    //but they are going to be final which means they are constant.
    //Then define all the methods:

    // is final so always a constant.  Cannot be changed
    double PI = 3.14;

    //public abstract int getWheel();  fields are public and abstract by default so no need to write that out
    int getWheels();

    //define all the other things:
    //set number of wheels when inside of method.
    // whenever interface is implemented, it has to follow all rules defined here
    void setWheels(int numWheels);

    double getSpeed();
    void setSpeed(double speed);

    //We can jump over to Vehicle class and implement...
}
