package org.pvp.cse.poc.pizza;

import org.pvp.cse.poc.pizza.constants.*;
import org.pvp.cse.poc.pizza.exception.ToppingException;
import org.pvp.cse.poc.pizza.inventory.Inventory;
import org.pvp.cse.poc.pizza.model.*;
import org.pvp.cse.poc.pizza.validator.IValidator;
import org.pvp.cse.poc.pizza.validator.PizzaValidator;

import java.util.ArrayList;
import java.util.List;

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

    // TODO: deekshitha
    boolean pizzasAvailale = true;
    Inventory inventory = new Inventory();
    for (Pizza pizza : order.pizzas) {
      if (!inventory.checkPizza(pizza.getName(), pizza.getSize(), 1)) {
        System.out.println(pizza.getName() + "not available");
        pizzasAvailale = false;
        break; //break it or ask the user about that particular not available item by exeption usage or other
      }
    }
    if (!pizzasAvailale) {
      // asking the user ,better to use exceptions handling
      return;
    }
    boolean sidesAvailable = true;
    for (Side side : order.sides) {
      if (!inventory.checkSide(side.getName(), side.getQty())) {
        System.out.println(side.getName() + "not available");
        sidesAvailable = false;
        break; //break it or ask the user about that particular not available item by exeption usage or other
      }
    }
    if (!sidesAvailable) {
      // asking the user ,better to use exceptions handling
      return;
    }

    System.out.println("BILL:" + order.cost()); // User Menu to get the total cost
    System.out.println("------------Thank you------------");
  }

  private static void displayMenuTouser(Menu menu) {
    System.out.println("Displaying all the items");
  }

  public static Order takeOrder() {
    Menu menu = new Menu();
    Order order = new Order();
    Scanner sc = new Scanner(System.in);
    List<Pizza> pizzaList = null; // create object and assign
    Pizza pizza;
    System.out.println("Cook your PIZZERIA here!!");
    int needMore;
    do {
      System.out.print("SELECT THE TYPE ? ");
      // TODO : Deekshi use TYPE enum
      System.out.println("Veg or Non-Veg");
      String pizzaTypeStringName = sc.nextLine();
      String pizzaName;
      String size;
      TYPE pizzaTypeEnumName = TYPE.nameOf(pizzaTypeStringName);// change name =>
      if (pizzaTypeEnumName == TYPE.VEG) { // pizzaTypeInt == TYPE.VEG
        System.out.println(menu.getAvailableVegPizzas());
        System.out.println("Enter the pizza name ");
        pizzaName = sc.nextLine();
        System.out.println("Enter the size Regular Medium Large");
        size = sc.next();
        pizza = new Pizza(PIZZA.nameOf(pizzaName), TYPE.VEG, SIZE.nameOf(size));
      } else {
        System.out.println(menu.getAvailableNonVegToppings());
        pizzaName = sc.next();
        size = sc.next();
        pizza = new Pizza(PIZZA.nameOf(pizzaName), TYPE.NON_VEG, SIZE.nameOf(size));
      }
      System.out.println("any specification crust required 1 -> yes  0->no");

      int crustNeed = sc.nextInt();
      if (crustNeed == 1) {      /* mandatory or not */
        System.out.println(menu.getAvailableCrusts());
        String crust = sc.nextLine();
        pizza.setCrust(new Crust(CRUST.valueOf(crust)));
      }

      List<Topping> toppingsList = new ArrayList<>();
      System.out.println("any specification toppings if any enter 0 or more ;");
      //TODO: How to read boolean values form user to boolean variables
      int toppingNeedStatus = sc.nextInt();
      TYPE toppingTypeName;
      TOPPING toppingName;
      Topping topping;

      while (toppingNeedStatus != 0) {
        System.out.println("VEG or NON_VEG");
        String toppingTypeStringName = sc.next();
        toppingTypeName = TYPE.nameOf(toppingTypeStringName);
        if (toppingTypeName == TYPE.VEG) {
          System.out.println(menu.getAvailableVegToppings());
        } else {
          System.out.println(menu.getAvailableNonVegToppings());
        }
          toppingName = TOPPING.nameOf(sc.next());
          topping = new Topping(toppingName, toppingTypeName);
          toppingsList.add(topping);

          System.out.println("Do you need one more topping 1->yes , 0->no");
        toppingNeedStatus = sc.nextInt();
      }
      pizza.setToppings(toppingsList);
      pizzaList.add(pizza);
      System.out.println("Enter 1 to add another pizza,0 to place your order");
      needMore=sc.nextInt();
    }while(needMore==1);
    order.pizzas=pizzaList;
    order.sides=null;
    return order;
  }
}

