package com.demo.builderpattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuilderTest {
    private Builder builder;

    @BeforeEach
    void setUp(){
        this.builder = new CarBuilder();
    }

    @Test
    void reset() {
        builder.setSeats(5);
        builder.setEngine(new SportEngine());
        builder.setTripComputer();
        builder.setGPS();

        builder.reset();

        assertEquals(0, builder.getSeats());
        assertNull(builder.getResult().getEngine());
        assertTrue(builder.getResult().isTripComputer());
        assertTrue(builder.getResult().isGPS());
    }

    @Test
    void setSeats() {
        builder.setSeats(5);
        assertEquals(5, builder.getResult().getSeats());
    }

    @Test
    void setEngine() {
        Engine engine = new SportEngine();
        builder.setEngine(engine);
        assertEquals(engine, builder.getResult().getEngine());
    }

    @Test
    void setTripComputer() {
        builder.setTripComputer();
        assertTrue(builder.getResult().isTripComputer());
    }

    @Test
    void setGPS() {
        builder.setGPS();
        assertTrue(builder.getResult().isGPS());
    }

    @Test
    void getResult() {
        builder.setSeats(4);
        builder.setEngine(new SportEngine());
        builder.setTripComputer();
        builder.setGPS();

        Car result = builder.getResult();

        assertEquals(4, result.getSeats());
        assertNotNull(result.getEngine());
        assertTrue(result.isTripComputer());
        assertTrue(result.isGPS());
    }
}