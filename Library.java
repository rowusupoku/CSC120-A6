/* This is a stub for the Library class */
import java.util.Hashtable;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Map;


public class Library extends Building {

  //** Initilizes a hashtable that stores the books in the library*/
  private Hashtable<String, Boolean> collection;

  /** This is a constructor for the Library class that extends Building
   * @param name (string) the name of the library
   * @param address (string) the address of the library
   * @param nFloors (int) the number of floors the library has
   */
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
      
      System.out.println("You have built a library: 📖");
    }

  /** Method that modifies the hashtable; adds book to hashtable and sets its value as true
   * @param title (string) the title of the book 
   */
    public void addTitle(String title) {
      collection.put(title, true);
    }

  /** Method that modifies the hashtable; removes book form hashtable and sets its value to true
   * @param title (string) the title of the book 
   * @return (string) returns the title that was removed
   */
    public String removeTitle(String title) {
      collection.remove(title);
      return (title + "has been removed.");
    }
    
  /** Method that modifies the hashtable; checks book out from collection (sets it's value to false if true)
   * @param title (string) the title of the book 
   */
    public void checkOut(String title) {
      collection.replace(title, true, false);
    }

  /** Method that modifies the hashtable; returns book to collection (sets it's value to true if false)
   * @param title (string) the title of the book 
   */
    public void returnBook(String title) {
      collection.replace(title, false, true);
    }
  
  /** Method that modifies the hashtable; returns book to collection (sets it's value to true if false)
   * @param title (string) the title of the book 
   */
    public boolean containsTitle(String title) {
    // returns true if the title appears as a key in the Libary's collection, false otherwise
      if (collection.containsKey(title)) {
        return true;
      }
      else {
        return false;
      }
    }
  
  /** Method that checks if book is available in the collection (if value is true)
   * @param title (string) the title of the book 
   * @return (boolean) returns true if book is available and false if it is not
   */
    public boolean isAvailable(String title) {
    // returns true if the title is currently available, false otherwise
      if (containsTitle(title) == true) {
        boolean keyValue = collection.get(title);
        if (keyValue == true) {
          return true;
        }
        else {
          return false;
        }
      }
      else {
        return false;
      }
    }

  /** Method that prints out the entire collection in an easy-to-read way (including checkout status)
   */
    public void printCollection() {
      System.out.println("The entire library collection: ");

      Set<Entry<String, Boolean>> entries = collection.entrySet();
      
      for(Map.Entry<String, Boolean> entry : entries ) {
        System.out.println( "Title: " + entry.getKey() + "   Checkout Status: " + entry.getValue() );
      }
    }


    public static void main(String[] args) {
     Library neilsonLibrary = new Library("Neison Library", "7 Neilson Drive, Northampton, MA 01063", 4); 
     System.out.println(neilsonLibrary);

     neilsonLibrary.addTitle("The Cat in the Hat by Dr. Seuss");
     neilsonLibrary.addTitle("The Lorax by Dr. Seuss");
     neilsonLibrary.addTitle("Green Eggs and Ham by Dr. Seuss");
     neilsonLibrary.addTitle("How the Grinch Stole Christmas by Dr. Seuss");


     neilsonLibrary.removeTitle("The Cat in the Hat by Dr. Seuss");
     
     System.out.println(neilsonLibrary.containsTitle("Green Eggs and Ham by Dr. Seuss"));
     System.out.println(neilsonLibrary.containsTitle("The Lorax by Dr. Seuss"));
     System.out.println(neilsonLibrary.isAvailable("The Lorax by Dr. Seuss"));
     neilsonLibrary.checkOut("The Lorax by Dr. Seuss");
     neilsonLibrary.checkOut("How the Grinch Stole Christmas by Dr. Seuss");
     System.out.println(neilsonLibrary.isAvailable("The Lorax by Dr. Seuss"));
     neilsonLibrary.returnBook("The Lorax by Dr. Seuss");
     System.out.println(neilsonLibrary.isAvailable("The Lorax by Dr. Seuss"));




     System.out.println(neilsonLibrary.isAvailable("The Cat in the Hat by Dr. Seuss"));

     System.out.println(neilsonLibrary.containsTitle("One fish, Two fish, Red Fish, Blue Fish by Dr. Suess"));
     System.out.println(neilsonLibrary.containsTitle("Green Eggs and Ham by Dr. Seuss"));
     System.out.println(neilsonLibrary.containsTitle("The Cat in the Hat by Dr. Seuss"));


     neilsonLibrary.printCollection();







     
    }
  
  }