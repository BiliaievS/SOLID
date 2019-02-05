package com.example.solid.srp.positive;

/**
 * Created by sbiliaiev on 3/1/2018.
 */
public class FuelTank {

    private final int max;
    private int remaining;

    public FuelTank(int max) {
        this.max = max;
    }

    public int getMax() {
        return max;
    }

    public int getRemaining() {
        return remaining;
    }

    public void setRemaining(int remaining) {
        this.remaining = remaining;
    }

    public void reFuel() {
        setRemaining(max);
    }

    public void fillUp(int fuel) {
        if (fuel > max) {
            fuel = max;
        }
        setRemaining(fuel);
    }

    public void expenditure(int fuel) {
        int currentState = getRemaining() - fuel;
        if (currentState <= 0) {
            throw new IllegalStateException("Empty tank, please go to the fuel station.");
        }
        setRemaining(currentState);
    }
}
