package org.pvp.cse.poc.pizza.model;

import org.pvp.cse.poc.pizza.constants.*;

import java.util.*;
import java.util.stream.Collectors;

public class Menu {
  Map<PIZZA, Map<SIZE, Double>> vegPizzaMap = new LinkedHashMap<>();
  Map<TOPPING, Double> vegToppingMap = new LinkedHashMap<>();
  Map<PIZZA, Map<SIZE, Double>> nonVegPizzaMap = new LinkedHashMap<>();
  Map<TOPPING, Double> nonVegToppingMap = new LinkedHashMap<>();
  Map<CRUST, Double> crustMap = new LinkedHashMap<>();
  Map<SIDE, Double> sidesMap = new LinkedHashMap<>();

  public Menu() {
    // loading veg pizza contents
    Map<SIZE, Double> cost = new LinkedHashMap<>();
    cost.put(SIZE.REGULAR, 150.0);
    cost.put(SIZE.MEDIUM, 200.0);
    cost.put(SIZE.LARGE, 325.0);
    vegPizzaMap.put(PIZZA.DELUXE_VEGGIE, cost);
    // cost.clear();
    cost = new LinkedHashMap<>();
    cost.put(SIZE.REGULAR, 175.0);
    cost.put(SIZE.MEDIUM, 375.0);
    cost.put(SIZE.LARGE, 475.0);
    vegPizzaMap.put(PIZZA.CHEESE_AND_CORN, cost);
    // cost.clear();
    cost = new LinkedHashMap<>();
    cost.put(SIZE.REGULAR, 160.0);
    cost.put(SIZE.MEDIUM, 290.0);
    cost.put(SIZE.LARGE, 340.0);
    vegPizzaMap.put(PIZZA.PANEER_TIKKA, cost);
    cost = new LinkedHashMap<>();

    // loading non veg pizza contents
    cost.put(SIZE.REGULAR, 190.0);
    cost.put(SIZE.MEDIUM, 325.0);
    cost.put(SIZE.LARGE, 425.0);
    nonVegPizzaMap.put(PIZZA.NON_VEG_SUPREME, cost);
    cost = new LinkedHashMap<>();
    cost.put(SIZE.REGULAR, 175.0);
    cost.put(SIZE.MEDIUM, 375.0);
    cost.put(SIZE.LARGE, 475.0);
    nonVegPizzaMap.put(PIZZA.CHICKEN_TIKKA, cost);
    cost = new LinkedHashMap<>();
    cost.put(SIZE.REGULAR, 220.0);
    cost.put(SIZE.MEDIUM, 380.0);
    cost.put(SIZE.LARGE, 525.0);
    nonVegPizzaMap.put(PIZZA.PEPPER_BARBECUE_CHICKEN, cost);
    // cost.clear();

    // loading veg toppings
    vegToppingMap.put(TOPPING.BLACK_OLIVE, 20.0);
    vegToppingMap.put(TOPPING.CAPSICUM, 25.0);
    vegToppingMap.put(TOPPING.PANEER, 35.0);
    vegToppingMap.put(TOPPING.MUSHROOM, 30.0);
    vegToppingMap.put(TOPPING.FRESH_TOMATO, 10.0);

    // loading non veg toppings
    nonVegToppingMap.put(TOPPING.CHICKEN_TIKKA, 35.0);
    nonVegToppingMap.put(TOPPING.BARBEQUE_CHICKEN, 45.0);
    nonVegToppingMap.put(TOPPING.GRILLED_CHICKEN, 40.0);

    // loading crust details
    crustMap.put(CRUST.NEW_HAND_TOSSED, 25.0);
    crustMap.put(CRUST.WHEAT_THIN_CRUST, 25.0);
    crustMap.put(CRUST.CHEESE_BURST, 25.0);
    crustMap.put(CRUST.FRESH_PAN_PIZZA, 25.0);

    // loading sides details
    sidesMap.put(SIDE.COLD_DRINK, 55.0);
    sidesMap.put(SIDE.MOUSSE_CAKE, 90.0);
  }

