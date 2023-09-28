package org.pvp.cse.poc.pizza.constants;

public enum CRUST {
    NEW_HAND_TOSSED("New hand tossed"),
    WHEAT_THIN_CRUST("Wheat thin crust"),
    CHEESE_BURST("Cheese Burst"),
    FRESH_PAN_PIZZA("Fresh pan pizza");
    String name;
    CRUST(String name) {
        this.name=name;
    }
    public static CRUST nameOf(String s){
        return null;
    }
}
