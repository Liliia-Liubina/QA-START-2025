package org.prog;

public class Plane {

    public int passengers;
    public String id;


    public void delay(int amount) {
        System.out.println("The plane " + id + " is delayed for " + amount + " hours" );
    }

    public void toFly() {System.out.println(passengers + " passengers are flying on the plane");}


}
