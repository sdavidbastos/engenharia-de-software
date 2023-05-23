package order;

import java.util.ArrayList;
import java.util.List;

import product.IProduct;

public class OrderSubject implements IOrderSubject {
    private List<IOrderObserver> observers = new ArrayList<IOrderObserver>();

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
            observer.execute(products);
        }
    }

}
