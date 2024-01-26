package app.tShirts;

import app.productBrand.Brand;
import app.itemInterface.Item;
import app.productBrand.TShirtBrand;

public abstract class TShirt implements Item {
    public Brand brand() {
        return new TShirtBrand();
    }

    public abstract double price();
}
