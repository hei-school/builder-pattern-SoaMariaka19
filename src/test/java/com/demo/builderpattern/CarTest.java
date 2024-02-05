package com.demo.builderpattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void setSeats() {
        Car car = new Car();
        car.setSeats(5);

        assertEquals(5, car.getSeats());
    }

    @Test
    void setEngine() {
        Car car = new Car();
        Engine engine = new SportEngine();
        car.setEngine(engine);

        assertEquals(engine, car.getEngine());
    }

    @Test
    void setTripComputer() {
        Car car = new Car();
        car.setTripComputer(true);

        assertTrue(car.isTripComputer());
    }

    @Test
    void setGPS() {
        Car car = new Car();
        car.setGPS(true);

        assertTrue(car.isGPS());
    }

    @Test
    void getSeats() {
        Car car = new Car();
        car.setSeats(4);

        assertEquals(4, car.getSeats());
    }

    @Test
    void getEngine() {
        Car car = new Car();
        Engine engine = new StandardEngine();
        car.setEngine(engine);

        assertEquals(engine, car.getEngine());
    }

    @Test
    void isTripComputer() {
        Car car = new Car();
        car.setTripComputer(true);

        assertTrue(car.isTripComputer());
    }

    @Test
    void isGPS() {
        Car car = new Car();
        car.setGPS(true);

        assertTrue(car.isGPS());
    }
}