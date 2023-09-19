package org.pvp.cse.poc.pizza.constants;

public enum TYPE {

    VEG("Veg"),NON_VEG("Non-Veg");
    String name;
    TYPE(String name){
        this.name=name;
    }
    String valueOf(){
        return this.name;
    }
    // return from plain english to ENUM
    public TYPE valueOf(int i){
        if(i==1){
            return TYPE.VEG;
        }else {
            return TYPE.NON_VEG;
        }
    }
}
