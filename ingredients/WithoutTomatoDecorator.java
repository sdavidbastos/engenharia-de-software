package ingredients;

public class WithoutTomatoDecorator extends IngredientDecorator {

    public WithoutTomatoDecorator(IIngredientDecorator product) {
        super(product);
    }

    public String getDescription() {
        return super.getDescription() + ", sem tomate";
    }

    public double getPrice() {
        return super.getPrice();
    }
    
}
