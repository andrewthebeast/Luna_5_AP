/********************************************************************************
 * Program Filename: Luna_5_Inventory.java
 * Author: Luna, Andrew
 * Date: December 15, 2016
 * Description: A inventory game that keeps track of things.
 * Input: The input is gathered from the class RNGDrops and the user input.
 * Output: This class prints out the information.
 ********************************************************************************/
package luna_5_inventory;
import java.util.*;
public class Luna_5_Inventory {
    //Variables to be used
    static Random rand = new Random();//creates a random variable to randomize what is droped
    static String userresponse;// Collects the user response
    static int droped;//holds the index of the droped item
    static int weight2 = 0;// contro;ls the weight of the backpack
    static RNGDrops drop = new RNGDrops("", 0, false, "");
    static boolean isdead = false;
    static Scanner scaned = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<RNGDrops> drops = new ArrayList<RNGDrops>();// creates a list of inventory
        ArrayList<RNGDrops> inventory = new ArrayList<RNGDrops>();//checks the inventory of the user
        // Sets inventory in the ArrayList drops
        RNGDrops item1 = new RNGDrops("An Apple", 2, false, "ate an apple");
        drops.add(item1);
        RNGDrops item2 = new RNGDrops("A bow", 10, false, "killed a attacker");
        drops.add(item2);
        RNGDrops item3 = new RNGDrops("a poisonous berry", 1, true, "Kills you");
        drops.add(item3);
        RNGDrops item4 = new RNGDrops("A health pack", 7, false, "are healed");
        drops.add(item4);
        RNGDrops item5 = new RNGDrops("Pair of binoculars", 5, false, "see enemies in the distance");
        drops.add(item5);        
        RNGDrops item6 = new RNGDrops("A sandwhich", 3, false, "ate a sandwhich");
        drops.add(item6);        
        RNGDrops item7 = new RNGDrops("A knife", 4, false, "stab a attacker");
        drops.add(item7);        
        RNGDrops item8 = new RNGDrops("A match", 1, false, "start a fire to keep you warm");
        drops.add(item8);        
        RNGDrops item9 = new RNGDrops("an attacker", 0, true, "an attacker approaches you and kills you");
        drops.add(item9);        
        RNGDrops item10 = new RNGDrops("A cannon ball", 15, false, "fire a cannon ball at an enemie base");
        drops.add(item10);
        intro();        
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
        while(isdead == false){
            int droped = rand.nextInt(10);
            System.out.println(weight2);
            System.out.println(drops.get(droped).getName() + " appears");
            //if an item can kill the player it does
            if(drops.get(droped).isKills() == true){
                isdead = true;
                System.out.println("You aquired " + drops.get(droped).getName() + " and you died");
                break;
            }
            ////asks the player if they want to get an item
            System.out.println("Would you like to pick it up?");
            userresponse = scaned.nextLine().toLowerCase();
            //for when a user picks up an item
            if (userresponse.contains("yes")) {
                weight2 += drops.get(droped).getWeight();
                inventory.add(drops.get(droped));
                System.out.println("You got " + drops.get(droped).getName());
                // for when a user denies an item
            }else if(userresponse.contains(("no"))){
                System.out.println("You passed up a " +  drops.get(droped).getName());
            // if a player wants to enter the menu
            }if (userresponse.contains("menu")) {
                menu(scaned, inventory, drops, isdead);
                break;
            }if (weight2 >=50) {
                isdead = true;
                System.out.println("You have too much weight.");
            }if(isdead == true){
                System.out.println("You died");
            }
            for (int i = 0; i < 10; i++) {
                System.out.println("");
            }
        }
    }
    /***************************************************************************
     * Method: intro()
     * Description: tells the main story
     * Parameters: None
     * Pre-Conditions: None
     * Post-Conditions: None
     **************************************************************************/
    public static void intro(){
        System.out.println("You are a soldier lost in enemie territory you must try to make it out.");
        System.out.println("If you eat something poisonous or aquire an attacker you die.");
        System.out.println("You can organize your inventory by entering organize anytine in the game.");
        System.out.println("Good Luck Soldier.");
    }
    /***************************************************************************
     * Method: menu()
     * Description: Allows the user to check their list use items or drop their items
     * Parameters: Scanner scaned, ArrayList inventory, ArrayList drops, boolean isdead
     * Pre-Conditions:  inventory must have some items
     * Post-Conditions: none
     **************************************************************************/
    public static void menu(Scanner scaned, ArrayList inventory, ArrayList drops, boolean isdead){
        System.out.println("Welcome to the menu to check your inventory enter check");
        System.out.println("To drop an item enter drop, and to use an item enter use");
        userresponse = scaned.nextLine().toLowerCase();
        //checks the inventory
        if (userresponse.contains("check")) {
            Iterator inventoryIterator = inventory.iterator();
            for (int i = 0; i < inventory.size(); i++) {
                drop = (RNGDrops)inventoryIterator.next();
                System.out.println( drop.getName());
            }
        //uses the elements in the list
        }if(userresponse.contains("use")){
            Iterator inventoryIterator = inventory.iterator();
            for (int i = 0; i < inventory.size(); i++) {
                drop = (RNGDrops)inventoryIterator.next();
                System.out.println("You " + drop.getAction());
                inventory.remove(i);
            }
            for (int i = 0; i < 10; i++) {
                System.out.println("");
        }
        //drops all of the things in the list
        }if (userresponse.contains("drop")) {
            Iterator inventoryIterator = inventory.iterator();
            for (int i = 0; i < inventory.size(); i++) {
                drop = (RNGDrops)inventoryIterator.next();
                System.out.println("You droped " + drop.getName());
            }
            inventory.removeAll(inventory);
            for (int i = 0; i < 10; i++) {
                System.out.println("");
            }
        }
        System.out.println("Would you like to contine searching?");
        userresponse = scaned.nextLine().toLowerCase();
        if (userresponse.contains("yes")) {
            isdead = false;
        }if(userresponse.contains("no")){
            menu(scaned, inventory, drops, isdead);
        }
    }
}