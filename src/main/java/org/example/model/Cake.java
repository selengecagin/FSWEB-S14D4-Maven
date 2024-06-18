package org.example.model;

public class Cake extends ProductForSale{
    private String shape;

    public Cake(String type, double price, String description, String shape) {
        super(type, price, description);
        this.shape = shape;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString() + this);
    }
}
