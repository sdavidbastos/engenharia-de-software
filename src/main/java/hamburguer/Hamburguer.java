package hamburguer;

import Product.Product;

public class Hamburguer extends Product {
    public int quantityMeat;
    public boolean cheese;
    public boolean egg;
    public boolean bacon;

    public Hamburguer(String name, double price, int quantityMeat, boolean cheese, boolean egg, boolean bacon) {
        super.name = name;
        super.price = price;
        this.quantityMeat = quantityMeat;
        this.cheese = cheese;
        this.egg = egg;
        this.bacon = bacon;
    }
}