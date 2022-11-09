/* This is a stub for the Cafe class */

public class Cafe extends Building{

    //**  The number of ounces of coffee remaining in inventory */
    private int nCoffeeOunces; 
    //** The number of sugar packets remaining in inventory */ 
    private int nSugarPackets; 
    //** The number of "splashes" of cream remaining in inventory*/
    private int nCreams; 
    //** The number of cups remaining in inventory */
    private int nCups; 

  /** This is a constructor for the Cafe class that extends Building
   * @param name (string) the name of the cafe
   * @param address (string) the address of the cafe
   * @param nFloors (int) the number of floors the cafe has
   */
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);
        this.nCoffeeOunces = 3;
        this.nSugarPackets = 3;
        this.nCreams = 3;
        this.nCups = 3;

        System.out.println("You have built a cafe: ☕");
    }


    /** Method that uses products in inventory and calls restock if products in iventory runs out 
     * @param size (int) the number of ounces of coffee used
     * @param uSugarpackets (int) the number of sugar packets used
     * @param uCreams (int) the number of creamers used 
     */
    public void sellCoffee(int size, int uSugarPackets, int uCreams) {
        if (size > nCoffeeOunces) {
            restock(3, 0, 0, 0);
        }

        
        if (uSugarPackets > nSugarPackets) {
            restock(0, 3, 0, 0);
        }
            

        if (uCreams > nCreams) {
            restock(0, 0, 3, 0);
        }
    

        if (nCups == 0) {
            restock(0, 0, 0, 3);
        }

        nCoffeeOunces = nCoffeeOunces - size;
        nSugarPackets = nSugarPackets - uSugarPackets;
        nCreams = nCreams - uCreams;
        nCups = nCups - 1; 
    }

    /** Method that restocks products and increases value by given value 
     * @param pCoffeeOunces (int) the number of ounces of coffee added 
     * @param pSugarPackets (int) the number of sugar packets added
     * @param pCreams (int) the number of creamers added
     * @param pCups (int) the number of cups added 
     */
    private void restock(int pCoffeeOunces, int pSugarPackets, int pCreams, int pCups) {
        nCoffeeOunces = nCoffeeOunces + pCoffeeOunces;
        nSugarPackets = nSugarPackets + pSugarPackets;
        nCreams = nCreams + pCreams;
        nCups = nCups + pCups; 
    }


    
    public static void main(String[] args) {
       Cafe haymarketCafe = new Cafe("Haymarket Cafe", "60 Masonic St Ste B, Northampton, MA 01060-3070", 2);
       System.out.println(haymarketCafe);
       haymarketCafe.sellCoffee(2, 1, 1);
       haymarketCafe.sellCoffee(2, 1, 1);
       haymarketCafe.sellCoffee(2, 1, 1);
       haymarketCafe.sellCoffee(2, 1, 1);

    }
    
}
