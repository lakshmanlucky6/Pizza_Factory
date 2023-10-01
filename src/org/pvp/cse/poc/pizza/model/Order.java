package org.pvp.cse.poc.pizza.model;

import java.util.List;

public class Order { // TODO : setter/getter access modifier
    public List<Pizza> pizzas;
    public List<Side> sides;
    Menu menu;

    public Order(List<Pizza> pizzas, List<Side> sides) {
        this.pizzas = pizzas;
        this.sides = sides;
    }

    public double cost(){
        double costs=0.0;
        for(int i=0;i<pizzas.size();i++){
            //costs=costs+menu.getPizzaCost(pizzas.get(i).getName(),pizzas.get(i).getSize());
           // costs=costs+menu.getToppingCost(pizzas.get(i).getToppingName());
        }
        for(int i=0;i<sides.size();i++){
          //  costs=costs+menu.getSideCost(sides.get(i).getName(),sides.get(i).getQty());
        }
        return costs;
    }

    //menu
    // List of Pizzas
    //List of Sides
   /* System.out.println("Welcome to pizza factory");
    System.out.println("Give your order:");
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    switch (k){
        case 1:
            System.out.println("veg pizza");
            break;
        case 2:
            System.out.println("non veg pizza");
            break;
    }*/

}
