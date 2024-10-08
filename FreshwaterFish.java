public class FreshwaterFish extends Fish {
    private String tankType;

    /*
     * Constructor to initialize a FreshwaterFish with name, price, and tank type.
     *
     *  name -  The name of the fish.
     *  price - The price of the fish.
     *  tankType - The type of tank required for this freshwater fish.
     */
    public FreshwaterFish(String name, double price, String tankType) {
        super(name, price); // Call the constructor of the Fish class
        this.tankType = tankType;
    }

    /* Returns the tank type of the freshwater fish */
    public String getTankType() {
        return tankType;
    }

    /* Sets the tank type for the freshwater fish */
    public void setTankType(String tankType) {
        this.tankType = tankType;
    }

    /* Returns a string representation of the freshwater fish object */
    public String toString() {
        return super.toString() + ", Tank Type: " + tankType + " (Freshwater)";
    }
}