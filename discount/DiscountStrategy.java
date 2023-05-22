package discount;

public class DiscountStrategy implements IDiscountStrategy {

    public double execute(int quantity) {
        return quantity >= 2 ? 0.9 : 1;
    }
}
