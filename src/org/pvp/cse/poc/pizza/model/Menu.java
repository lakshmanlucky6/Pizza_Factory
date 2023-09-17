package org.pvp.cse.poc.pizza.model;
import org.pvp.cse.poc.pizza.constants.SIZE;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Menu {
    Map <String, Map <String,Double> > veg = new LinkedHashMap<>();
    Map<String,Double>vegtop = new LinkedHashMap<>();
    Map <String, Map <String,Double> > nveg = new LinkedHashMap<>();
    Map<String,Double>nvegtop = new LinkedHashMap<>();
    Map<String,Double>crust = new LinkedHashMap<>();
    Map<String,Double>side = new LinkedHashMap<>();
    Menu(){
        Map <String,Double> cost1 = new LinkedHashMap<>();
        cost1.put("Small",150.0);
        cost1.put("Medium",200.0);
        cost1.put("Large",325.0);
        veg.put("Deluxe pizza",cost1);
        Map <String,Double> cost2 = new LinkedHashMap<>();
        cost2.put("Small",175.0);
        cost2.put("Medium",375.0);
        cost2.put("Large",475.0);
        veg.put("Cheese and Corn",cost2);
        Map<String,Double>cost3=new LinkedHashMap<>();
        cost3.put("Small",160.0);
        cost3.put("Medium",290.0);
        cost3.put("Large",340.0);
        veg.put("Panner Tikka",cost3);
        vegtop.put("Black olive",20.0);
        vegtop.put("Capsicum",25.0);
        vegtop.put("Paneer",35.0);
        vegtop.put("Mushroom",30.0);
        vegtop.put("Fresh tomato ",10.0);
        Map <String,Double> costsize1 = new LinkedHashMap<>();
        cost1.put("Small",190.0);
        cost1.put("Medium",325.0);
        cost1.put("Large",425.0);
        nveg.put("Non-Veg Supreme",cost1);
        Map <String,Double> costsize2 = new LinkedHashMap<>();
        cost2.put("Small",175.0);
        cost2.put("Medium",375.0);
        cost2.put("Large",475.0);
        nveg.put("Chicken Tikka",cost2);
        Map<String,Double>costsize3=new LinkedHashMap<>();
        cost3.put("Small",220.0);
        cost3.put("Medium",380.0);
        cost3.put("Large",525.0);
        nveg.put("Pepper Barbeque Chicken",cost3);
        nvegtop.put("Chicken tikka",35.0);
        nvegtop.put("Barbeque chicken",45.0);
        nvegtop.put("Grilled chicken",40.0);
        crust.put("New hand tossed",0.0);
        crust.put("Wheat thin crust",0.0);
        crust.put("Cheese Burst",0.0);
        crust.put("Fresh pan pizza",0.0);
        side.put("Cold drink", 55.0);
        side.put("Mousse cake",90.0);
    }
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
    public void displayVegPizza(){
        Set<String> keys=veg.keySet();
        for(String i : keys){
            System.out.println(i);
        }
    }
    public void displayVegTop(){
        Map<String,Double>vegtop = new LinkedHashMap<>();
            vegtop.put("Black olive",20.0);
            vegtop.put("Capsicum",25.0);
            vegtop.put("Paneer",35.0);
            vegtop.put("Mushroom",30.0);
            vegtop.put("Fresh tomato ",10.0);
    }

    public void displayNVegPizza(){
        Map <String, Map <String,Double> > nveg = new LinkedHashMap<>();
            Map <String,Double> cost1 = new LinkedHashMap<>();
                cost1.put("Small",190.0);
                cost1.put("Medium",325.0);
                cost1.put("Large",425.0);
        nveg.put("Non-Veg Supreme",cost1);
            Map <String,Double> cost2 = new LinkedHashMap<>();
                cost2.put("Small",175.0);
                cost2.put("Medium",375.0);
                cost2.put("Large",475.0);
        nveg.put("Chicken Tikka",cost2);
            Map<String,Double>cost3=new LinkedHashMap<>();
                cost3.put("Small",220.0);
                cost3.put("Medium",380.0);
                cost3.put("Large",525.0);
        nveg.put("Pepper Barbeque Chicken",cost3);
    }
    public void displayNvegTop(){

    }

    public void displayCrust(){

    }

    public void displaySides(){

    }
}
