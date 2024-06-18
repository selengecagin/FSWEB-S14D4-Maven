package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[5];
        products[0]= new Chocolate("DARK", 100,"brezilian cacao","vanilla");
        products[1] = new Bread("Whole Grains", 100,"bread with nutrients","loaf");
        products[2] = new Cake("lava cake",200,"chocolate glazed cake","heart");

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {

        for (ProductForSale product : products){
            if(product != null){
                product.showDetails();
            }
        }
    }
}