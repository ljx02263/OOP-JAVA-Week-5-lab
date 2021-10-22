
package myonlineshopusinginterface;

public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
    public static void main(String[] args) {
        
        // Declare and create Product array of size 7, with 7 ProductInterface references
        ProductInterface[] pa = new Product[7];

        ProductInterface pa1 = new Product(1.0); // can ONLY USE methods in ProductInterface
        Product pa2 = new Product(2.0); // can use BOTH Product and ProductInterface methods
        
        // Product can be used on the right side because Product implements ProductInterface
        // Interfaces can be use as a reference type.
        
        // Is this allowed? YES, 7 ProductInterface references
        // ProductInterface[] pa = new ProductInterface[7];
        
        // ProductInterface is abstract, cannot be instantiated.
        //ProductInterface test  = new ProductInterface();
        
        // Create object instances and assign them to
        // the type of Product.
        pa[0] = new TV(1000, "Samsung", 30);
        pa[1] = new TV(2000, "Sony", 50);
        pa[2] = new MP3Player(250, "Apple", "blue");
        pa[3] = new Book(34, "Sun press", 1992);
        pa[4] = new Book(15, "Korea press", 1986);
        pa[5] = new ChildrenBook(15, "Pee Wee press", 1987, 8);
        pa[6] = new Cartoon(14, "Pee Wee press", 1924, "Batman");
        
        // Compute total regular price and total
        // sale price.
        double totalRegularPrice = 0;
        double totalSalePrice = 0;
        
        for (int i=0; i<pa.length; i++){
            
            // Call a method of the super class to get
            // the regular price.
            totalRegularPrice += pa[i].getRegularPrice();
            
            // Since the sale price is computed differently
            // depending on the product type, overriding (implementation)
            // method of the object instance of the sub-class
            // gets invoked.  This is runtime polymorphic: dynamic binding
            // behavior.
            totalSalePrice += pa[i].computeSalePrice();
            
            System.out.println("Item number " + i +
                    ": Type = " + pa[i].getClass().getName() +
                    ", Regular price = " + pa[i].getRegularPrice() +
                    ", Sale price = " + pa[i].computeSalePrice());
        }
        System.out.println("totalRegularPrice = " + totalRegularPrice);
        System.out.println("totalSalePrice = " + totalSalePrice);
        
        //Extras
        System.out.println(pa[0] instanceof ProductInterface);
        
    }
    
}

/*
Interface is used when you have scenario that all classes has same structure 
but totally have different functionality.
*/

/*
Abstract classes should be used primarily for objects that are closely related - IS A,
whereas interfaces are best suited for providing a common functionality to unrelated classes:
For example, Book and Cartoon are unrelated, but they both implement ProductInterface and BookInterface
*/

/*
Interfaces are good when we want to have something similar to multiple inheritance
since we can implement multiple interfaces - n:
but inherit from only one abstract class - 1.
*/

/* 
In an interface, all methods must be public.
An abstract class is  good if we want to declare non-public members. 
*/

/*
Interfaces are a good choice when we think that the API will NOT change for a while - otherwise, default.

Abstract classes have the advantage of allowing better forward compatibility: it could have non-abstract method or value.
if they use an abstract class, we can still add behavior without breaking the existing code.
*/