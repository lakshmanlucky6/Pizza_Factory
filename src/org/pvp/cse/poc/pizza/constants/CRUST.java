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
    public String valueOf(){
        return this.name;
    }
    public static CRUST nameOf(String crustName) {
        switch (crustName) {
            case "New hand tossed":
                return NEW_HAND_TOSSED;
            case "Wheat thin crust":
                return WHEAT_THIN_CRUST;
            case "Cheese Burst":
                return CHEESE_BURST;
            case "Fresh pan pizza":
                return FRESH_PAN_PIZZA;
            default:
                return null; /* throw exeption -> crustName not exist */
        }
    }
}
