package org.pvp.cse.poc.pizza.model;

import org.pvp.cse.poc.pizza.constants.SIDE;

public class Side {
    private SIDE name;
    private int qty;

    public Side(SIDE name, int qty){
        this.name=name;
        this.qty=qty;
    }
    public SIDE getName() {
        return name;
    }
    public int getQty() {
        return qty;
    }

    @Override
    public String toString() {
        return "Side{" +
                "name=" + name.valueOf() +
                ", qty=" + qty +
                '}';
    }
}
