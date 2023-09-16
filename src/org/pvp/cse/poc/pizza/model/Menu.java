package org.pvp.cse.poc.pizza.model;
import org.pvp.cse.poc.pizza.constants.SIZE;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    String getAllVegPizzas(){
        System.out.println("1 : Deliv, 2. 3");
        return "";
    }

    String getAllNonPizzas(){
        System.out.println("1 : Deliv, 2. 3");
        return "";
    }


}
