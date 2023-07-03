package order;

import java.util.ArrayList;
import java.util.List;

import Product.IProduct;

public class OrderSubject implements IOrderSubject {
    private final List<IOrderObserver> observers = new ArrayList<>();

    @Override
    public void subscribe(IOrderObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribe(IOrderObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribes(List<IProduct> products) {
        for (IOrderObserver observer : this.observers) {
            System.out.println(observer.execute(products));
        }
    }

}
