
package myonlineshopusinginterface;

// A class can extend one parent class and then implement a comma-separated list of interfaces.
public class Book extends Product implements BookInterface{ 
    
    private String publisher;
    private int yearPublished;
    
    /** Creates a new instance of Book */
    public Book(double regularPrice,
            String publisher,
            int yearPublished) {
        super(regularPrice);
        this.publisher = publisher;
        this.yearPublished = yearPublished;
    }
    
    // Override the method from Product: a different sale price!
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.5;
    }
    
    // Implement method from BookInterface: override
    public String getPublisher() {
        return publisher;
    }
    
    // Implement method from BookInterface: override
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    // Implement method from BookInterface: override
    public int getYearPublished() {
        return yearPublished;
    }
    
    // Implement method from BookInterface: override
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    
}
