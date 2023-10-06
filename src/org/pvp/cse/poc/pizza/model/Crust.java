package org.pvp.cse.poc.pizza.model;

import org.pvp.cse.poc.pizza.constants.CRUST;

public class Crust {
    private CRUST crustName;
    public Crust(CRUST crustName) {
        this.crustName=crustName;
    }

    public void setCrustName(CRUST crustName) {
        this.crustName = crustName;
    }

    public CRUST getCrustName() {
        return crustName;
    }
}
