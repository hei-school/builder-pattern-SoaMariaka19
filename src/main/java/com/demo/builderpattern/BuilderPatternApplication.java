package com.demo.builderpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderPatternApplication {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();

        // Construire une voiture de sport
        director.makeSportsCar(builder);
        Car car = builder.getResult();

        // Afficher les informations de la voiture de sport
        System.out.println("Voiture de sport : ");
        System.out.println(" - Sièges : " + car.getSeats());
        System.out.println(" - Moteur : " + car.getEngine().getClass().getSimpleName());
        System.out.println(" - Ordinateur de bord : " + (car.isTripComputer() ? "Oui" : "Non"));
        System.out.println(" - GPS : " + (car.isGPS() ? "Oui" : "Non"));

        // Construire un SUV
        director.makeSUV(builder);
        car = builder.getResult();

        // Afficher les informations du SUV
        System.out.println("\nSUV : ");
        System.out.println(" - Sièges : " + car.getSeats());
        System.out.println(" - Moteur : " + car.getEngine().getClass().getSimpleName());
        System.out.println(" - Ordinateur de bord : " + (car.isTripComputer() ? "Oui" : "Non"));
        System.out.println(" - GPS : " + (car.isGPS() ? "Oui" : "Non"));
        /*System.out.println("hello");
        SpringApplication.run(BuilderPatternApplication.class, args);*/
    }

}
