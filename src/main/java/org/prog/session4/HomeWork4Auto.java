package org.prog.session4;

import org.prog.session1.Car;

public class HomeWork4Auto {
    public static void main (String[] args) {

        Car annCar = new Car();
        annCar.model = "mazda";
        annCar.color = "red";

        Car bobCar = new Car();
        bobCar.model = "mazda";
        bobCar.color = "red";

        Car alexCar = new Car();
        alexCar.model = "nisan";
        alexCar.color = "red";

        System.out.println(annCar.equals(bobCar));
        System.out.println(annCar.equals(alexCar));
        System.out.println("Ann's car number " + annCar.hashCode());
        System.out.println("Bob's car number " + bobCar.hashCode());
        System.out.println("Alex's car number " + alexCar.hashCode());
        System.out.println(annCar.toString());
        System.out.println(bobCar.toString());
        System.out.println(alexCar.toString());



    }
}
