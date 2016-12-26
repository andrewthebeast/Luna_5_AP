/********************************************************************************
 * Program Filename: LingerLing.java
 * Author: Luna, Andrew
 * Date: December 19, 2016
 * Description: creates a class constructor and has getters and setters.
 * Input: class animal
 * Output: class constructor
 ********************************************************************************/
package luna_5_cryptozoo;
public class LingerLing extends Animal {
    private String foodType;// sets the food type
    private int foodAmt;// sets the food amount
     /***************************************************************************
     * Method: LingerLing()
     * Description: makes a class constructor
     * Parameters: name, origin, and danger rating
     * Pre-Conditions: none
     * Post-Conditions: sets super
     **************************************************************************/
    public LingerLing(String name, String origin, int dangerrating){
        super(name, origin, dangerrating);
    }
    // Getters and Setters
    public String getFoodType() {
        return "none";
    }
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
    public int getFoodAmt() {
        return 0;
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