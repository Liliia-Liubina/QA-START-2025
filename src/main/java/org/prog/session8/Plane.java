package org.prog.session8;

import java.util.UUID;

public class Plane {
    public int current;
    public int max;
    public UUID id;

    public void freeSeats() {
        System.out.println((max - current) + " seats are still available on the board");
    }
}
