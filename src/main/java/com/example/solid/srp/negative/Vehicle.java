package com.example.solid.srp.negative;

/**
 * Created by sbiliaiev on 3/1/2018.
 */
public class Vehicle {

    private final int maxFuel;
    private int remainingFuel;
    private int speed;

    public Vehicle(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    // this is not a car's responsibility.
    public void reFuel() {
        remainingFuel = maxFuel;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public void setRemainingFuel(final int remainingFuel) {
        this.remainingFuel = remainingFuel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate() {
        remainingFuel--;
        if (remainingFuel <= 0) {
            throw new IllegalStateException("Empty tank, please go to the fuel station.");
        }
        speed++;
    }
}
