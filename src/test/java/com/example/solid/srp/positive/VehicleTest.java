package com.example.solid.srp.positive;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sbiliaiev on 3/4/2018.
 */
public class VehicleTest {

    private FuelTank tank;
    private Vehicle vehicle;

    @Before
    public void setup() {
        tank = new FuelTank(15);
        vehicle = new Vehicle(tank);
        tank.reFuel();
    }

    @Test
    public void testAccelerate() {
        int expected = tank.getMax() - 2;

        vehicle.accelerate();
        vehicle.accelerate();

        Assert.assertEquals(expected, tank.getRemaining());
    }

    @Test
    public void testRemaining() {
        int expected = 25;
        vehicle.setRemainingFuel(expected);
        Assert.assertEquals(expected, vehicle.getRemainingFuel());
    }

    @Test
    public void testReFuel() {
        vehicle.accelerate();
        vehicle.accelerate();
        vehicle.accelerate();
        vehicle.accelerate();
        tank.reFuel();
        Assert.assertEquals(15, tank.getMax());
    }
}
