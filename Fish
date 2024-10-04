public class Fish {
    // Attributes for the fish's name and price
    private String name;  // The name of the fish
    private double price; // The price of the fish

    /*  
     * Default constructor initializes the fish with default values
     */
    public Fish() {
        this.name = "Unknown";
        this.price = 0.0;
    }

    /* 
     * Parameterized constructor to create a fish with specific name and price 
     */
    public Fish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /*  
     * Returns the name of the fish
     */
    public String getName() {
        return name;
    }

    /* 
     * Sets the name of the fish 
     */
    public void setName(String name) {
        this.name = name;
    }

    /* 
     * Returns the price of the fish 
     */
    public double getPrice() {
        return price;
    }

    /*  
     * Sets the price of the fish
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /* 
     * Returns a string representation of the fish object 
     */
  
    public String toString() {
        return "Fish [Name: " + name + ", Price: $" + String.format("%.2f", price) + "]";
    }
}