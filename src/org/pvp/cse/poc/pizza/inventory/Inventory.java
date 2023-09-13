package org.pvp.cse.poc.pizza.inventory;
import org.pvp.cse.poc.pizza.constants.SIZE;
import org.pvp.cse.poc.pizza.model.Pizza;
import org.pvp.cse.poc.pizza.model.Side;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    Map<String,Map<SIZE,Integer>> pizzaInventory = new HashMap<>();
    Map<String,Integer> toppingInventory = new HashMap<>();
    Map<String,Integer> sideInventory = new HashMap<>();
    //TODO:stock availability check
    //TODO:update stock
    //TODO:Load Stock
    Inventory(Pizza pizza, Side side){

    }

    public boolean checkPizzaInventory(Pizza pizza,SIZE size){

        if (pizzaInventory.get(pizza).get(size)!=0)
            return true;
        else
            return false;
    }
    public boolean checkToppingInventory(String topping){
        if (toppingInventory.get(topping) != 0)
            return true;
        else
            return false;
    }
    public boolean checkSideInventory(String side){
        if (sideInventory.get(side) != 0)
            return true;
        else
            return false;
    }

    public void updatePizzaInventory(Pizza pizza,SIZE size){
         //
    }
    public void updateToppingInventory(String topping) {
        toppingInventory.put(topping,toppingInventory.get(topping)-1);
    }
    public void updateSideInventory(String side){
        sideInventory.put(side,sideInventory.get(side)-1);
    }

    public void loadPizzaInventory(Pizza pizza,SIZE size){
        //
    }
    public void loadToppingInventory(String topping,Integer qty){
        toppingInventory.put(topping,toppingInventory.get(topping)+qty);
    }
    public void loadSideInventory(String side,Integer qty){
        sideInventory.put(side,sideInventory.get(side)+qty);
    }
}
