package com.demo.builderpattern;

public class CarBuilder implements Builder{
    private Car car;

    public CarBuilder (){
        this.car = new Car();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int number) {
        this.car.setSeats(number);
    }

    @Override
    public void setEngine(Engine engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setTripComputer() {
        this.car.setTripComputer(true);
    }

    @Override
    public void setGPS() {
        this.car.setGPS(true);
    }

    @Override
    public Car getResult() {
        return this.car;
    }

    @Override
    public int getSeats() {
        return 0;
    }

}
