package org.pvp.cse.poc.pizza.inventory;
import org.pvp.cse.poc.pizza.constants.*;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    Map<PIZZA, Map<SIZE, Integer>> pizzaInventory = new HashMap<>();
    Map<TOPPING, Integer> toppingInventory = new HashMap<>();
    Map<SIDE, Integer> sideInventory = new HashMap<>();
    Map<CRUST, Integer> crustInventory = new HashMap<>();
    //TODO:stock availability check
    //TODO:update stock
    //TODO:Load Stock
    public Inventory() {
        //loading pizza inventory
        HashMap<SIZE, Integer> sizeMap = new HashMap<>();
        sizeMap.put(SIZE.REGULAR, 100);
        sizeMap.put(SIZE.MEDIUM, 150);
        sizeMap.put(SIZE.LARGE, 10);
        pizzaInventory.put(PIZZA.DELUXE_VEGGIE, sizeMap);
        sizeMap.clear();
        sizeMap.put(SIZE.REGULAR, 100);
        sizeMap.put(SIZE.MEDIUM, 150);
        sizeMap.put(SIZE.LARGE, 10);
        pizzaInventory.put(PIZZA.CHEESE_AND_CORN, sizeMap);
        sizeMap.clear();
        sizeMap.put(SIZE.REGULAR, 100);
        sizeMap.put(SIZE.MEDIUM, 150);
        sizeMap.put(SIZE.LARGE, 10);
        pizzaInventory.put(PIZZA.PANEER_TIKKA, sizeMap);
        sizeMap.clear();
        sizeMap.put(SIZE.REGULAR, 100);
        sizeMap.put(SIZE.MEDIUM, 150);
        sizeMap.put(SIZE.LARGE, 10);
        pizzaInventory.put(PIZZA.CHICKEN_TIKKA, sizeMap);
        sizeMap.clear();
        sizeMap.put(SIZE.REGULAR, 100);
        sizeMap.put(SIZE.MEDIUM, 150);
        sizeMap.put(SIZE.LARGE, 10);
        pizzaInventory.put(PIZZA.NON_VEG_SUPREME, sizeMap);
        sizeMap.clear();
        sizeMap.put(SIZE.REGULAR, 100);
        sizeMap.put(SIZE.MEDIUM, 150);
        sizeMap.put(SIZE.LARGE, 10);
        pizzaInventory.put(PIZZA.PEPPER_BARBECUE_CHICKEN, sizeMap);
        //loading topping inventory
        toppingInventory.put(TOPPING.CAPSICUM,50);
        toppingInventory.put(TOPPING.PANEER,50);
        toppingInventory.put(TOPPING.MUSHROOM,50);
        toppingInventory.put(TOPPING.FRESH_TOMATO,50);
        toppingInventory.put(TOPPING.CHICKEN_TIKKA,50);
        toppingInventory.put(TOPPING.BARBEQUE_CHICKEN,50);
        toppingInventory.put(TOPPING.GRILLED_CHICKEN,50);
        toppingInventory.put(TOPPING.CHEEESE,50);
        //loading sides inventory
        sideInventory.put(SIDE.COLD_DRINK,250);
        sideInventory.put(SIDE.MOUSSE_CAKE,200);
        //loading crust inventory
        crustInventory.put(CRUST.NEW_HAND_TOSSED, 20);
        crustInventory.put(CRUST.WHEAT_THIN_CRUST, 25);
        crustInventory.put(CRUST.CHEESE_BURST, 10);
        crustInventory.put(CRUST.FRESH_PAN_PIZZA, 25);
    }

    public boolean checkPizza(PIZZA pizza, SIZE size, Integer qty) {
        return pizzaInventory.get(pizza).get(size) >= qty;
    }

    public boolean checkTopping(TOPPING topping) {
        return toppingInventory.get(topping) > 0;
    }

    public boolean checkSide(SIDE side, Integer qty) {
        return sideInventory.get(side) >= qty;
    }

    public void updatePizza(PIZZA pizza, SIZE size, Integer qty) {
        pizzaInventory.get(pizza).put(size,pizzaInventory.get(pizza).get(size)-qty);
    }

    public void updateTopping(TOPPING topping) {
        toppingInventory.put(topping, toppingInventory.get(topping) - 1);
    }

    public void updateSide(SIDE side,Integer qty) {
        sideInventory.put(side, sideInventory.get(side) - qty);
    }

    public void addPizza(PIZZA pizza, SIZE size, Integer qty) {
        pizzaInventory.get(pizza).put(size,pizzaInventory.get(pizza).get(size)+qty);
    }

    public void addTopping(TOPPING topping, Integer qty) {
        toppingInventory.put(topping, toppingInventory.get(topping) + qty);
    }

    public void addSide(SIDE side, Integer qty) {
        sideInventory.put(side, sideInventory.get(side) + qty);
    }
}
