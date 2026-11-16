package com.pluralsight;

public class Car extends Vehicle{

    private int numberOfDoors;

    public void openTrunk(){
        System.out.println("You open the trunk. There's a toolbox, a spare tire, " +
                "and a shotgun in there. Hopefully you never need to use any of them...");
    }

    public void closeTrunk(){
        System.out.println("Closing the trunk... watch your fingers!");
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
