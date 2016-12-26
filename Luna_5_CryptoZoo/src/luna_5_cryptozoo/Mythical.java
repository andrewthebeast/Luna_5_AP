/********************************************************************************
 * Program Filename: Mythical.java
 * Author: Luna, Andrew
 * Date: December 19, 2016
 * Description: makes a class constructor and getters and setters.
 * Input: animal
 * Output: mythical class constructor, set food type, and set food amount.
 ********************************************************************************/
package luna_5_cryptozoo;
public class Mythical extends Animal {
    private String foodType;// sets the food type
    private int foodAmt;// sets the food amount
     /***************************************************************************
     * Method: Mythical()
     * Description: makes a class constructor
     * Parameters: name, origin, and danger rating, int, and int
     * Pre-Conditions: none
     * Post-Conditions: set name, origin and danger rating, food type and food amount
     **************************************************************************/
    public Mythical(String name, String origin, int dangerrating, String type, int amt){
        super(name, origin, dangerrating);
        this.foodType = type;
        this.foodAmt = amt;
    }
    // Getters and Setters
    public String getFoodType() {
        return foodType;
    }
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
    public int getFoodAmt() {
        return foodAmt;
    }
    public void setFoodAmt(int foodAmt) {
        this.foodAmt = foodAmt;
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