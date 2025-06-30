package org.prog.session2;

//TODO: 1 add method to polish cars
//TODO: 2. Polish method must print "polishing + color of car"
public class CarPainter2 {

    public void polishCars(CarHome carToPolish, String newCarColor) {
        carToPolish.color = newCarColor;
        System.out.println("polishing " + newCarColor + " car");
    }


}
