package additional;

import product.IProduct;

public class Additional extends AdditionalDecorator {

    private String additional;
    private double additionalPrice = 0; 

    public Additional(IProduct product, String additional, double additionalPrice) {
        super(product);
        this.additional = additional;
        this.additionalPrice = additionalPrice;
    }

    public Additional(IProduct product, String additional) {
        super(product);
        this.additional = additional;
    }

    @Override
    public String getName() {
        return super.getName() + additional;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + this.additionalPrice;
    }
    
}
