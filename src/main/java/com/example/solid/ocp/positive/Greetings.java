package com.example.solid.ocp.positive;

/**
 * Created by sbiliaiev on 3/4/2018.
 */
public class Greetings {

    private IGreetingType greetingType;

    public Greetings(IGreetingType greetingType) {
        this.greetingType = greetingType;
    }

    public String greeting() {
        return greetingType.greet();
    }
}
