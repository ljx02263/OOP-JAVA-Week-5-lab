package myonlineshopusinginterface;

public interface BookInterface extends ProductInterface { // Interfaces can extend interfaces:

  /** public abstract method */
  public String getPublisher();

  public void setPublisher(String publisher);

  public int getYearPublished();

  public void setYearPublished(int yearPublished);
}
