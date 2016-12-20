/********************************************************************************
 * Program Filename: Luna_5_Inventory.java
 * Author: Luna, Andrew
 * Date: December 15, 2016
 * Description: Creates the RNGDrops constructor to be used in the main class of Luna_5_Inventory 
 * Input: None
 * Output: None
 ********************************************************************************/
package luna_5_inventory;
public class RNGDrops {
    public String name;
    public int weight;
    public boolean kills;
    public String action;
    public RNGDrops(String a , int b, boolean c, String d){// creates a class constructor for RNGDrops
        this.name = a;
        this.weight = b;
        this.kills = c;
        this.action = d;
    }
    public String getName() {
        return this.name;
    }
    public int getWeight() {
        return this.weight;
    }
    public boolean isKills() {
        return this.kills;
    }
    public String getAction() {
        return this.action;
    }
}