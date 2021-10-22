
package myonlineshop;

public class MP3Player extends Electronics{

    /** private field for a MP3Player*/
    private String color;
    
    public MP3Player(double regularPrice, 
                String manufacturer,
                String color) {
        super(regularPrice, manufacturer); //calling the electronics constructor
        this.color = color;
    }
    
    // Implement the abstract method: override
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.9;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
