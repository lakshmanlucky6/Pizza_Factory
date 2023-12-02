package test;

import org.pvp.cse.poc.pizza.PizzaTest;
import org.pvp.cse.poc.pizza.constants.*;
import org.pvp.cse.poc.pizza.exception.ToppingException;
import org.pvp.cse.poc.pizza.model.Crust;
import org.pvp.cse.poc.pizza.model.Order;
import org.pvp.cse.poc.pizza.model.Pizza;
import org.pvp.cse.poc.pizza.model.Topping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PizzaTester {

    public static void main(String[] args) throws ToppingException {

        //testDeluxeVeggie();
        testChicken();
    }

    private static void testDeluxeVeggie() throws ToppingException {
        Order order = new Order();
        Pizza pizza = new Pizza(PIZZA.DELUXE_VEGGIE, TYPE.VEG, SIZE.REGULAR);
        pizza.setCrust(new Crust(CRUST.WHEAT_THIN_CRUST));
        Topping topping = new Topping(TOPPING.BLACK_OLIVE,TYPE.VEG);
        pizza.addTopping(topping);

        order.setPizzas(Arrays.asList(pizza));

        // TODO: Validate  ( Business rules ) + check stock
        PizzaTest.validateBusinessRules(order);

        // TODO: place order
        PizzaTest.placeOrder(order);
    }

    private static void testChicken() throws ToppingException {
        Order order = new Order();
        Pizza pizza = new Pizza(PIZZA.CHICKEN_TIKKA, TYPE.NON_VEG, SIZE.REGULAR);
        pizza.setCrust(new Crust(CRUST.FRESH_PAN_PIZZA));
        Topping topping = new Topping(TOPPING.PANEER,TYPE.VEG);
        pizza.addTopping(topping);

        order.setPizzas(Arrays.asList(pizza));

        // TODO: Validate  ( Business rules ) + check stock
        PizzaTest.validateBusinessRules(order);

        // TODO: place order
        PizzaTest.placeOrder(order);
    }

}
