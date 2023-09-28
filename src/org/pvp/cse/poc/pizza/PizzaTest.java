package org.pvp.cse.poc.pizza;

import org.pvp.cse.poc.pizza.constants.TYPE;
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
    // inventory.loadInventory();

    // TODO: Display menu ( Menu - Delux Pizza & Regular along with Toppings)
    displayMenuTouser(menu);

    // TODO: Take order from user (Order)
    Order order = takeOrder();

    // TODO: Validate  ( Business rules ) + check stock
    validateBusinessRules(order);

    // if (inventory.checkInventory()) {
    // TODO: place order
    // placeOrder();
    // }
    // inventory.updateInventory();
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
      }finally{
        System.out.println("cleanup");
      }
    }

    // Toppings
    // TODO: BusinessRules teja
    // TODO: BusinessRules deekshitha
  }

  private static void placeOrder(List<Pizza> pizzas, List<Sides> sides) {
    // thank you
    // Reference
    // TODO: deekshitha
    int flag = 0;
    Inventory inventory = new Inventory();
    for (Pizza pizza : pizzas) {
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
    System.out.println("BILL:" + o.cost());
    System.out.println("Thank you");
  }

  private static void displayMenuTouser(Menu menu) {
    System.out.println();
  }

  private static Order takeOrder() {
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
        String pizzaname = sc.next();
       // pizza = new Pizza(pizzaname, TYPE.VEG, null);
        List<Topping> topings = new ArrayList<>();
        // pizza.add(pizza1);
        System.out.println("any specification crust toppings if any enter 1 or 0;");
        int crustInt = sc.nextInt();
        if (crustInt == 1) {
          System.out.println(menu.getAvailableCrusts());
          String crust = sc.next();
        }
        System.out.println("any specification toppings if any enter 1 or 0;");
        int toppingInt = sc.nextInt();
        if (toppingInt == 1) {
          System.out.println(menu.getAvailableVegToppings());
          String top = sc.next();
          Topping t = new Topping(top, TYPE.VEG);
          topings.add(t);
          pizza.setToppings(topings);
        }
        pizzaList.add(pizza);
      } else if (pizzaTypeInt == 2) { // pizzaTYpeInt == TYPE.NONVEG
        System.out.println(menu.getAvailableNonVegPizzas());
        // String s = sc.next();
        String pizzaname = sc.next();
        //pizza = new Pizza(pizzaname, TYPE.NON_VEG, null);
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
          Topping t = new Topping(top, TYPE.VEG);
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
    // while (false) {
    // System.out.println("1.Veg\n2.Non-veg");

    // }
    /*System.out.print("SELECT THE TYPE ?");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                //System.out.println("1.Delux pizza\n2.Cheese and Corn\n3.Panner Tikka");

                System.out.print("SELECT ONE : ");
                int in = sc.nextInt();
                switch (in) {
                    case 1:
                        System.out.println("Regular: Rs. 150  Medium: Rs. 200  Large: Rs. 325");
                        break;
                    case 2:
                        System.out.println("Regular: Rs. 175 Medium: Rs. 375 Large: Rs. 475");
                        break;
                    case 3:
                        System.out.println("Regular: Rs. 160 Medium: Rs. 290 Large: Rs. 340");
                        break;
                }
                System.out.println("SELECT THE SIZE ?");
                System.out.println("HEY VEGGY !! SELECT THE CRUST");
                System.out.println("1.New Hand Tossed\n2.Wheat thin crust\n3.Cheese Burst\n4.Fresh pan");
                // System.out.println("HEY VEGGY !! SELECT THE CRUST");
                int i = sc.nextInt();
                System.out.println("CUSTOMIZE IT WITH YOUR OWN TOPPINGS");
                System.out.println("1.Black olive (Rs 20) \n2.Capsicum (Rs 25)\n 3.Paneer (Rs 35)\n4.Mushroom (Rs 30)\n5.Fresh tomato (Rs 10)");
                break;

            case 2:
                System.out.println("1.Non-Veg Supreme\n2.Chicken Tikka\n3.Pepper Barbecue");
                System.out.print("SELECT ONE");
                int ind = sc.nextInt();
                switch (ind) {
                    case 1:
                        System.out.println("Regular: Rs 190 Medium: Rs 325 Large: Rs 425");
                        break;
                    case 2:
                        System.out.println("Regular: Rs 210 Medium: Rs 370 Large: Rs 500");
                        break;
                    case 3:
                        System.out.println("Regular: Rs 220 Medium: Rs 380 Large: Rs 525");
                        break;
                }
                System.out.println("HEY NON-VEGGY !! SELECT THE CRUST");
                System.out.println("1.New Hand Tossed\n2.Wheat thin crust\n3.Cheese Burst\n4.Fresh pan");
                //System.out.println("HEY NON-VEGGY !! SELECT THE CRUST");
                int inx = sc.nextInt();
                System.out.println("CUSTOMIZE IT WITH YOUR OWN TOPPINGS");
                System.out.println("1.Chicken tikka (Rs 35)\n2.Barbeque chicken (Rs 45)\n3.Grilled chicken (Rs 40)");
                break;

    }
    System.out.println("Need Extra cheese : ");
    System.out.println("ADD SIDE DISHES\n1.Cold drink (Rs 55)\n2.Mousse cake (Rs. 90)");*/

    //
    return order;
  }
}

/*  SIZE size = SIZE.valueOf("Medium"); // MEDIUM
Pizza p = new Pizza("","",size);
SIZE s = SIZE.MEDIUM;
 System.out.println(s);*/
    // PreparePizza (10 units of work)
    // preparedough(){
    //
    // } - unit //verify it is working as expected(function)
    // prepare crust()
    // Add sou, chilly
    // Add vegs/non veg
    // Bake it()
    // Ovenize()

    // Maven deploy code lifecycle compile test => pizza.jar
    // Jar
