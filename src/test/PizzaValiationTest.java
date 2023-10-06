package test;

import org.pvp.cse.poc.pizza.PizzaTest;
import org.pvp.cse.poc.pizza.constants.PIZZA;
import org.pvp.cse.poc.pizza.constants.SIZE;
import org.pvp.cse.poc.pizza.constants.TOPPING;
import org.pvp.cse.poc.pizza.constants.TYPE;
import org.pvp.cse.poc.pizza.exception.ToppingException;
import org.pvp.cse.poc.pizza.model.Order;
import org.pvp.cse.poc.pizza.model.Pizza;
import org.pvp.cse.poc.pizza.model.Topping;

import java.util.Arrays;
import java.util.Collections;

public class PizzaValiationTest {

  public static void main(String[] args) throws ToppingException {
    validateNonvegTopTestThrowException();
    validateNonvegTopTestPostive();

    // val2neg();
    // val2postive();

  }

  private static void validateNonvegTopTestPostive() throws ToppingException {
    Order order = new Order();
    Pizza pizza = new Pizza(PIZZA.DELUXE_VEGGIE, TYPE.VEG, SIZE.MEDIUM);
    Topping vegTopping = new Topping(TOPPING.CAPSICUM, TYPE.VEG);
    pizza.setToppings(Collections.singletonList(vegTopping));
    order.pizzas = Arrays.asList(pizza);
    PizzaTest.validateBusinessRules(order);
    System.out.println("place order continues .............");
  }

  private static void validateNonvegTopTestThrowException() throws ToppingException {
    Order order = new Order();
    Pizza pizza = new Pizza(PIZZA.DELUXE_VEGGIE, TYPE.VEG, SIZE.MEDIUM);
    Topping nonVegTopping = new Topping(TOPPING.CHICKEN_TIKKA, TYPE.NON_VEG);
    pizza.setToppings(Collections.singletonList(nonVegTopping));
    order.pizzas = Arrays.asList(pizza);
    PizzaTest.validateBusinessRules(order);
  }
}
