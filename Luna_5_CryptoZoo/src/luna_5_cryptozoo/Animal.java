/********************************************************************************
 * Program Filename: Animal.java
 * Author: Luna, Andrew
 * Date: December 19, 2016
 * Description: Creates a name origin and rating for animals
 * Input: none
 * Output: class constructor named animal
 ********************************************************************************/
package luna_5_cryptozoo;
import java.util.*;
public abstract class Animal implements ZooAnimal{
    private String name;//sets the name of the creature
    private String origin;//sets the origin of the animal
    private int dangerrating;// sets the danger rating of the animal
    private boolean onTour = false;// sets if the animal is on tour
    /***************************************************************************
     * Method: Animal()
     * Description: makes a class constructor
     * Parameters: name, origin, and danger rating
     * Pre-Conditions: none
     * Post-Conditions: set name, origin and danger rating
     **************************************************************************/
    public Animal(String a, String b, int c){
        this.name = a;
        this.origin = b;
        this.dangerrating = c;
    }
    /***************************************************************************
     * Method: toString()
     * Description: returns the name origin and danger rating
     * Parameters: name, origin, and danger rating
     * Pre-Conditions: none
     * Post-Conditions: returns name, origin and danger rating
     **************************************************************************/
    public String toString(){
        return "Animal : " + name + "\n Orgin : " + origin + "\n Danger Rating" + dangerrating;
    }
    //Getters and Setters
    public boolean isOnTour() {
        return onTour;
    }
    public void setOnTour(boolean onTour) {
        this.onTour = onTour;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setOrgin(String origin) {
        this.origin = origin;
    }
    public void setDangerrating(int dangerrating) {
        this.dangerrating = dangerrating;
    }
    public String getName() {
        return name;
    }
    public String getOrigin() {
        return origin;
    }
    public int getDangerrating() {
        return dangerrating;
    }
     /***************************************************************************
     * Method: foodperWeek()
     * Description: sets the foodperweek
     * Parameters: none
     * Pre-Conditions: none
     * Post-Conditions: sets foodperweek
     **************************************************************************/
    public static int foodperWeek(){
        return 1;
    }
}