package myonlineshopusinginterface;

public class Product implements ProductInterface { // note the use of implements instead of extends

  /** private field for a product type */
  private double regularPrice;

  /** Creates a new instance of Product */
  public Product(double regularPrice) {
    this.regularPrice = regularPrice;
  }

  // Implement the methods of the ProductInterface: must override
  public double computeSalePrice() {
    // if this method is not need for general type like product,
    // and product class is not abstract,
    // then return 0 for overriding.
    return 0;
  }

  public double getRegularPrice() {
    return regularPrice;
  }

  public void setRegularPrice(double regularPrice) {
    this.regularPrice = regularPrice;
  }
}
