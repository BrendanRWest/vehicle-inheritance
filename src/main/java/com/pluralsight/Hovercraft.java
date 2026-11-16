package com.pluralsight;

public class Hovercraft extends Vehicle{

    private int airCushionPressure;

    public void hover(){
        System.out.println("Now entering hover mode. Woahhh, this is like something" +
                "out of The Jetsons!");
    }

    public int getAirCushionPressure() {
        return airCushionPressure;
    }

    public void setAirCushionPressure(int airCushionPressure) {
        this.airCushionPressure = airCushionPressure;
    }
}
