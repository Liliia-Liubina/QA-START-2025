package org.prog;

public class HomeWork6 {
    //TODO: 1. Add class Plane which has current passengers count,
// max passengers cound and flight ID as string "AA-1001"
// 2. Create new Plane, set passengers, max passengers and flight id

    public static void main(String[] args) {
        Car aliceCar = new Car();
        Car bobCar = new Car();

        aliceCar.color = "blue";
        aliceCar.model = "3";
        bobCar.color = "red";


        aliceCar.direction();
        bobCar.direction();
        System.out.println("-------------------");

        Plane currentPassengers = new Plane();
        Plane maxPassengers = new Plane();
        Plane tkId = new Plane();
        Plane aaId = new Plane();

        currentPassengers.passengers = 200;
        maxPassengers.passengers = 350;
        tkId.id = "TK 1852";
        aaId.id = "AA 1252";

        System.out.println(currentPassengers.passengers);
        System.out.println(maxPassengers.passengers);
        System.out.println("Flight ID is " + tkId.id);

        tkId.delay(2);
        aaId.delay(1);

        currentPassengers.toFly();
        maxPassengers.toFly();




//        System.out.println(aliceCar.color);
//        System.out.println(bobCar.color);

//        aliceCar.goTo();
//        bobCar.goTo();

//        aliceCar.refuel(25, "diesel");
//        bobCar.refuel(15, "gasoline");

//        System.out.println(aliceCar.model);
//        System.out.println(bobCar.model);

    }
}
