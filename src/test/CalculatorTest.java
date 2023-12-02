package test;

import org.pvp.cse.poc.pizza.constants.*;
import org.pvp.cse.poc.pizza.cost.CostCalculator;
import org.pvp.cse.poc.pizza.model.Crust;
import org.pvp.cse.poc.pizza.model.Order;
import org.pvp.cse.poc.pizza.model.Pizza;
import org.pvp.cse.poc.pizza.model.Topping;

import java.util.Arrays;

public class CalculatorTest {
    public static void main(String[] args){
        testCost();
    }

  public static void testCost() {
    Order order = new Order();
    Pizza pizza = new Pizza(PIZZA.DELUXE_VEGGIE, TYPE.VEG, SIZE.REGULAR);
    pizza.setCrust(new Crust(CRUST.WHEAT_THIN_CRUST));
    Topping topping = new Topping(TOPPING.BLACK_OLIVE, TYPE.VEG);
    pizza.addTopping(topping);
    order.setPizzas(Arrays.asList(pizza));
    CostCalculator costCalculator = new CostCalculator(order);
    // testing cost()
    Double cost = costCalculator.cost();
    if (cost.equals(195.0)) {
      System.out.println("Passed");
    } else {
      System.out.println("failed");
    }
  }


}
