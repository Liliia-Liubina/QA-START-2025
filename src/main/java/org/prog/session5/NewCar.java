package org.prog.session5;

public class NewCar {

    public String color;
    public String model;

    public NewCar(String model, String color) {
        this.model=model;
        this.color=color;
    }

    @Override
    public String toString() {
        return color + " " + model;
    }

}
