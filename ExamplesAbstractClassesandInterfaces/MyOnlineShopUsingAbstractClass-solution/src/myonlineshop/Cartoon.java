package myonlineshop;

public class Cartoon extends Book { // cartoon is a type of book?

  /** private field for a cartoon */
  String characterName;

  /** Creates a new instance of Cartoon */
  public Cartoon(double regularPrice, String publisher, int yearPublished, String characterName) {
    super(150, "Sun press", 1978); // calling the superclass's constructor
    this.characterName = characterName;
  }

  // Override this method: if needed
  public double computeSalePrice() {
    return super.getRegularPrice() * 0.4;
  }
}
