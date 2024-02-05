package com.demo.builderpattern;

public interface Builder {
    void reset();

    void setSeats(int number);

    void setEngine(Engine engine);

    void setTripComputer();

    void setGPS();

    Car getResult();


    int getSeats();
}
