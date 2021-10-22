package myonlineshopusinginterface;

public
interface ProductInterface { // similar to abstract classes containing only public abstract methods

  // All attribute are public final static
  // Default example:  int k = 1;

  /** Methods do not have any implementation and all methods are public abstract */
  double computeSalePrice(); // can be declared as - double computeSalePrice();

  double getRegularPrice();

  void setRegularPrice(double regularPrice);
}
