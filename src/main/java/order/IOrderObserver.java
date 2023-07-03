package order;

import java.util.List;

import Product.IProduct;

public interface IOrderObserver {
    String execute(List<IProduct> products);
}