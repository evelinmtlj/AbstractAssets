package com.pluralsight;

public class Cash extends Asset {

    public Cash(String description, String dateAcquired, double originalCost) {
        super(description,  dateAcquired , originalCost);

    }

    public Cash(String dateAcquired, double originalCost) {
        super("$" + originalCost + " in CASH",  dateAcquired , originalCost);

    }

    public double getValue(){
        return getOriginalCost();
    }
}

