
package myonlineshopusinginterface;

public class TV extends Electronics {

    /** private field for a TV */
    int size;
    
    /** Creates a new instance of TV */
    public TV(double regularPrice, 
              String manufacturer,
              int size) {
        super(regularPrice, manufacturer);
        this.size = size;
    }
    
    // Override the method: a different sale price!
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.8;
    }
}
