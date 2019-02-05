package com.example.solid.srp.positive;

/**
 * Created by sbiliaiev on 3/1/2018.
 */
public class Vehicle {

    private FuelTank tank;
    private int speed;

    public Vehicle(final FuelTank tank) {
        this.tank = tank;
    }

    public int getMaxFuel() {
        return tank.getMax();
    }

    public int getRemainingFuel() {
        return tank.getRemaining();
    }

    public void setRemainingFuel(int remainingFuel) {
        tank.setRemaining(remainingFuel);
    }

    public void accelerate() {
        tank.expenditure(1);
        speed++;
    }
}
