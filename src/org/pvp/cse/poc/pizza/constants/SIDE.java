package org.pvp.cse.poc.pizza.constants;

public  enum SIDE {
    COLD_DRINK("Cold drink"),
    MOUSSE_CAKE("Mousse cake");
    String name;
    SIDE(String name){
        this.name=name;
    }
    public String valueOf(){
        return this.name;
    }
    public SIDE nameOf(String sideName){
        switch (sideName) {
            case "Cold drink":
                return COLD_DRINK;
            case "Mousse cake":
                return MOUSSE_CAKE;
            default:
                return null; /* throw exeption -> sideName not exist */
        }
    }
}
