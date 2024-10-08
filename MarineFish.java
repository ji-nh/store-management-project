public class MarineFish extends Fish {
    private String habitatType;

    /*
     * Constructor to initialize a MarineFish with name, price, and habitat type.
     *
     * name - The name of the fish.
     * price - The price of the fish.
     * habitatType - The habitat type where the marine fish is typically found.
     */
    public MarineFish(String name, double price, String habitatType) {
        super(name, price); // Call the constructor of the parent Fish class
        this.habitatType = habitatType; 
    }

    /* Returns the habitat type of the marine fish */
    public String getHabitatType() {
        return habitatType;
    }

    /* Sets the habitat type for the marine fish */
    public void setHabitatType(String habitatType) {
        this.habitatType = habitatType;
    }

    /* Returns a string representation of the marine fish object */
    public String toString() {
        return super.toString() + ", Habitat Type: " + habitatType + " (Marine)";
    }
}