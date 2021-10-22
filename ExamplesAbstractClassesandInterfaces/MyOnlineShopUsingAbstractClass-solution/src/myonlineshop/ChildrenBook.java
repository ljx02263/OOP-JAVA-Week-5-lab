
package myonlineshop;

public class ChildrenBook extends Book{

    /** private field for a children book*/
    int age; // age this book is written for
    
    /** Creates a new instance of ChildrenBook */
    public ChildrenBook(double regularPrice,
            String publisher,
            int yearPublished,
            int age) {
        super(100, "Sun press", 2002); //calling book's constructor
        this.age = age;
    }
    
    // Override this method, if needed
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.3;
    }
    
}
