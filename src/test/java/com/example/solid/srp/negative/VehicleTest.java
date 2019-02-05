package com.example.solid.srp.negative;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by sbiliaiev on 3/1/2018.
 */
public class VehicleTest {

    private Vehicle vehicle;

    @Before
    public void setup() {
        vehicle = new Vehicle(10);
    }

    @Test
    public void testAccelerate() {
        int expected = vehicle.getMaxFuel() - 2;
        int expectedSpeed = 2;

        vehicle.accelerate();
        vehicle.accelerate();

        Assert.assertEquals(expected, vehicle.getRemainingFuel());
        Assert.assertEquals(expectedSpeed, vehicle.getSpeed());
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
        vehicle.reFuel();
        Assert.assertEquals(vehicle.getMaxFuel(), vehicle.getRemainingFuel());
    }
}
