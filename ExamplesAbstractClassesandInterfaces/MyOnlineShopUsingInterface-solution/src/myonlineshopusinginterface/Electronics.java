package myonlineshopusinginterface;

public class Electronics extends Product implements ElectronicsInterface {

  private String manufacturer;

  /** Creates a new instance of Electronics */
  public Electronics(double regularPrice, String manufacturer) {
    super(regularPrice);
    this.manufacturer = manufacturer;
  }

  /** Override the ElectronicsInterface's method */
  public String getManufacturer() {
    return manufacturer;
  }

  /** Override the ElectronicsInterface's method */
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }
}
