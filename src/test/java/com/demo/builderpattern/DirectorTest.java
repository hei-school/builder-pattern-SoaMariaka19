package com.demo.builderpattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectorTest {

    @Test
    void makeSportsCar() {
        CarBuilder builder = new CarBuilder();
        Director director = new Director();
        
        director.makeSportsCar(builder);
        Car sportsCar = builder.getResult();

        assertEquals(2, sportsCar.getSeats());
        assertTrue(sportsCar.isTripComputer());
        assertTrue(sportsCar.isGPS());
        assertTrue(sportsCar.getEngine() instanceof SportEngine);
    }

    @Test
    void makeSUV() {
        CarBuilder builder = new CarBuilder();
        Director director = new Director();

        director.makeSUV(builder);
        Car suv = builder.getResult();

        assertEquals(4, suv.getSeats());
        assertTrue(suv.isTripComputer());
        assertTrue(suv.isGPS());
        assertTrue(suv.getEngine() instanceof StandardEngine);
    }
}