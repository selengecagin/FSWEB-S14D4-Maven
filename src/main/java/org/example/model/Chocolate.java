package org.example.model;

public class Chocolate extends ProductForSale{

    private String flavor;

    public Chocolate(String type, double price, String description, String flavor) {
        super(type, price, description);
        this.flavor = flavor;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }
}
