package additional;

import product.IProduct;

public abstract class AdditionalDecorator implements IProduct{
    private final IProduct productDecorator;
    
    public AdditionalDecorator(IProduct productDecorator) {
        this.productDecorator = productDecorator;
    }

    @Override
    public String getName() {
        return this.productDecorator.getName();
    }

    @Override
    public double getPrice() {
        return this.productDecorator.getPrice();
    }
    
}
