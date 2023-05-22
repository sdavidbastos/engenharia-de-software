package ingredients;

import product.Product;

public class IngredientAdapter implements IIngredientDecorator {
    private Product product;

    public IngredientAdapter(Product product) {
        this.product = product;
    }

    @Override
    public String getDescription() {
        return this.product.name;
    }

    @Override
    public double getPrice() {
        return this.product.price;
    }
    
}
