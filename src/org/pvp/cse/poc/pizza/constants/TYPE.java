package org.pvp.cse.poc.pizza.constants;

public enum TYPE {

    VEG("Veg"),NON_VEG("Non-Veg");
    String name;
    TYPE(String name){
        this.name=name;
    }
    public String valueOf(){
        return this.name;
    }
    public static TYPE nameOf(String typeName){
        switch (typeName) {
            case "Veg":
                return VEG;
            case "Non-Veg":
                return NON_VEG;
            default:
                return null; /* throw exeption -> typeName not exist */
        }
    }
}
