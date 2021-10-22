package myonlineshopusinginterface;

public class MP3Player extends Electronics {

  /** private field for a MP3Player */
  private String color;

  public MP3Player(double regularPrice, String manufacturer, String color) {
    super(regularPrice, manufacturer);
    this.color = color;
  }

  // Override the method: a different sale price!
  public double computeSalePrice() {
    return super.getRegularPrice() * 0.9;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
