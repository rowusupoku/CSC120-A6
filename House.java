/* This is a stub for the House class */
import java.util.ArrayList;
  
public class House extends Building {

  //** Initilizes an arrayList that stores the residents in the house */
  private ArrayList<String> residents;
  //** Initilizes a boolean statement that returns if house has dining room or not */ 
  private Boolean hasDiningRoom;

  /** This is a constructor for the House class that extends Building
   * @param name (string) the name of the house
   * @param address (string) the address of the house
   * @param nFloors (int) the number of floors the house has
   * @param hasDiningRoom (boolean) true or false for if the house has a dining room 
   */
  public House(String name, String address, int nFloors, Boolean hasDiningRoom) {
    super(name, address, nFloors);
    if (hasDiningRoom != null) { this.hasDiningRoom = hasDiningRoom; }
    this.residents = new ArrayList<String>();

    System.out.println("You have built a house: 🏠");
  }
  
  /** Accessor that retrieves boolean value for hasDiningRoom
   * @return (boolean) returns the value stored in hasDiningRoom 
   */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }

  /** Accessor that retrieves value for the number of residents in array list 
   * @return (int) returns the value of the counter that iterates through the size of the array list 
   */
  public int nResidents() {
    //Accessor that retrieves value for the number of residents in array list 
    int counter = residents.size();
    return (counter);
  }

  /** Method that modifies the array list; adds student name to the array list 
   * @param name (string) the given name
   */
  public void moveIn(String name) {
    residents.add(name); //adds new residents from array list 
    System.out.println(name + " has moved in!");      
  }

  /** Method that modifies the array list; removes student name to the array list 
   * @param name (string) the given name
   * @return (string) Returns the name of the student who moved out
   */
  public String moveOut(String name) {
    residents.remove(name); //removes current residents from array list 
    return(name + " has moved out :( "); 
  } 

  /** Method that checks if the given name exists in array list 
   * @param name (string) the given name
   * @return (string) Returns the name of the student who moved out
   */
  public boolean isResident(String person){
    if(residents.contains(person)) {
      return true;
    } 
    else {
      return false;
    }   
  }


  public static void main(String[] args) {
   House cutterHouse = new House("Cutter House", "10 Prospect St, Northampton, MA 01060", 4, true);
   System.out.println(cutterHouse);
   System.out.println(cutterHouse.hasDiningRoom());
   cutterHouse.moveIn("Hannah Green");
   cutterHouse.moveIn("Betty Orange");
   System.out.println("The current number of residents is: " + cutterHouse.nResidents());
   System.out.println(cutterHouse.moveOut("Betty Orange"));
   System.out.println("The current number of residents is: " + cutterHouse.nResidents());
   System.out.println(cutterHouse.isResident("Betty Orange"));
   System.out.println(cutterHouse.isResident("Hannah Green"));

   
  }

}