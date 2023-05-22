package cashRegister;

import java.util.ArrayList;
import java.util.List;
import discount.IDiscountStrategy;
import product.Product;

public class CashRegisterComposite {
    private List<Product> products = new ArrayList<Product>();
    public double total = 0.0;
    private IDiscountStrategy discountStrategy;

    public CashRegisterComposite(IDiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void add(Product product) {
        this.total += product.price;
        products.add(product);
    }

    public void remove(Product product) {
        this.total -= product.price;
        products.remove(product);
    }

    public double amount() {
        int quantity = this.products.size();
        return this.discountStrategy.execute(quantity) * this.total;
    }
}
