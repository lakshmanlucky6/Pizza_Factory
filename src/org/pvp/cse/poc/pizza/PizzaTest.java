package org.pvp.cse.poc.pizza;

import org.pvp.cse.poc.pizza.constants.SIZE;
import org.pvp.cse.poc.pizza.inventory.Inventory;
import org.pvp.cse.poc.pizza.model.Menu;
import org.pvp.cse.poc.pizza.model.Order;
import org.pvp.cse.poc.pizza.model.Pizza;

public class PizzaTest {
    public static void main(String[] args) {
        System.out.println("Welcome to PizzaFactory!");
        Inventory inventory = null;
        Menu menu = null;
        //TODO: Initialize inventory Load from Memory ( It is a Map)
        inventory.loadInventory();

        //TODO: Display menu ( Menu - Delux Pizza & Regular along with Toppings)
        displayMenuTouser(menu);

        //TODO: Take order from user (Order)
        Order order = takeOrder();

        //TODO: Validate  ( Business rules ) + check stock
        validateBusinessRules();

        if (inventory.checkInventory()) {
            //TODO: place order
            placeOrder();
        }
        inventory.updateInventory();
        //TODO: Update the stock


    }

    private static void validateBusinessRules() {
        // Toppings
        //TODO: BusinessRules teja
        //TODO: BusinessRules deekshitha
    }

    private static void placeOrder() {
        // thank you
        // Reference
        //TODO: deekshitha

    }

    private static void displayMenuTouser(Menu menu) {
        System.out.println();
    }

    private static Order takeOrder() {
        return null;
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
}
