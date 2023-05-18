package cashRegister;

import java.util.ArrayList;
import java.util.List;

import product.Product;

public class CashRegisterComposite{
    private List<Product> products = new ArrayList<Product>();
    private double total = 0.0;

    public void add(Product product) {
        this.total += product.price;
        products.add(product);
        System.out.println(this.total);
    }

    public void remove(Product product) {
        this.total -= product.price;
        products.remove(product);
    }

    public double amount(){
        return this.total;
    }
}
