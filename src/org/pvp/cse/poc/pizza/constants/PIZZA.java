package org.pvp.cse.poc.pizza.constants;

public enum PIZZA {
    DELUXE_VEGGIE("Deluxe Pizza"), CHEESE_AND_CORN("CHEESE AND CORN "), PANEER_TIKKA(" PANEER TIKKA"),
    CHICKEN_TIKKA(" CHICKEN TIKKA"), NON_VEG_SUPREME(" NON VEG_SUPREME"), PEPPER_BARBECUE_CHICKEN(" ");
    String name;
    PIZZA(String name){
        this.name = name;
    }
    public String valueOf() {
        return this.name;
    }

    public PIZZA nameOf(String s) {
        if(s.equals("Deluxe Pizza")) {
            return DELUXE_VEGGIE;
        }//TODO: for ALL
        return null;
    }
}
