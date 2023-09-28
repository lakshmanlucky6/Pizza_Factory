package org.pvp.cse.poc.pizza.constants;

public enum PIZZA { // TODO: Lakshman
  DELUXE_VEGGIE("Deluxe Veggie", TYPE.VEG),
  CHEESE_AND_CORN("Cheese and corn",TYPE.VEG),
  PANEER_TIKKA("Paneer Tikka",TYPE.VEG),
  CHICKEN_TIKKA("Chicken Tikka", TYPE.NON_VEG),
  NON_VEG_SUPREME("Non-Veg Supreme",TYPE.NON_VEG),
  PEPPER_BARBECUE_CHICKEN("Pepper Barbecue Chicken",TYPE.NON_VEG);
  String name;
  TYPE type;
  PIZZA(String name,TYPE type) {
    this.name=name;
    this.type=type;
  }
  public String valueOf(){
    return this.name;
  }
  public static PIZZA nameOf(String pizzaName) {
      switch (pizzaName) {
          case "Deluxe Veggie":
              return DELUXE_VEGGIE;
          case "Cheese and corn":
              return CHEESE_AND_CORN;
          case "Paneer Tikka":
              return PANEER_TIKKA;
          case "Chicken Tikka":
              return CHICKEN_TIKKA;
          case "Non--Veg Supreme":
              return NON_VEG_SUPREME;
          case "Pepper Barbecue Chicken":
              return PEPPER_BARBECUE_CHICKEN;
          default:
              return null; /* throw exeption -> pizzaName not exist */
      }
  }
}
