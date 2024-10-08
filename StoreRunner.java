public class StoreRunner {
    public static void main(String[] args) {
        /*
         * Create instances of different types of fish.
         * Instantiate a fresh water fish, a salt water fish,
         * and a marine fish, each with their 
         * name and price. 
         */
        FreshwaterFish guppy = new FreshwaterFish("Guppy", 2.99, "Community Tank");
        SaltwaterFish clownfish = new SaltwaterFish("Clownfish", 15.99, 35.0);
        MarineFish lionfish = new MarineFish("Lionfish", 29.99, "Coral Reef");

        /*
         * Print out the details of each fish object.
         */
        System.out.println(guppy);
        System.out.println(clownfish);
        System.out.println(lionfish);
    }
}