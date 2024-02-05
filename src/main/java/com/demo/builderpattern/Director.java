package com.demo.builderpattern;

public class Director {
    public void makeSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new SportEngine());
        builder.setTripComputer();
        builder.setGPS();
    }

    public void makeSUV(Builder builder) {
        builder.reset();
        builder.setSeats(4);
        builder.setEngine(new StandardEngine());
        builder.setTripComputer();
        builder.setGPS();
    }
}
