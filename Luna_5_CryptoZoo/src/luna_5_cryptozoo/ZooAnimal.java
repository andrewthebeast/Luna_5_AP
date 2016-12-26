/********************************************************************************
 * Program Filename: ZooAnimal.java
 * Author: Luna, Andrew
 * Date: December 19, 2016
 * Description:
 * Input:
 * Output:
 ********************************************************************************/
package luna_5_cryptozoo;
public interface ZooAnimal {
    public void setFoodType(String food);
    public String getFoodType();
    public void setFoodAmt(int amt);
    public int getFoodAmt();
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
