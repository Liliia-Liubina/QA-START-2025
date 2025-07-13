package org.prog.session5;

import java.util.*;

import static org.prog.session5.MapDemo.randomColor;


public class HomeWork5Auto {
    public static void main(String[] args) {
//TODO: write Map with car owners as keys and owned cars as values
//TODO: assign each car random color using randomColor() from this class

        Map<String, List<String>> ownerCarsMap = new HashMap<>();
        ownerCarsMap.put("Adam", new ArrayList<>());
        ownerCarsMap.put("Amanda", new ArrayList<>());
        ownerCarsMap.put("Sam", new ArrayList<>());

        ownerCarsMap.get("Adam").add("BMW");
        ownerCarsMap.get("Adam").add("Toyota");
        ownerCarsMap.get("Adam").add("Audy");

        ownerCarsMap.get("Amanda").add("BMW");
        ownerCarsMap.get("Amanda").add("Toyota");
        ownerCarsMap.get("Amanda").add("Audy");

        ownerCarsMap.get("Sam").add("BMW");
        ownerCarsMap.get("Sam").add("Toyota");
        ownerCarsMap.get("Sam").add("Audy");




        List<String> carList = ownerCarsMap.get("Adam");
        for (String car : carList) {
            String color = randomColor();
            System.out.println("Adam owners " + color + " " + car);
        }

        List<String> carListAmanda = ownerCarsMap.get("Amanda");
        for (String carAmanda : carListAmanda) {
            String colorAmanda = randomColor();
            System.out.println("Amanda owners " + colorAmanda + " " + carAmanda);
        }

        List<String> carListSam = ownerCarsMap.get("Sam");
        for (String carSam : carListSam) {
            String colorSam = randomColor();
            System.out.println("Sam owners " + colorSam + " " + carSam);
        }





        }









}
