package org.pvp.cse.poc.pizza.model;

import org.pvp.cse.poc.pizza.constants.TYPE;

public class Topping {
    String name;
    TYPE type;
    public Topping(String name, TYPE type) {
        this.name=name;
        this.type=type;
    }

    public double getToppingCost() {
        return 0.0;
    }
}
