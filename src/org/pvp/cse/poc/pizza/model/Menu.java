package org.pvp.cse.poc.pizza.model;

import org.pvp.cse.poc.pizza.constants.SIZE;

import java.util.List;

public class Menu {
    //hello

    public double getPizzaCost(String name, SIZE size) {
        return 0.0;
    }
    public double getSidesCost(String name,int qty) {
        return 0.0;
    }

    public double getToppingCost(List<Topping> toppingName) {
        double cost=0.0;
        for(int i=0;i<toppingName.size();i++){
            cost=cost+toppingName.get(i).getToppingCost();
        }
        return cost;
    }
}
