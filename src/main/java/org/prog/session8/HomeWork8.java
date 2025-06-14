package org.prog.session8;
//TODO: Create new Plane, set passengers, max passengers and flight id
// 1. write method that will tell how many seats are still available.
// 2. Write code which will fill plane with:
// - random max passengers from [100 to 200]
// - random passengers on board up to maxPassengers;
// - random flight id as UUID
// 3. print number of planes with half or less seats taken
import java.util.Random;
import java.util.UUID;

public class HomeWork8 {
    public static void main(String[] args) {
        Random rand = new Random();
        Plane[] newPlane = new Plane[50];
        int count = 0;


        for (int i = 0; i < newPlane.length; i++) {
            newPlane[i] = new Plane();
            newPlane[i].max = rand.nextInt(100, 200);
            newPlane[i].current = rand.nextInt(newPlane[i].max);
            newPlane[i].id = UUID.randomUUID();


            if (newPlane[i].current <= newPlane[i].max/2) {
                count++;
               }

        }
        System.out.println(count + " planes with half or less seats taken");


        for (int i = 0; i < newPlane.length; i++) {
            System.out.println("Plane " + (i+1));
            newPlane[i].freeSeats();
            System.out.println("Current passengers: " + newPlane[i].current);
            System.out.println("Max passengers: " + newPlane[i].max);
            System.out.println("Plane Id: " + newPlane[i].id);
            System.out.println("__________________________");
        }

    }
}
