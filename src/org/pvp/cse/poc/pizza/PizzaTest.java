package org.pvp.cse.poc.pizza;

import org.pvp.cse.poc.pizza.constants.*;
import org.pvp.cse.poc.pizza.cost.CostCalculator;
import org.pvp.cse.poc.pizza.exception.ToppingException;
import org.pvp.cse.poc.pizza.inventory.Inventory;
import org.pvp.cse.poc.pizza.model.*;
import org.pvp.cse.poc.pizza.validator.IValidator;
import org.pvp.cse.poc.pizza.validator.PizzaValidator;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.Sides;
import java.util.Scanner; // public void select(){

public class PizzaTest {
  public static void main(String[] args) throws ToppingException {
    System.out.println("Welcome to PizzaFactory!");
    Menu menu = new Menu();
    // TODO: Initialize inventory Load from Memory ( It is a Map)

    // TODO: Display menu ( Menu - Delux Pizza & Regular along with Toppings)
    displayMenuTouser(menu);

    // TODO: Take order from user (Order)
    Order order = takeOrder();

    // TODO: Validate  ( Business rules ) + check stock
    validateBusinessRules(order);

    // TODO: place order
    placeOrder(order);

    // TODO: Update the stock

  }

  public static void validateBusinessRules(Order order) throws ToppingException {
    // Implement validation
    for (Pizza pizza : order.pizzas) {
      IValidator<Pizza> pizzaIValidator = new PizzaValidator();
      try {
        pizzaIValidator.validate(pizza);
      } catch (Exception e) {
        throw new ToppingException(e.getMessage());
      } finally {
        System.out.println("cleanup");
      }
    }

    // Toppings
    // TODO: BusinessRules teja
    // TODO: BusinessRules deekshitha
  }

  private static void placeOrder(Order order) {
    CostCalculator costCalculator = new CostCalculator(order);
    // thank you
    // Reference
    // TODO: deekshitha
    int flag = 0;
    Inventory inventory = new Inventory();
    for (Pizza pizza : order.pizzas) {
      // TODO: Lakshman will do this change
      if (!inventory.checkPizza(pizza.getName(), pizza.getSize(), 1)) {
        System.out.println(pizza.getName() + "not available");
        flag = 1;
      }
    }
    if (flag == 1) {
      // asking the user
      return;
    }
    Order o = new Order();
    System.out.println("BILL:" + costCalculator.cost()); // User Menu to get the total cost
    System.out.println("Thank you");
  }

  private static void displayMenuTouser(Menu menu) {
    System.out.println("Displaying all the items");
  }

  public static Order takeOrder() {
    Menu menu = new Menu();
    Order order = new Order();
    Scanner sc = new Scanner(System.in);
    List<Pizza> pizzaList = null; // create object and assign
    Pizza pizza = null;
    System.out.println("Cook your PIZZERIA here!!");
    boolean flag = true;
    do {
      System.out.print("SELECT THE TYPE ?");
      // TODO : Deekshi use TYPE enum
      System.out.println("1.VEG 2.NON_VEG");

      int pizzaTypeInt = sc.nextInt(); // change name =>
      // TYPE type = TYPE.valueOf(pizzaTypeInt) ;
      // System.out.println("You have selected: " + TYPE.valueOf(pizzaTypeInt));
      if (pizzaTypeInt == 1) { // pizzaTYpeInt == TYPE.VEG
        System.out.println(menu.getAvailableVegPizzas());
        String pizzaName = sc.next();
        String size = sc.next();
        pizza = new Pizza(PIZZA.nameOf(pizzaName), TYPE.VEG, SIZE.LARGE.nameOf(size));
        List<Topping> toppings = new ArrayList<>();
        // pizza.add(pizza1);
        System.out.println("any specification crust toppings if any enter 1 or 0;");
        int crustInt = sc.nextInt();
        if (crustInt == 1) {
          System.out.println(menu.getAvailableCrusts());
          String crust = sc.next();
          pizza.setCrust(new Crust(CRUST.valueOf(crust)));
        }
        System.out.println("any specification toppings if any enter 0 or more ;");
        int toppingInt = sc.nextInt();
        // for
        if (toppingInt == 1) {
          System.out.println(menu.getAvailableVegToppings());
          String top = sc.next();
          Topping t = new Topping(TOPPING.nameOf(top), TYPE.VEG);
          toppings.add(t);
          pizza.setToppings(toppings);
        }
        pizzaList.add(pizza);
      } else if (pizzaTypeInt == 2) { // pizzaTYpeInt == TYPE.NONVEG
        System.out.println(menu.getAvailableNonVegPizzas());
        String pizzaName = sc.next();
        String size = sc.next();
        pizza = new Pizza(PIZZA.nameOf(pizzaName), TYPE.VEG, SIZE.LARGE.nameOf(size));
        List<Topping> topings = new ArrayList<>();
        // pizza.add(pizza1);
        System.out.println("any specification crust toppings if any enter 1 or 0;");
        int crustInt = sc.nextInt();
        if (crustInt == 1) {
          System.out.println(menu.getAvailableCrusts());
          String crust = sc.next(); // create crust and assign
        }
        System.out.println("any specification toppings if any enter 1 or 0;");
        int toppingInt = sc.nextInt();
        if (toppingInt == 1) {
          System.out.println(menu.getAvailableNonVegToppings());
          String top = sc.next();
          Topping t = new Topping(TOPPING.nameOf(top), TYPE.VEG);
          topings.add(t);
          pizza.setToppings(topings);
        }
        pizzaList.add(pizza);
      } else {
        System.out.println("enter correct value ");
      }

      System.out.println("Do u want to order more enter 1 for ordering else 0");
      flag = sc.hasNextBoolean();
    } while (flag);
    return order;
  }
}
