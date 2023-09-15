package org.pvp.cse.poc.pizza.inventory;

import org.pvp.cse.poc.pizza.constants.SIZE;
import org.pvp.cse.poc.pizza.model.Pizza;
import org.pvp.cse.poc.pizza.model.Side;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    Map<String, Map<SIZE, Integer>> pizzaInventory = new HashMap<>();
    Map<String, Integer> toppingInventory = new HashMap<>();
    Map<String, Integer> sideInventory = new HashMap<>();

    //TODO:stock availability check
    //TODO:update stock
    //TODO:Load Stock
    public Inventory() {

        HashMap<SIZE, Integer> sizeMap = new HashMap<>();
        sizeMap.put(SIZE.REGULAR, 100);
        sizeMap.put(SIZE.MEDIUM, 150);
        sizeMap.put(SIZE.LARGE, 10);

        pizzaInventory.put("Delux Pizza", sizeMap);

    }

    public boolean checkPizzaInventory(String pizza, SIZE size, Integer qty) {
        return pizzaInventory.get(pizza).get(size) >= qty;
    }

    public boolean checkToppingInventory(String toppings) {
        return toppingInventory.get(toppings) > 0;
    }

    public boolean checkSideInventory(String side, Integer qty) {
        return sideInventory.get(side) >= qty;
    }

    public void updatePizzaInventory(String pizza, SIZE size, Integer qty) {
        Map<SIZE, Integer> sizeMap = pizzaInventory.get(pizza);
        Integer mapQty = sizeMap.get(size);
        sizeMap.put(size, mapQty - qty);
    }

    public void updateToppingInventory(String topping) {
        toppingInventory.put(topping, toppingInventory.get(topping) - 1);
    }

    public void updateSideInventory(String side) {
        sideInventory.put(side, sideInventory.get(side) - 1);
    }

    public void loadPizzaInventory(String pizza, SIZE size, Integer qty) {
        Map<SIZE, Integer> m1 = new HashMap<>();
        m1.put(size, pizzaInventory.get(pizza).get(size) + qty);
        pizzaInventory.put(pizza, m1);
    }

    public void addTopping(String topping, Integer qty) {
        toppingInventory.put(topping, toppingInventory.get(topping) + qty);
    }

    public void addSide(String side, Integer qty) {
        sideInventory.put(side, sideInventory.get(side) + qty);
    }
}
