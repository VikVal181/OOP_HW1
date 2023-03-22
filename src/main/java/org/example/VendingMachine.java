package org.example;

//import java.util.ArrayList;
//import java.util.List;

public abstract class VendingMachine {
//    private List<Product> products = new ArrayList<>();

    public VendingMachine() {

    }

//    public abstract void initProduct();

    public abstract Product getProduct();
//    {
//        for (Product p : products) {
//            if (p.getName().equals(name)) {
//                return p;
//            }
//        }
//
//        return new Product("product is not found", 0);
//    }
}
