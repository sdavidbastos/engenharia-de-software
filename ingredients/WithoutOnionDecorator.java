package ingredients;

public class WithoutOnionDecorator extends IngredientDecorator {

    public WithoutOnionDecorator(IIngredientDecorator product) {
        super(product);
    }

    public String getDescription() {
        return super.getDescription() + ", sem cebola";
    }

    public double getPrice() {
        return super.getPrice();
    }
    
}
