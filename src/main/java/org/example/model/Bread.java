package org.example.model;

public class Bread extends ProductForSale{

    private String breadType;

    public Bread(String type, double price, String description, String breadType) {
        super(type, price, description);
        this.breadType = breadType;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }
}
