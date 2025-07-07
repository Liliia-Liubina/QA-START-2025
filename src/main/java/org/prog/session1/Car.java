package org.prog.session1;

import java.util.Objects;

//TODO: HW4: add String model and make equals & hashCode work by model and color
public class Car {

    public String color;
    public String destination;
    public String carName;
    public String model;

    public void goTo() {

        System.out.println(carName + " " + color + " car " + " went to " + destination);
    }


    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car car = (Car) obj;
            return this.color.equals(car.color) && this.model.equals(car.model);
           }
        return false;
    }

        @Override
    public int hashCode() {
        return Objects.hash(color, model);
    }



    @Override
    public String toString() {
        return "Car : " + color;
    }

    public String getColor() {
        return color;
    }
}