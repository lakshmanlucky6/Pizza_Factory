package org.pvp.cse.poc.pizza.model;

import org.pvp.cse.poc.pizza.constants.CRUST;
import org.pvp.cse.poc.pizza.constants.PIZZA;
import org.pvp.cse.poc.pizza.constants.SIZE;
import org.pvp.cse.poc.pizza.constants.TYPE;

import java.util.List;

public class Pizza {
    private final PIZZA name;
    private TYPE type;
    private List<Topping> topping;
    private Crust crust;
    private SIZE size;

    public Double getPizzaCost(PIZZA name,SIZE size) {
        return 0.0;
    }

    public PIZZA getName() {
        return name;
    }

    public SIZE getSize() {
        return size;
    }

    public Pizza(PIZZA name, TYPE type, SIZE size) {
        this.name = name;
        this.crust = new Crust(CRUST.WHEAT_THIN_CRUST);
    }

    public Pizza(PIZZA name, TYPE type, Crust crust) {
        this.name = name;
        this.type=type;
        this.crust=crust;
        //this.type = type;
    }

    public List<Topping> getTopping() {
        return topping;
    }

    public void setTopping(List<Topping> topping) {
        this.topping = topping;
    }


    public Crust getCrust() {
        return crust;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    public List<Topping> getToppingName() {
        return topping;
    }
}
