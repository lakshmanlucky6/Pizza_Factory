package org.pvp.cse.poc.pizza.inventory;
import org.pvp.cse.poc.pizza.constants.SIZE;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    Map<String, Map<SIZE, Integer>> pizzaInventory = new HashMap<>();
    Map<String, Integer> toppingInventory = new HashMap<>();
    Map<String, Integer> sideInventory = new HashMap<>();
    Map<String, Integer> crustInventory = new HashMap<>();

    //TODO:stock availability check
    //TODO:update stock
    //TODO:Load Stock
    public Inventory() {
        //loading pizza inventory
        HashMap<SIZE, Integer> sizeMap = new HashMap<>();
        sizeMap.put(SIZE.REGULAR, 100);
        sizeMap.put(SIZE.MEDIUM, 150);
        sizeMap.put(SIZE.LARGE, 10);
        pizzaInventory.put("Deluxe Veggie", sizeMap);
        sizeMap.clear();
        sizeMap.put(SIZE.REGULAR, 100);
        sizeMap.put(SIZE.MEDIUM, 150);
        sizeMap.put(SIZE.LARGE, 10);
        pizzaInventory.put("Cheese and corn", sizeMap);
        sizeMap.clear();
        sizeMap.put(SIZE.REGULAR, 100);
        sizeMap.put(SIZE.MEDIUM, 150);
        sizeMap.put(SIZE.LARGE, 10);
        pizzaInventory.put("Paneer Tikka", sizeMap);
        sizeMap.clear();
        sizeMap.put(SIZE.REGULAR, 100);
        sizeMap.put(SIZE.MEDIUM, 150);
        sizeMap.put(SIZE.LARGE, 10);
        pizzaInventory.put("Chicken Tikka", sizeMap);
        sizeMap.clear();
        sizeMap.put(SIZE.REGULAR, 100);
        sizeMap.put(SIZE.MEDIUM, 150);
        sizeMap.put(SIZE.LARGE, 10);
        pizzaInventory.put("Chicken Tikka", sizeMap);
        //loading topping inventory
        toppingInventory.put("Capsicum",50);
        toppingInventory.put("Paneer",50);
        toppingInventory.put("Mushroom",50);
        toppingInventory.put("Fresh tomato",50);
        toppingInventory.put("Chicken tikka",50);
        toppingInventory.put("Barbeque chicken",50);
        toppingInventory.put("Grilled chicken",50);
        toppingInventory.put("cheese",50);
        //loading sides inventory
        sideInventory.put("Cold drink",250);
        sideInventory.put("Mousse cake",200);
        //loading crust inventory
        crustInventory.put("New hand tossed", 20);
        crustInventory.put("Wheat thin crust", 25);
        crustInventory.put("Cheese Burst", 10);
        crustInventory.put("Fresh pan pizza", 25);
    }

    public boolean checkPizza(String pizza, SIZE size, Integer qty) {
        return pizzaInventory.get(pizza).get(size) >= qty;
    }

    public boolean checkTopping(String toppings) {
        return toppingInventory.get(toppings) > 0;
    }

    public boolean checkSide(String side, Integer qty) {
        return sideInventory.get(side) >= qty;
    }

    public void updatePizza(String pizza, SIZE size, Integer qty) {
        pizzaInventory.get(pizza).put(size,pizzaInventory.get(pizza).get(size)-qty);
    }

    public void updateTopping(String topping) {
        toppingInventory.put(topping, toppingInventory.get(topping) - 1);
    }

    public void updateSide(String side,Integer qty) {
        sideInventory.put(side, sideInventory.get(side) - qty);
    }

    public void addPizza(String pizza, SIZE size, Integer qty) {
        pizzaInventory.get(pizza).put(size,pizzaInventory.get(pizza).get(size)+qty);
    }

    public void addTopping(String topping, Integer qty) {
        toppingInventory.put(topping, toppingInventory.get(topping) + qty);
    }

    public void addSide(String side, Integer qty) {
        sideInventory.put(side, sideInventory.get(side) + qty);
    }
}
