package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class MachinWithWater extends VendingMachine{
    private List<BottleOfWater> bottles = new ArrayList<>();

    public MachinWithWater(List<BottleOfWater> bottles) {
        this.bottles = bottles;
    }

//    @Override
//    public void initProduct() {

//    }


//    @Override
//    public BottleOfWater getProduct(String name, double volume) {
//        for (BottleOfWater bottle : bottles) {
//            if (bottle.getName().equals(name) && (bottle.getVolume() == volume)) {
//                return bottle;
//            }
//        }
//
//        return new BottleOfWater("Bottle is not found", 0, 0.0);
//    }

    @Override
    public Product getProduct(String name, double volume) {
        for (BottleOfWater bottle : bottles) {
            if (bottle.getName().equals(name) && (bottle.getVolume() == volume)) {
                return bottle;
            }
        }

        return new BottleOfWater("Bottle is not found", 0, 0.0);    }
}
