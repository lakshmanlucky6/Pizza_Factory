package org.pvp.cse.poc.pizza.constants;

//import com.sun.org.apache.xpath.internal.objects.XString;

public enum SIZE {
    REGULAR("Regular"),
    MEDIUM("Medium"),
    LARGE("Large");
    String name;
    SIZE(String name) {
        this.name = name;
    }

    // return from plain english to ENUM
    public String valueOf(){
        return this.name;
    }
    // TODO
    public static SIZE nameOf(String sizeName){
        switch (sizeName) {
            case "Regular":
                return REGULAR;
            case "Medium":
                return MEDIUM;
            case "Large":
                return LARGE;
            default:
                return null; /* throw exeption -> sizeName not exist */
        }
    }
}

//


