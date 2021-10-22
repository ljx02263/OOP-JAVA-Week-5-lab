package myonlineshop;

/** Electronics is a product */
public abstract class Electronics extends Product {

  private String manufacturer; //生产商

  /** Creates a new instance of Electronics */
  public Electronics(double regularPrice, String manufacturer) {
    super(regularPrice); //call the superclass(Product abstract class)'s constructor
    this.manufacturer = manufacturer;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }
}
