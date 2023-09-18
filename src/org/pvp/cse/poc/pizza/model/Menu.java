
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
    //loading veg pizza contents
    Map<SIZE, Double> cost = new LinkedHashMap<>();
    cost.put(SIZE.REGULAR, 150.0);
    cost.put(SIZE.MEDIUM, 200.0);
    cost.put(SIZE.LARGE, 325.0);
    vegPizzaMap.put(PIZZA.DELUXE_VEGGIE, cost);
    cost.clear();
    cost.put(SIZE.REGULAR, 175.0);
    cost.put(SIZE.MEDIUM, 375.0);
    cost.put(SIZE.LARGE, 475.0);
    vegPizzaMap.put(PIZZA.CHEESE_AND_CORN, cost);
    cost.clear();
    cost.put(SIZE.REGULAR, 160.0);
    cost.put(SIZE.MEDIUM, 290.0);
    cost.put(SIZE.LARGE, 340.0);
    vegPizzaMap.put(PIZZA.PANEER_TIKKA, cost);
    cost.clear();

    //loading non veg pizza contents
    cost.put(SIZE.REGULAR, 190.0);
    cost.put(SIZE.MEDIUM, 325.0);
    cost.put(SIZE.LARGE, 425.0);
    nonVegPizzaMap.put(PIZZA.NON_VEG_SUPREME, cost);
    cost.clear();
    cost.put(SIZE.REGULAR, 175.0);
    cost.put(SIZE.MEDIUM, 375.0);
    cost.put(SIZE.LARGE, 475.0);
    nonVegPizzaMap.put(PIZZA.CHICKEN_TIKKA, cost);
    cost.clear();
    cost.put(SIZE.REGULAR, 220.0);
    cost.put(SIZE.MEDIUM, 380.0);
    cost.put(SIZE.LARGE, 525.0);
    nonVegPizzaMap.put(PIZZA.PEPPER_BARBECUE_CHICKEN, cost);
    cost.clear();

    //loading veg toppings
    vegToppingMap.put(TOPPING.BLACK_OLIVE, 20.0);
    vegToppingMap.put(TOPPING.CAPSICUM, 25.0);
    vegToppingMap.put(TOPPING.PANEER, 35.0);
    vegToppingMap.put(TOPPING.MUSHROOM, 30.0);
    vegToppingMap.put(TOPPING.FRESH_TOMATO, 10.0);

    //loading non veg toppings
    nonVegToppingMap.put(TOPPING.CHICKEN_TIKKA, 35.0);
    nonVegToppingMap.put(TOPPING.BARBEQUE_CHICKEN, 45.0);
    nonVegToppingMap.put(TOPPING.GRILLED_CHICKEN, 40.0);

    //loading crust details
    crustMap.put(CRUST.NEW_HAND_TOSSED, 25.0);
    crustMap.put(CRUST.WHEAT_THIN_CRUST, 25.0);
    crustMap.put(CRUST.CHEESE_BURST, 25.0);
    crustMap.put(CRUST.FRESH_PAN_PIZZA, 25.0);

    //loading sides details
    sidesMap.put(SIDE.COLD_DRINK, 55.0);
    sidesMap.put(SIDE.MOUSSE_CAKE, 90.0);
  }

  public String getAvailableVegPizzas() {
    // Write code to return Name of pizza
    //String vegpizzas = vegPizzaMap.entrySet().stream().map(PIZZA::valueOf).collect(Collectors.joining(","));
    String vegpizzas = vegPizzaMap.entrySet().stream().map(pizzaMapEntry -> pizzaMapEntry.getKey().valueOf());
    return vegpizzas;
  }

  public String getAvailableNonVegPizzas() {
    // Write code to return Name of non veg pizza
    String nonvegpizzas = nonVegPizzaMap.keySet().stream().map(PIZZA::valueOf).collect(Collectors.joining(","));
    return nonvegpizzas;
  }

  public String getAvailableVegToppings() {
     String vegtoppings = vegToppingMap.keySet().stream().collect(Collectors.joining(","));
     return vegtoppings;
  }

  public String getAvailableNonVegToppings() {
    String nonvegtoppings = nonVegToppingMap.keySet().stream().collect(Collectors.joining(","));
    return nonvegtoppings;
  }

  public String getAvailableCrust() {
    String crust = crustMap.keySet().stream().collect(Collectors.joining(","));
    return crust;
  }

  public String getAvailableSides() {
    String sides = sidesMap.keySet().stream().collect(Collectors.joining(","));
    return sides;
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
}