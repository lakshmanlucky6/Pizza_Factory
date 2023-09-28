package org.pvp.cse.poc.pizza.constants;

public enum TOPPING {
    BLACK_OLIVE("Black olive",TYPE.VEG),
    CAPSICUM("Capsicum",TYPE.VEG),
    PANEER("Paneer",TYPE.VEG),
    MUSHROOM("Mushroom",TYPE.VEG),
    FRESH_TOMATO("Fresh tomato",TYPE.VEG),
    CHICKEN_TIKKA("Chicken tikka",TYPE.NON_VEG),
    BARBEQUE_CHICKEN("Barbeque chicken",TYPE.NON_VEG),
    GRILLED_CHICKEN("Grilled chicken",TYPE.NON_VEG),
    CHEESE("Cheese",null);
    String name;
    TYPE type;
    TOPPING(String name, TYPE type) {
        this.name=name;
        this.type=type;
    }
    public String valueOf(){
        return name;
    }
    public static TOPPING nameOf(String toppingName){
        switch (toppingName) {
            case "Black olive":
                return BLACK_OLIVE;
            case "Capsicum":
                return CAPSICUM;
            case "Paneer":
                return PANEER;
            case "Mushroom":
                return MUSHROOM;
            case "Fresh tomato":
                return FRESH_TOMATO;
            case "Chicken tikka":
                return CHICKEN_TIKKA;
            case "Barbeque chicken":
                return BARBEQUE_CHICKEN;
            case "Grilled chicken":
                return GRILLED_CHICKEN;
            case "Cheese":
                return CHEESE;
            default:
                return null; /* throw exeption -> toppingName not exist */
        }
    }
}