  public String getAvailableVegPizzas() {
    // Deluxe Veggee
    // Regular : 150 , Large : 250 , Large : 300
    // Chicken tikka
    // Regular : 150 , Large : 250 , Large : 300 */

    Set<Map.Entry<PIZZA, Map<SIZE, Double>>> entrySet = vegPizzaMap.entrySet();
    StringBuilder builder = new StringBuilder();
    for (Map.Entry<PIZZA, Map<SIZE, Double>> entry : entrySet) {
      String pizza = entry.getKey().valueOf();
      builder.append(pizza); // Deluxe
      builder.append(" \n"); // Deluxe
      Map<SIZE, Double> sizeMap = entry.getValue();
      Set<Map.Entry<SIZE, Double>> sizeEntrySet = sizeMap.entrySet();
      for (Map.Entry<SIZE, Double> sizeEntry : sizeEntrySet) {
        String sizeName = sizeEntry.getKey().valueOf();
        Double sizeCost = sizeEntry.getValue();
        // Regular : 150 , Large : 250.
        builder.append(sizeName);
        builder.append(" : ");
        builder.append(sizeCost);
        builder.append(" , ");
      }
      builder.append("\n");
    }

    return builder.toString();
  }

  public String getAvailableNonVegPizzas() {
    // Write code to return Name of non veg pizza
    Set<Map.Entry<PIZZA, Map<SIZE, Double>>> entrySet=nonVegPizzaMap.entrySet();
    StringBuilder builder = new StringBuilder();
    for(Map.Entry<PIZZA, Map<SIZE, Double>> entry:entrySet){
        builder.append(entry.getKey().valueOf()+"\n");
        Set<Map.Entry<SIZE,Double>> sizeEntrySet=entry.getValue().entrySet();
        for(Map.Entry<SIZE,Double> sizeEntry:sizeEntrySet){
          builder.append(sizeEntry.getKey().valueOf()+" : "+sizeEntry.getValue()+"  , ");
        }
        builder.append("\n");
    }
    return builder.toString();
  }

  public String getAvailableVegToppings() {
    StringBuilder builder = new StringBuilder();
    Set<Map.Entry<TOPPING,Double>> entrySet=vegToppingMap.entrySet();
    //builder.append("Veg Toppings :\n");
    for(Map.Entry<TOPPING,Double> entry : entrySet){
        builder.append(entry.getKey().valueOf()+" : "+entry.getValue()+"\n");
    }
    return builder.toString();
  }

  public String getAvailableNonVegToppings() {
    StringBuilder builder = new StringBuilder();
    Set<Map.Entry<TOPPING,Double>> entrySet=nonVegToppingMap.entrySet();
    //builder.append("Non-Veg Toppings :\n");
    for(Map.Entry<TOPPING,Double> entry : entrySet){
      builder.append(entry.getKey().valueOf()+" : "+entry.getValue()+"\n");
    }
    return builder.toString();
  }

  public String getAvailableCrusts() {
    StringBuilder builder = new StringBuilder();
    Set<Map.Entry<CRUST,Double>> entrySet=crustMap.entrySet();
    //builder.append("Crusts :\n");
    for(Map.Entry<CRUST,Double> entry : entrySet){
      builder.append(entry.getKey().valueOf()+" : "+entry.getValue()+"\n");
    }
    return builder.toString();
  }

  public String getAvailableSides() {
    StringBuilder builder = new StringBuilder();
    Set<Map.Entry<SIDE,Double>> entrySet=sidesMap.entrySet();
    //builder.append("Sides :\n");
    for(Map.Entry<SIDE,Double> entry : entrySet){
      builder.append(entry.getKey().valueOf()+" : "+entry.getValue()+"\n");
    }
    return builder.toString();
  }

  public double getPizzaCost(PIZZA name, SIZE size) {
     if(vegPizzaMap.containsKey(name)){
       return vegPizzaMap.get(name).get(size);
     }else{
       return 0;
     }
  }

  public Double getSideCost(SIDE name, Integer qty) {
     return sidesMap.get(name)*qty;
  }

  public Double getToppingCost(TOPPING toppingName) {
      return vegToppingMap.getOrDefault(toppingName, 0.0);
  }
  public Double getCrustCost(CRUST crustName) {
    return  crustMap.get(crustName);
  }
  /*  public static void main(String[] args){
    Menu menu = new Menu();
    System.out.println(
    menu.getAvailableVegPizzas());
  }*/
  //todo getcrustcost;
}
