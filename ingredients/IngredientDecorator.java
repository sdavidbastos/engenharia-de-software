package ingredients;

public abstract class IngredientDecorator implements IIngredientDecorator {
    public IIngredientDecorator product;

    public IngredientDecorator(IIngredientDecorator product) {
        this.product = product;
    }

    public String getDescription() {
        return product.getDescription();
    }

    public double getPrice() {
        return product.getPrice();
    }
    
}
