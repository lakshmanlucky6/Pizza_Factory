package org.pvp.cse.poc.pizza.model;

import org.pvp.cse.poc.pizza.constants.SIZE;
import org.pvp.cse.poc.pizza.constants.TYPE;

import java.util.List;

public class Pizza {
    private final String name;
    private TYPE type;
    private List<Topping> topping;
    private Crust crust;
    private SIZE size;

    public Double getPizzaCost(String name,SIZE size) {
        return 0.0;
    }

    public String getName() {
        return name;
    }

    public SIZE getSize() {
        return size;
    }

    public Pizza(String name, TYPE type, SIZE size) {
        this.name = name;
        this.crust = new Crust("Hand Toss");
    }

    public Pizza(String name, String type, Crust crust) {
        this.name = name;
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
