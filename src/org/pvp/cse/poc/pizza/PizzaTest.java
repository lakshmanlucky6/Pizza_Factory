
package org.pvp.cse.poc.pizza;

import org.pvp.cse.poc.pizza.constants.SIZE;
import org.pvp.cse.poc.pizza.inventory.Inventory;
import org.pvp.cse.poc.pizza.model.Menu;
import org.pvp.cse.poc.pizza.model.Order;
import org.pvp.cse.poc.pizza.model.Pizza;
import java.util.List;


import javax.print.attribute.standard.Sides;
import java.util.Map;
import java.util.Scanner;//public void select(){

public class PizzaTest {
    public static void main(String[] args) {
        System.out.println("Welcome to PizzaFactory!");
        Menu menu = null;
        //TODO: Initialize inventory Load from Memory ( It is a Map)
        //inventory.loadInventory();

        //TODO: Display menu ( Menu - Delux Pizza & Regular along with Toppings)
        displayMenuTouser(menu);

        //TODO: Take order from user (Order)
        Order order = takeOrder();

        //TODO: Validate  ( Business rules ) + check stock
        validateBusinessRules();

        //if (inventory.checkInventory()) {
        //TODO: place order
        //placeOrder();
        //}
        //inventory.updateInventory();
        //TODO: Update the stock


    }

    private static void validateBusinessRules() {
        // Toppings
        //TODO: BusinessRules teja
        //TODO: BusinessRules deekshitha
    }

    private static void placeOrder(List<Pizza> pizzas, List<Sides> sides) {
        // thank you
        // Reference
        //TODO: deekshitha
        int flag=0;
        Inventory inventory = new Inventory();
        for (Pizza pizza : pizzas) {
            if (!inventory.checkPizzaInventory(pizza.getName(), pizza.getSize(), 1)) {
                System.out.println(pizza.getName() + "not available");
                flag=1;
            }
        }
        if(flag==1){
            //asking the user
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Cook your PIZZERIA here!!");
        while (true) {
            //System.out.println("1.Veg\n2.Non-veg");
            System.out.print("SELECT THE TYPE ?");

        }
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
    }

        //return null;
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

