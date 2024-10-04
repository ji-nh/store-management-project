public class SaltwaterFish extends Fish {
    private double tankSalinity;

    /*
     * Constructor to initialize a SaltwaterFish with name, price, and tank salinity.
     *
     * name - The name of the fish.
     * price - The price of the fish.
     * tankSalinity - The salinity level of the tank for saltwater fish.
     */
    public SaltwaterFish(String name, double price, double tankSalinity) {
        super(name, price); // Call the constructor of the Fish class
        this.tankSalinity = tankSalinity;
    }

    /* Returns the tank salinity of the saltwater fish */
    public double getTankSalinity() {
        return tankSalinity;
    }

    /* Sets the tank salinity for the saltwater fish */
    public void setTankSalinity(double tankSalinity) {
        this.tankSalinity = tankSalinity;
    }

    /* Returns a string representation of the saltwater fish object */
    public String toString() {
        return super.toString() + ", Tank Salinity: " + tankSalinity + " ppt (Saltwater)";
    }
}