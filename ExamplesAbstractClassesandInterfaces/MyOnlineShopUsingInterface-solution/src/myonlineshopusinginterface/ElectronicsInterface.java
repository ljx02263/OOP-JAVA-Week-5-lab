package myonlineshopusinginterface;

public interface ElectronicsInterface
    extends ProductInterface { // Interfaces can extend interfaces

  /** public abstract method*/
   String getManufacturer();

   void setManufacturer(String manufacturer);

}
