package org.pvp.cse.poc.pizza.validator;

import org.pvp.cse.poc.pizza.constants.TYPE;
import org.pvp.cse.poc.pizza.exception.ToppingException;
import org.pvp.cse.poc.pizza.model.Pizza;

public class PizzaValidator implements IValidator<Pizza> {
  @Override
  public void validate(Pizza pizza) throws Exception {
    // TODO:READ throws, throw, runtime, checked exception, try, catch,finally
    // Vegetarian pizza cannot have a non--vegetarian topping
    validateTopping(pizza);
    val2(pizza);
    val3(pizza);
    val4(pizza);
  }

  /*  public void validate(Order order) throws Exception {

  }*/

  public void validateTopping(Pizza pizza) throws ToppingException {
    if (TYPE.VEG.equals(pizza.getType())) {
      if (pizza.getToppings().stream()
          .anyMatch(topping -> TYPE.NON_VEG.equals(topping.getType()))) {
        throw new ToppingException("Vegetarian pizza cannot have a non--vegetarian topping");
      }
    }
  }

  // Teja  - Non--vegetarian pizza cannot have paneer topping.
  public void val2(Pizza pizza) throws ToppingException {}

  // Deekshitha Only one type of crust can be selected for any pizza.
  public void val3(Pizza pizza) throws ToppingException {}

  // Sahithi You can add only one of the non--veg toppings in non--vegetarian pizza
  public void val4(Pizza pizza) throws ToppingException {}
}
