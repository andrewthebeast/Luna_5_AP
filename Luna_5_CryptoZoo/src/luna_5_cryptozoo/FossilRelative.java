/********************************************************************************
 * Program Filename: FossilRelative.java
 * Author: Luna, Andrew
 * Date: December 19, 2016
 * Description:creates a class constructor for Fossil Relative and sets the food per week
 * Input:class lingerling
 * Output: class constructor for fossil relative
 ********************************************************************************/
package luna_5_cryptozoo;
public class FossilRelative extends LingerLing {
     /***************************************************************************
     * Method: FossilRelative()
     * Description: makes a class constructor
     * Parameters: name, origin, and danger rating
     * Pre-Conditions: none
     * Post-Conditions: sets name, origin and danger rating
     **************************************************************************/
    public FossilRelative(String name, String origin, int dangerrating){
        super(name, origin, dangerrating);
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