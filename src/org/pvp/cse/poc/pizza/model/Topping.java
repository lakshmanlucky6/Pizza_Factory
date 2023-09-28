package org.pvp.cse.poc.pizza.model;

import org.pvp.cse.poc.pizza.constants.TYPE;

public class Topping {
    private String name;
    private TYPE type;
    public Topping(String name, TYPE type) {
        this.name=name;
        this.type=type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public double getToppingCost() {
        return 0.0;
    }
}
