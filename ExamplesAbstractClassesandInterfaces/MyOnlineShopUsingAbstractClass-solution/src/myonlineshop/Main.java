
package myonlineshop;

public class Main {
    
    public static void main(String[] args) {
        
        // Declare and create Product array of size 7
        Product[] pa = new Product[7]; 
        // An abstract class can be used as a reference type, an array of 7 product references
        
        // Is this allowed?
        // Product test = new Product() - No;
        // Product is abstract, cannot be instantiated
        
        // Create object instances and assign them to the type of Product

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
            
            // Call a method of the super class to get the regular price.
            // Just product class has this method and
            // no subclasses override it.
            totalRegularPrice += pa[i].getRegularPrice();
            
            // Since the sale price is computed differently
            // depending on the object's type, overriding (implementation)
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
        
        // Extras
        System.out.println(pa[0] instanceof Product);
    }
    
}

/* 
Abstract class is used when you have scenario that all classes have same Structure: is A
but some different functionality.
*/

/*
Subclass when you want to extend a class and add some functionality,
whether or not the parent class is abstract.
*/