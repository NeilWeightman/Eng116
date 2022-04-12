package com.sparta.shop;

// implicitly inherits directly from java.lang.Object
public class Shirt extends Item {
    // object instance variables are initialised to null
    private String designName;
    private String size;

    public Shirt(String prodId, double price, String designName, String size, char colour) {
        setProductId(prodId);
        setPrice(price);
        setColour(colour);
        this.designName = designName;
        this.size = size;
    }

    public Shirt() {
        // use the existing most general ctor
        // ctor chaining
        this("123", 0.0, "Dummy Design", "-", '-');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        // cast o to a Shirt
        Shirt shirt = (Shirt) o;

        if (Double.compare(shirt.getPrice(), getPrice()) != 0) return false;
        if (getColour() != shirt.getColour()) return false;
        if (getProductId() != null ? !getProductId().equals(shirt.getProductId()) : shirt.getProductId() != null) return false;
        if (designName != null ? !designName.equals(shirt.designName) : shirt.designName != null) return false;
        return size != null ? size.equals(shirt.size) : shirt.size == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getProductId() != null ? getProductId().hashCode() : 0;
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (designName != null ? designName.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + (int) getColour();
        return result;
    }

    public String toString() {
        return "Shirt #" + getProductId() + " { " +
                "price=" + getPrice() +
                " (with tax) " + getPriceWithTax() +
                ", designName='" + designName + '\'' +
                ", size='" + size + '\'' +
                ", colour=" + getColour() +
                " }";
    }

    public String getDesignName() {
        return designName;
    }

    public void setDesignName(String designName) {
        this.designName = designName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPriceWithTax(){
        // assuming VAT is 20%
        return this.getPrice() * 1.2;
    }

    @Override
    public double getVatRate() {
        return 0.2;
    }
}
