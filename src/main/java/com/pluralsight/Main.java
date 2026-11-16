package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped vespa = new Moped();
        Car honda = new Car();
        SemiTruck upsTruck = new SemiTruck();
        Hovercraft hoverMobile = new Hovercraft();

        vespa.setColor("Teal");
        vespa.setCargoCapacity(2);
        vespa.ride();

        honda.setNumberOfDoors(4);
        honda.setModel("Civic");
        honda.openTrunk();
        honda.closeTrunk();

        upsTruck.setNumberOfTrailers(2);
        upsTruck.setTopSpeed(70);
        upsTruck.loadCargo();
        upsTruck.unloadCargo();

        hoverMobile.setColor("Translucent");
        hoverMobile.setFuelCapacity(0); // Runs on air, no fuel needed!
        hoverMobile.setAirCushionPressure(2000);
        hoverMobile.hover();

    }
}
