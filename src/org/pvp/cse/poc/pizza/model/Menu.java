package org.pvp.cse.poc.pizza.model;

import org.pvp.cse.poc.pizza.constants.SIZE;

import java.util.*;
import java.util.stream.Collectors;

public class Menu {
  Map<String, Double> vegToppingMap = new LinkedHashMap<>();
  Map<String, Double> nonVegToppingMap = new LinkedHashMap<>();
  Map<String, Double> crustMap = new LinkedHashMap<>();
  Map<String, Double> sidesMap = new LinkedHashMap<>();
  Map<String, Map<String, Double>> vegPizzaMap = new LinkedHashMap<>();
  Map<String, Map<String, Double>> nonVegPizzaMap = new LinkedHashMap<>();

  public Menu() {
    Map<String, Double> cost1 = new LinkedHashMap<>();
    cost1.put("Small", 150.0);
    cost1.put("Medium", 200.0);
    cost1.put("Large", 325.0);
    vegPizzaMap.put("Deluxe pizza", cost1);
    Map<String, Double> cost2 = new LinkedHashMap<>();
    cost2.put("Small", 175.0);
    cost2.put("Medium", 375.0);
    cost2.put("Large", 475.0);
    vegPizzaMap.put("Cheese and Corn", cost2);
    Map<String, Double> cost3 = new LinkedHashMap<>();
    cost3.put("Small", 160.0);
    cost3.put("Medium", 290.0);
    cost3.put("Large", 340.0);
    vegPizzaMap.put("Panner Tikka", cost3);
  }

  public double getPizzaCost(String name, SIZE size) {
    return 0.0;
  }

  public double getSidesCost(String name, int qty) {
    return 0.0;
  }

  public double getToppingCost(List<Topping> toppingName) {
    double cost = 0.0;
    for (int i = 0; i < toppingName.size(); i++) {
      cost = cost + toppingName.get(i).getToppingCost();
    }
    return cost;
  }

  String getAllVegPizzas() {
    System.out.println("1 : Deliv, 2. 3");
    return "";
  }

  String getAllNonPizzas() {
    System.out.println("1 : Deliv, 2. 3");
    return "";
  }

  public String getAvailableVegPizzas() {
    Map<String, Map<String, Double>> veg = new LinkedHashMap<>();
    Map<String, Double> cost1 = new LinkedHashMap<>();
    cost1.put("Small", 150.0);
    cost1.put("Medium", 200.0);
    cost1.put("Large", 325.0);
    veg.put("Deluxe pizza", cost1);
    Map<String, Double> cost2 = new LinkedHashMap<>();
    cost2.put("Small", 175.0);
    cost2.put("Medium", 375.0);
    cost2.put("Large", 475.0);
    veg.put("Cheese and Corn", cost2);
    Map<String, Double> cost3 = new LinkedHashMap<>();
    cost3.put("Small", 160.0);
    cost3.put("Medium", 290.0);
    cost3.put("Large", 340.0);
    veg.put("Panner Tikka", cost3);
    // Write code to return Name of pizza
    String collect = vegPizzaMap.keySet().stream().collect(Collectors.joining(","));

    return collect;
  }

  public String displayVegTop() {
    Map<String, Double> vegtop = new LinkedHashMap<>();
    vegtop.put("Black olive", 20.0);
    vegtop.put("Capsicum", 25.0);
    vegtop.put("Paneer", 35.0);
    vegtop.put("Mushroom", 30.0);
    vegtop.put("Fresh tomato ", 10.0);
    return "";
  }

  public String displayNVegPizza() {
    Map<String, Map<String, Double>> nveg = new LinkedHashMap<>();
    Map<String, Double> cost1 = new LinkedHashMap<>();
    cost1.put("Small", 190.0);
    cost1.put("Medium", 325.0);
    cost1.put("Large", 425.0);
    nveg.put("Non-Veg Supreme", cost1);
    Map<String, Double> cost2 = new LinkedHashMap<>();
    cost2.put("Small", 175.0);
    cost2.put("Medium", 375.0);
    cost2.put("Large", 475.0);
    nveg.put("Chicken Tikka", cost2);
    Map<String, Double> cost3 = new LinkedHashMap<>();
    cost3.put("Small", 220.0);
    cost3.put("Medium", 380.0);
    cost3.put("Large", 525.0);
    nveg.put("Pepper Barbeque Chicken", cost3);
    return "";
  }

  public String displayNvegTop() {
    Map<String, Double> nvegtop = new LinkedHashMap<>();
    nvegtop.put("Chicken tikka", 35.0);
    nvegtop.put("Barbeque chicken", 45.0);
    nvegtop.put("Grilled chicken", 40.0);
    return "";
  }

  public String displayCrust() {
    Map<String, Double> crust = new LinkedHashMap<>();
    crust.put("New hand tossed", 25.0);
    crust.put("Wheat thin crust", 25.0);
    crust.put("Cheese Burst", 25.0);
    crust.put("Fresh pan pizza", 25.0);
    return "";
  }

  public String displaySides() {
    Map<String, Double> side = new LinkedHashMap<>();
    side.put("Cold drink", 55.0);
    side.put("Mousse cake", 90.0);
    return "";
  }
}
