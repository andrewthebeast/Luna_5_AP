/********************************************************************************
 * Program Filename: Zoo.java
 * Author: Luna, Andrew
 * Date: December 19, 2016
 * Description: Creates the creatures and shows them
 * Input: animal and other classes
 * Output: 
 ********************************************************************************/
package luna_5_cryptozoo;
import java.util.*;
public class Zoo {
    static ArrayList<Animal> creatures = new ArrayList<Animal>();// list of creatures
    static Scanner scan = new Scanner(System.in);//Scanner
    static int input;//String for Scanner
    static String name;// sets the name of the animal
    static String origin;// sets the origin of the animal
    static int dangerrating;//sets the dangerrating of the animal
    static String foodType;// sets the food type of the animal
    static int foodAmt;//sets the food amount of the animal
    static String Input;// used to gater non numeral input
    static int animali;//used to set a new animal in the array list
    static int index;// index of animal
    static boolean ontour;
     /***************************************************************************
     * Method: list()
     * Description: sets elements in the array list creatures
     * Parameters: classes mythical, paranormal, linger ling and creatures
     * Pre-Conditions: none
     * Post-Conditions: none
     **************************************************************************/
    public static void list(){
        Mythical animal1 = new Mythical("Fairy", "Woods", 0, "dreams", 20);//1st animal
        creatures.add(animal1);
        Mythical animal2 = new Mythical("Barney", "your dreams", 25, "songs", 100);// 2nd animal
        creatures.add(animal2);
        Mythical animal3 = new Mythical("Whale", "under the sea", 10, "flying fish", 75);//3rd Animal
        creatures.add(animal3);
        Paranormal animal4 = new Paranormal("Bigfoot", "forrest", 50, "meat", 5);//4th animal
        creatures.add(animal4);
        Paranormal animal5 = new Paranormal("Lizard Man", "Lab", 40, "", 7);//5th animal
        creatures.add(animal5);
        LingerLing animal6 = new LingerLing("Zombie", "graveyard", 35);//6th animal
        creatures.add(animal6);
        LingerLing animal7 = new LingerLing("Vampire", "the dark", 28);//7th animal
        creatures.add(animal7);
        LingerLing animal8 = new LingerLing("Werewolf", "", 1000);//8th animal
        creatures.add(animal8);
        FossilRelative animal9 = new FossilRelative("Dinosaur", "eggs", 15);//9th animal
        creatures.add(animal9);
        FossilRelative animal10 = new FossilRelative("Monkey", "the jungle", 20);//10th animal
        creatures.add(animal10);
    }
     /***************************************************************************
     * Method: showAll()
     * Description: displays the creatures
     * Parameters: array list creatures
     * Pre-Conditions: none
     * Post-Conditions: displays the array list creature
     **************************************************************************/
    public static void showAll(){
        System.out.println("Welcome to The Crypto Zoo! What would you like todo?");
        System.out.println("1.See all of your animals.");
        System.out.println("2.Add an animal");
        System.out.println("3.Remove a animal");
        System.out.println("4.Mark an animal on tour");
        System.out.println("5.Remove a animal from tour");
        input = scan.nextInt();
        // to see all of the animals
        if(input == 1){
            for (int i = 0; i < creatures.size(); i++) {
                System.out.println("Name : " + creatures.get(i).getName());
                System.out.println("Origin : " + creatures.get(i).getOrigin());
                System.out.println("Danger rating : " + creatures.get(i).getDangerrating());
                System.out.println("Food Type : " + creatures.get(i).getFoodType());
                System.out.println("Food Per Week : " + creatures.get(i).foodperWeek());
                System.out.println("Food Amount : " + creatures.get(i).getFoodAmt());
                System.out.println("");
            }
            System.out.println("");
            showAll();
        }
        // to add an animal
        if (input == 2){
            System.out.println("what type of animal is it?");
            System.out.println("1. Mythical");
            System.out.println("2. Paranormal");
            System.out.println("3. Linger Ling");
            System.out.println("4. Fossil Relative");
            input = scan.nextInt();
            // adds a mythical creature to the list
            if (input ==1) {
                System.out.println("Please enter the name.");
                Input = scan.nextLine().toLowerCase();
                name = Input;
                System.out.println("Please enter the origin.");
                Input = scan.nextLine().toLowerCase();
                origin = Input;
                System.out.println("Please enter the dangerrating.");
                input = scan.nextInt();
                dangerrating = input;
                System.out.println("Please enter the food type.");
                Input = scan.nextLine().toLowerCase();
                foodType = Input;
                System.out.println("Please enter the food amount.");
                input = scan.nextInt();
                foodAmt = input;
                animali = creatures.size() + 1;
                Mythical animali = new Mythical(name, origin, dangerrating, foodType, foodAmt);
                creatures.add(animali);
            }
            // adds a paranormal creature to the list
            if (input == 2) {
                System.out.println("Please enter the name.");
                Input = scan.nextLine().toLowerCase();
                name = Input;
                System.out.println("Please enter the origin.");
                Input = scan.nextLine().toLowerCase();
                origin = Input;
                System.out.println("Please enter the dangerrating.");
                input = scan.nextInt();
                dangerrating = input;
                System.out.println("Please enter the food type.");
                Input = scan.nextLine().toLowerCase();
                foodType = Input;
                System.out.println("Please enter the food amount.");
                input = scan.nextInt();
                foodAmt = input;
                animali = creatures.size() + 1;
                Paranormal animali = new Paranormal(name, origin, dangerrating, foodType, foodAmt);
                creatures.add(animali);
            }
            // adds a linger ling to the list
            if (input == 3) {
                System.out.println("Please enter the name.");
                Input = scan.nextLine().toLowerCase();
                name = Input;
                System.out.println("Please enter the origin.");
                Input = scan.nextLine().toLowerCase();
                origin = Input;
                System.out.println("Please enter the dangerrating.");
                input = scan.nextInt();
                dangerrating = input;
                animali = creatures.size() + 1;
                LingerLing animali = new LingerLing(name, origin, dangerrating);
                creatures.add(animali);
            }
            // adds a fossil realtive
            if (input == 4) {
                System.out.println("Please enter the name.");
                Input = scan.nextLine().toLowerCase();
                name = Input;
                System.out.println("Please enter the origin.");
                Input = scan.nextLine().toLowerCase();
                origin = Input;
                System.out.println("Please enter the dangerrating.");
                input = scan.nextInt();
                dangerrating = input;
                animali = creatures.size() + 1;
                FossilRelative animali = new FossilRelative(name, origin, dangerrating);
                creatures.add(animali);
            }
            showAll();
        }
        //to remove an animal
        if (input == 3){
            System.out.println("Please enter the index of the creature.");
            input = scan.nextInt();
            index = input - 1;
            creatures.remove(index);
        }
        // sets or removes an animal on tour
        if (input == 4){
            System.out.println("What would you like todo?");
            System.out.println("1.Set an animal on tour");
            System.out.println("2.Remove an animal from tour");
            System.out.println("3.See whiuch animals are on tour");
            input = scan.nextInt();
            //sets an animal on tour
            if (input == 1) {
                System.out.println("Please enter the index of the creature");
                input = scan.nextInt();
                index = input - 1;
                creatures.get(index).setOnTour(true);
            }
            //removes an animal on tour
            if (input == 2) {
                System.out.println("Please enter the index of the creature");
                input = scan.nextInt();
                index = input - 1;
                creatures.get(index).setOnTour(false);
            }
            // an animal on tour
            if (input == 1) {
                System.out.println("Here are the animals that are on tour");
                for (int i = 0; i < creatures.size(); i++) {
                    if(creatures.get(i).isOnTour()== true){
                        System.out.print(creatures.get(i).getName() +" is on tour.");
                    }if (creatures.get(i).isOnTour() == false) {
                        System.out.print(creatures.get(i).getName() + " is not on tour.");
                    }
                }
            }
        }
    }
}