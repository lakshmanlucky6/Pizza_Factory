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
    for (Pizza pizza : order.getPizzas()) {
      costs = costs + menu.getPizzaCost(pizza.getName(), pizza.getSize());
      for (Topping topping : pizza.getToppings()) {
        costs = costs + menu.getToppingCost(topping.getName());
      }
      costs = costs + menu.getCrustCost(pizza.getCrust().getCrustName());
    }
    for (Side side : order.getSides()) { // TODO : sides
      costs = costs + menu.getSideCost(side.getName(), side.getQty());
    }
    //condition to be placed in case of crust is not specified
    return costs;
  }
}
