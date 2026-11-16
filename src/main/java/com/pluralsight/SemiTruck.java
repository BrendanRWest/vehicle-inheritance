package com.pluralsight;

public class SemiTruck extends Vehicle{

    private int numberOfTrailers;

    public void loadCargo(){
        System.out.println("Loading boxes...");
    }

    public void unloadCargo(){
        System.out.println("Unloading boxes... remember to lift with your legs" +
                "and not your back.");
    }

    public int getNumberOfTrailers() {
        return numberOfTrailers;
    }

    public void setNumberOfTrailers(int numberOfTrailers) {
        this.numberOfTrailers = numberOfTrailers;
    }
}
