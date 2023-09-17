package org.pvp.cse.poc.pizza.constants;

//import com.sun.org.apache.xpath.internal.objects.XString;

public enum SIZE {
    REGULAR,//("Regular"),
    MEDIUM,
    LARGE;
    // return from plain english to ENUM
    public static SIZE valueOfSize(String size){
        if(size=="REGULAR")
            return SIZE.REGULAR;
        else if(size=="MEDIUM")
            return SIZE.MEDIUM;
        else
            return SIZE.LARGE;
    }
}

//


