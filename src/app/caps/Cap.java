package app.caps;

import app.productBrand.Brand;
import app.productBrand.CapBrand;
import app.itemInterface.Item;

public abstract class Cap implements Item {
    @Override
    public Brand brand(){
        return new CapBrand();
    }
    @Override
    public abstract double price();
}
