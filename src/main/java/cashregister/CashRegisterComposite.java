package cashregister;

import java.util.ArrayList;
import java.util.List;

import discount.IDiscountStrategy;
import order.IOrderSubject;
import Product.IProduct;

public class CashRegisterComposite {
    public List<IProduct> products = new ArrayList<>();
    public double total = 0.0;
    private final IDiscountStrategy discountStrategy;
    private final IOrderSubject orderSubject;

    public CashRegisterComposite(IDiscountStrategy discountStrategy, IOrderSubject orderSubject) {
        this.discountStrategy = discountStrategy;
        this.orderSubject = orderSubject;
    }

    public void add(IProduct product) {
        this.total += product.getPrice();
        this.products.add(product);
    }

    public void remove(IProduct product) {
        this.total -= product.getPrice();
        this.products.remove(product);
    }

    public double amount() {
        int quantity = this.products.size();
        return this.discountStrategy.execute(quantity) * this.total;
    }

    public double produceProduct() {
        this.orderSubject.notifySubscribes(this.products);
        return this.amount();
    }
}
