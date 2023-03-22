package org.example;
//Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//        Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
//        В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
//        Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BottleOfWater> bottles = new ArrayList<>(Arrays.asList(new BottleOfWater("nikola", 120, 1.0),
                new BottleOfWater("cola", 200, 1.0), new BottleOfWater("pepsi", 80, 0.47)));
        MachinWithWater waterMachine = new MachinWithWater(bottles);
//        vendingMwaterMachineachine.initProduct(products);
        System.out.println(waterMachine.getProduct("cola", 1.0).toString());
    }
}