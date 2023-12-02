package org.pvp.cse.poc.pizza.model;

import javafx.beans.property.SimpleListProperty;

import java.util.ArrayList;
import java.util.List;

public class Order { // TODO : setter/getter access modifier
    public List<Pizza> pizzas;
    public List<Side> sides;
    public List<Crust> crust;
    public Order(){
        pizzas = new ArrayList<>();
        sides = new ArrayList<>();
        crust = new ArrayList<>(1);
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
