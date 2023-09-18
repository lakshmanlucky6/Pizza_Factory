package org.pvp.cse.poc.pizza.constants;

public enum TYPE {

    VEG,NON_VEG;

    // return from plain english to ENUM
    public static TYPE valueOf(int i){
        if(i==1)
            return TYPE.VEG;
        else
            return TYPE.NON_VEG;
    }
}
