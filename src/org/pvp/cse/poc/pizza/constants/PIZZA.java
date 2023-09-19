package org.pvp.cse.poc.pizza.constants;

public enum PIZZA { // TODO: Lakshman
  DELUXE_VEGGIE("Deluxe Veggie", TYPE.VEG),
  CHEESE_AND_CORN("Cheese and corn",TYPE.VEG),
  PANEER_TIKKA("Paneer Tikka",TYPE.VEG),
  CHICKEN_TIKKA("Chicken Tikka", TYPE.NON_VEG),
  NON_VEG_SUPREME("Paneer Tikka",TYPE.NON_VEG),
  PEPPER_BARBECUE_CHICKEN("Chicken Tikka",TYPE.NON_VEG);
  String name;
  TYPE type;
  PIZZA(String name,TYPE type) {
    this.name=name;
    this.type=type;
  }
  String valueOf(){
    return this.name;
  }
  public PIZZA nameOf(String s) {
    if (s.equals("Deluxe Pizza")) {
      return DELUXE_VEGGIE;
    } // TODO: for ALL
    return null;
  }

}
