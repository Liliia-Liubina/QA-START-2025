package org.prog.session2;

//TODO: Add polish car step to painting process
public class CarService2 {

    public void paintCar(CarHome carToPaint,String newCarColor) {
        if (newCarColor == null) {
            carToPaint.color = "black";
        } else {

        carToPaint.color = newCarColor;
        System.out.println("Car painted color: " + carToPaint.color);
    }
    }




}
