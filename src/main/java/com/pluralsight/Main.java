package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //create an instance of an asset

      //  Asset myAsset = new Asset("My house","10-12-2021",5000);
//        Asset a1 = new Cash("2025", 10000);
//        Asset a2 = new Cash("Cash Birthday Gift", "2025", 100);

// create an object of cash
        Cash mycash = new Cash("My money",154);
        Cash mySaving = new Cash("Savings","10-11-21",1345);

        System.out.println(mycash.getValue());
        System.out.println(mySaving.getValue());



    }
}