package com.demo.builderpattern;

public class Car {
    private int seats;
    private Engine engine;
    private boolean tripComputer;
    private boolean GPS;

    public Car() {
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }

    public Integer getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public boolean isTripComputer() {
        return true;
    }

    public boolean isGPS() {
        return true;
    }
}
