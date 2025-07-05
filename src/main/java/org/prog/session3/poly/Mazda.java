package org.prog.session3.poly;

//TODO: write overloaded drive to to contain:
//TODO: - amount of passengers  def: 0
//TODO: - is payment for gas split def: no

public class Mazda implements ICar {

    public void driveTo(String destination) {

        driveTo(destination, "here and now");
    }

    public void driveTo(String destination, String from) {

        driveTo(destination, from, "nowhere");
    }

    public void driveTo(String destination, String from, String stoppingAt) {
        driveTo(destination, from, stoppingAt,0);
    }
    public void driveTo(String destination, String from, String stoppingAt, int passengers) {
        driveTo(destination, from, stoppingAt, passengers, 0);

    }
    public void driveTo(String destination, String from, String stoppingAt, int passengers, int payForGas) {
        System.out.println("Mazda drives from " + from + " to " + destination + " with " + passengers +
                " passengers, which pay " + payForGas + " $ for gas");
        System.out.println("Mazda stopping at " + stoppingAt);
    }

    public void manualGearSwitch(int gear) {
        System.out.println("Switch to " + gear);
    }

    @Override
    public void turn(String direction) {
        System.out.println("Mazda turns " + direction);
    }

    @Override
    public void accelerate() {
        System.out.println("Mazda accelerates");
    }

    @Override
    public void brake() {
        System.out.println("Mazba brakes");
    }
}
