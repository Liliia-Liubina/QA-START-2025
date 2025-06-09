package org.prog;

public class HomeWork6v1 {
    //TODO: 1. Add class Plane which has current passengers count,
// max passengers cound and flight ID as string "AA-1001"
// 2. Create new Plane, set passengers, max passengers and flight id

    public static void main(String[] args) {

        Plane1 newPlane = new Plane1();

        newPlane.current = 150;
        newPlane.max = 200;
        newPlane.id = "TK 1852";

        System.out.println("Current number of passengers is " + newPlane.current);
        System.out.println("Max number of passengers is " + newPlane.max);
        System.out.println("Flight ID is " + newPlane.id);

        newPlane.destination();


    }
}
