package org.pvp.cse.poc.pizza.constants;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

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
    String valueOf(){
        return this.name+" : "+this.type;
    }
}
