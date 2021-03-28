package Generics;

public class GenericsDriver {

    public static void main(String[] args) {
        /*          Not using Generics      */
        Product product = new Product(121, "Soap");
        int productID = (int)product.getProductID();
        String productName = (String)product.getProductDescription();


        /*          Using Generics          */
        // When you create an object of a Generic class you must specify the type or types
        // of data that the object will contain but after that you will not require any
        // type casting to retrieve the data.
        ProductGeneric<Integer, String> productGeneric = new ProductGeneric<>(121, "Soap");
        int productIDGeneric = productGeneric.getProductID();
        String productNameGeneric = productGeneric.getProductDescription();

        ProductGeneric<String, String> productGeneric1 = new ProductGeneric<>("SLMAI", "Soap");
        String product1IDGeneric = productGeneric1.getProductID();
        String product1NameGeneric = productGeneric1.getProductDescription();
    }
}
