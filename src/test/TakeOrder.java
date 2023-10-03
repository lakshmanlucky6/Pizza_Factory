package test;

import org.pvp.cse.poc.pizza.PizzaTest;
import org.pvp.cse.poc.pizza.model.Order;

public class TakeOrder {
  public static void main(String[] args) {
    Order order = PizzaTest.takeOrder();
    System.out.println(order);
  }
}
