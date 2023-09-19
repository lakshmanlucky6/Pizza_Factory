package org.pvp.cse.poc.pizza.constants;

public  enum SIDE {
    COLD_DRINK("Cold drink"),
    MOUSSE_CAKE("Mousse cake");
    String name;
    SIDE(String name){
        this.name=name;
    }
    String valueOf(){
        return this.name;
    }
}
