package myonlineshop;

/** classes that are too general to creat real objects */
public abstract class Product {

  private double regularPrice; //private value

  /**
   * Abstract class constructor, only for superclass constructor calling
   * @param regularPrice fill regularPrice
   */
  public Product(
      double regularPrice) { // abstract classes cannot be instantiated -> compilation error
    this.regularPrice = regularPrice;
  }

  // Abstract method - Note: subclasses MUST OVERRIDE all abstract methods (otherwise compilation
  // error),
  // EXCEPT when the subclass is also abstract.
  public abstract double computeSalePrice();

  // A non-abstract method
  public double getRegularPrice() {
    return regularPrice;
  }

  public void setRegularPrice(double regularPrice) {
    this.regularPrice = regularPrice;
  }
}
