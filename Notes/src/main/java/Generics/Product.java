package Generics;

public class Product {

    private Object productID;
    private Object productDescription;


    public Product(Object productID, Object productDescription) {
        this.productID = productID;
        this.productDescription = productDescription;
    }

    public Object getProductID() {
        return productID;
    }

    public void setProductID(Object productID) {
        this.productID = productID;
    }

    public Object getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(Object productDescription) {
        this.productDescription = productDescription;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productDescription=" + productDescription +
                '}';
    }
}
