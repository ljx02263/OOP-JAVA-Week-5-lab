package myonlineshop;

public class Book extends Product { // An abstract class can be subclassed; subclass can be abstract

  /** private field for a book */
  private String publisher;

  private int yearPublished;

  /** Creates a new instance of Book */
  public Book(double regularPrice, String publisher, int yearPublished) {
    super(regularPrice); //calling product's constructor
    this.publisher = publisher;
    this.yearPublished = yearPublished;
  }

  /** Implement and override the abstract method from Product superclass */
  public double computeSalePrice() {
    return super.getRegularPrice() * 0.5;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public int getYearPublished() {
    return yearPublished;
  }

  public void setYearPublished(int yearPublished) {
    this.yearPublished = yearPublished;
  }
}
