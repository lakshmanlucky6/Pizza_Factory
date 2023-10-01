package org.pvp.cse.poc.pizza.model;

import org.pvp.cse.poc.pizza.constants.TOPPING;
import org.pvp.cse.poc.pizza.constants.TYPE;

public class Topping {
    private TOPPING name;
    private TYPE type;
    public Topping(TOPPING name, TYPE type) {
        this.name=name;
        this.type=type;
    }

    public TOPPING getName() {
        return name;
    }
    public TYPE getType() {
        return type;
    }
   /* public double getToppingCostIndividually() {
        return new Menu().getToppingCost(name);
    }*/
}
