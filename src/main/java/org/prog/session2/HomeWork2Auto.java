package org.prog.session2;

public class HomeWork2Auto {


    public static void main(String[] args) {
        CarService2 carService2 = new CarService2();

        CarHome car1 = new CarHome();
        CarHome car2 = new CarHome();
        CarHome car3 = new CarHome();

        carService2.paintCar(car1, null);
        carService2.paintCar(car2, "blue");
        carService2.paintCar(car3, "green");
        System.out.println("Car painted in " + car1.color + " color");


        CarPainter2 carPainter2 = new CarPainter2();

        carPainter2.polishCars(car1,"red");
        carPainter2.polishCars(car2,"blue");
        carPainter2.polishCars(car3,"green");


    }
}
