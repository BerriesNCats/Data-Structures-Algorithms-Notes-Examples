package Generics;

public class ProductGeneric<T, U> {

    private T productID;
    private U productDescription;


    public ProductGeneric(T productID, U productDescription) {
        this.productID = productID;
        this.productDescription = productDescription;
    }

    public T getProductID() {
        return productID;
    }

    public void setProductID(T productID) {
        this.productID = productID;
    }

    public U getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(U productDescription) {
        this.productDescription = productDescription;
    }
}
