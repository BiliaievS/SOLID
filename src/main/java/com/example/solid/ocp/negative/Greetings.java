package com.example.solid.ocp.negative;

import static com.example.solid.ocp.negative.GreetingType.*;

/**
 * Created by sbiliaiev on 3/4/2018.
 */
public class Greetings {

    private GreetingType type;

    public void setType(GreetingType type) {
        this.type = type;
    }

    public String greeting() {
        switch (type) {
            case FORMAL:
                return "Good evening, sir.";
            case CASUAL:
                return "What's up mate?";
            case LOVE:
                return "Hello Darling!";
            default:
                return "Hello.";
        }
    }
}
