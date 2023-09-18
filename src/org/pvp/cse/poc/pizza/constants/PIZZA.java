package org.pvp.cse.poc.pizza.constants;

public enum PIZZA {
    DELUXE_VEGGIE("Deluxe Pizza"), CHEESE_AND_CORN(" "), PANEER_TIKKA(" "),
    CHICKEN_TIKKA(" "), NON_VEG_SUPREME(" "), PEPPER_BARBECUE_CHICKEN(" ");
    String name;
    PIZZA(String name){
        this.name = name;
    }
    public String valueOf() {
        return this.name;
    }
}
