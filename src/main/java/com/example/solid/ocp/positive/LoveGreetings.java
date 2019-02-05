package com.example.solid.ocp.positive;

/**
 * Created by sbiliaiev on 3/4/2018.
 */
public class LoveGreetings implements IGreetingType {
    @Override
    public String greet() {
        return "Hello Darling!";
    }
}
