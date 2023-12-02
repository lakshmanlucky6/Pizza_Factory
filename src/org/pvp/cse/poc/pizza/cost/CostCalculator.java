package org.pvp.cse.poc.pizza.cost;

import org.pvp.cse.poc.pizza.constants.CRUST;
import org.pvp.cse.poc.pizza.model.*;

public class CostCalculator {
  Menu menu = new Menu();
  Order order = new Order();

  public CostCalculator(Order order) {
    this.order = order;
    menu = new Menu();
  }

  public Double cost() {
    double costs = 0.0;
    for (Pizza pizza : order.pizzas) {
      costs = costs + menu.getPizzaCost(pizza.getName(), pizza.getSize());
      for (Topping topping : pizza.getToppings()) {
        costs = costs + menu.getToppingCost(topping.getName());
      }
      //costs=costs+menu.getCrpizza.getCrust()
    }
    for (Side side : order.sides) { // TODO : sides
      costs = costs + menu.getSideCost(side.getName(), side.getQty());
    }
    //condition to be placed in case of crust is not specified
    for (Crust crust : order.crust) {
      costs = costs + menu.getCrustCost(crust.getCrustName());
    }
    return costs;
  }
}
