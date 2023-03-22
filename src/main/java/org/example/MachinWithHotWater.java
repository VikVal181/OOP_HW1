package org.example;

import java.util.ArrayList;
import java.util.List;

public class MachinWithHotWater extends VendingMachine{
    private List<HotWater> hotBottles = new ArrayList<>();

    public MachinWithHotWater(List<BottleOfWater> bottles, List<HotWater> hotBottles) {
        this.hotBottles = hotBottles;
    }

    public MachinWithHotWater(List<HotWater> hotBottles) {
        this.hotBottles = hotBottles;
    }

    public HotWater getHotBottles() {
        return hotBottles;
    }
}
