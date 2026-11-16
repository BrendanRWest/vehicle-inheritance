package com.pluralsight;

public class Moped extends Vehicle{

    private int maxWeight;

    public void ride(){
        System.out.println("You saddle up... make sure you're wearing your helmet!");
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
