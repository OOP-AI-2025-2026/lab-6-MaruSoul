package org.example.task3;

public class Smartphone implements Cellular, GPS {
    private double latitude = 46.460663;
    private double longitude = 30.750731;

    @Override
    public void makeCall() {

    }

    @Override
    public void receiveCall() {

    }

    @Override
    public double[] getCoordinates() {
        return new double[] { this.latitude, this.longitude };
    }
}
