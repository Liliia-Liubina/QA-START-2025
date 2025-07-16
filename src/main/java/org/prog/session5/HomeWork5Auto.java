package org.prog.session5;

import java.util.*;

import static org.prog.session5.MapDemo.randomColor;


public class HomeWork5Auto {
    public static void main(String[] args) {
//TODO: write Map with car owners as keys and owned cars as values
//TODO: assign each car random color using randomColor() from this class


        Map<String, List<NewCar>> ownedCars = new HashMap<>();
        ownedCars.put("Adam", new ArrayList<>());
        ownedCars.put("Amanda", new ArrayList<>());
        ownedCars.put("Sam", new ArrayList<>());


        ownedCars.get("Adam").add(new NewCar("BMW", randomColor()));
        ownedCars.get("Adam").add(new NewCar("Toyota", randomColor()));
        ownedCars.get("Adam").add(new NewCar("Audy", randomColor()));

        ownedCars.get("Amanda").add(new NewCar("Mazda", randomColor()));
        ownedCars.get("Amanda").add(new NewCar("BMW",randomColor()));
        ownedCars.get("Amanda").add(new NewCar("Toyota", randomColor()));

        ownedCars.get("Sam").add(new NewCar("Opel", randomColor()));
        ownedCars.get("Sam").add(new NewCar("Mitsubishi", randomColor()));
        ownedCars.get("Sam").add(new NewCar("BMW", randomColor()));


        List<NewCar> carList = ownedCars.get("Adam");
        for (NewCar car : carList) {
            System.out.println("Adam owns " + car);
        }
        System.out.println("________________________");

        List<NewCar> carListAmanda = ownedCars.get("Amanda");
        for (NewCar carAmanda : carListAmanda) {
           System.out.println("Amanda owns " + carAmanda);
        }
        System.out.println("________________________");

        List<NewCar> carListSam = ownedCars.get("Sam");
        for (NewCar carSam : carListSam) {
            System.out.println("Sam owns " + carSam);
        }



        }









}
