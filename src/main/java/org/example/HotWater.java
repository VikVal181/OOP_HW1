package org.example;

public class HotWater extends BottleOfWater{
    private int temperature;

    public HotWater(String name, int cost, double volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotWater{" + super.toString() +
                "temperature=" + temperature +
                '}';
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
