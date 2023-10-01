package org.pvp.cse.poc.pizza.model;

import org.pvp.cse.poc.pizza.constants.CRUST;
import org.pvp.cse.poc.pizza.constants.PIZZA;
import org.pvp.cse.poc.pizza.constants.SIZE;
import org.pvp.cse.poc.pizza.constants.TYPE;

import java.util.List;

public class Pizza {
    private PIZZA name;
    private TYPE type;
    private List<Topping> toppings;
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
        //this.crust = new Crust(CRUST.WHEAT_THIN_CRUST);
        this.type=type;
        this.size = size;
    }

    /*public Pizza(PIZZA name, TYPE type, Crust crust) {
        this.name = name;
        this.type=type;
        //this.crust=crust;
        //this.type = type;
    }*/

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }
    public Crust getCrust() {
        return crust;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    /*
    public List<Topping> getToppingName() {
        return toppings;
    }
    */

    public TYPE getType() {
        return type;
    }

    /*
    public void setType(TYPE type) {
        this.type = type;
    }*/
    public void setSize(SIZE size) {
        this.size = size;
    }
}
