package org.pvp.cse.poc.pizza.model;

import javafx.beans.property.SimpleListProperty;

import java.util.ArrayList;
import java.util.List;

public class Order { // TODO : setter/getter access modifier
    private List<Pizza> pizzas;
    private List<Side> sides;

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public List<Side> getSides() {
        return sides;
    }

    public void setSides(List<Side> sides) {
        this.sides = sides;
    }

    public Order(){
        pizzas = new ArrayList<>();
        sides = new ArrayList<>();
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
