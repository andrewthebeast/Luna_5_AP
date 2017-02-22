/********************************************************************************
 * Program Filename : Luna_5_Connect4.java
 * Author : Luna, Andrew
 * Date : January 13, 2016
 * Description : Makes a connect four game
 * Input : user 
 * Output: connect four game
 ********************************************************************************/
package luna_5_connect4;
import java.util.*;
public class Luna_5_Connect4 {
    static int row = 6;//size of the rows
    static int col = 6;//size of the columns
    static char[][] board = new char[row][col];//board size
    static String p1name;//player 1's name
    static String p2name;//player 2's name
    public static void main(String [] args){
        System.out.println("Welcome to Connect 4\nTHIS GAME CANNOT CHECK FOR A DIAGONAL WIN!!!!!\nPlease enter player 1's name");
        Scanner pname1 = new Scanner(System.in);
        p1name = pname1.nextLine();
        System.out.println("Please enter player 2's name");
        Scanner pname2 = new Scanner(System.in);
        p2name = pname2.nextLine();
        boolean play = true;
        for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    board[i][j] = '■';
                }
            }
        //controls the game
        while (play) {
            //prints out board
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println("");
            }
            //collects player 1's input
            System.out.println(p1name + "'s turn\nEnter the column to place your chip.");//space out the methods collects the players input
            p1Turn();
            if(p1Check() == true){
                System.out.println(p1name + " Win's");
                play = false;
                break;
            }
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println("");
            }
            //collects player2's input
            System.out.println(p2name + "'s turn\nEnter the column to place your chip.");//space out the methods collects the players input
            p2Turn();
            if(p2Check() == true){
                System.out.println(p2name + " Win's");
                play = false;
                break;
            }
        }
    }
    
    /***************************************************************************
     * Method: p1Turn()
     * Description: Collects the 1st players input
     * Parameters: None
     * Pre-Conditions: play has to be true
     * Post-Conditions: None
     **************************************************************************/
    public static void p1Turn(){
        Scanner input = new Scanner(System.in);
        int pcol = input.nextInt();
        pcol -= 1;
        int bottem = row-1;
        int count = 1;
        while(true){
            if(pcol > col){
                break;
            }
            if (board[bottem][pcol] == '■') {
                board[bottem][pcol] = '●';
                break;
            }if(board[bottem][pcol] == '●' || board[bottem][pcol] == '○'){
                if(board[bottem-count][pcol] == '■'){
                    board[bottem-count][pcol] = '●';
                    break;
                }
            }
            count++;
            if(count > row){
                break;
            }
        }
    }
    
    /***************************************************************************
     * Method: p2Turn()
     * Description: Collects the 2nd players input
     * Parameters: None
     * Pre-Conditions: play has to be true
     * Post-Conditions: None
     **************************************************************************/
    public static void p2Turn(){
        Scanner input = new Scanner(System.in);
        int pcol = input.nextInt();
        pcol -= 1;
        int bottem = row-1;
        int count = 1;
        while(true){
            if(pcol > col){
                break;
            }
            if (board[bottem][pcol] == '■') {
                board[bottem][pcol] = '○';
                break;
            }if(board[bottem][pcol] == '●' || board[bottem][pcol] == '○'){
                if(board[bottem-count][pcol] == '■'){
                    board[bottem-count][pcol] = '○';
                    break;
                }
            }
            count++;
            if(count > row){
                break;
            }
        }
    }

    /***************************************************************************
     * Method: p1Check()
     * Description: Checks to see if the 1st player has won
     * Parameters: None
     * Pre-Conditions: play has to be true
     * Post-Conditions: None
     **************************************************************************/
    public static boolean p1Check(){
        int chipsinarow = 0;
        boolean checkvert = true;
        while (checkvert) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (i-1 >=0) {
                        if(board[i-1][j] == '●'){
                            chipsinarow += 1;
                        }else{
                            chipsinarow += 0;
                        }
                        if(chipsinarow == 4){
                            checkvert = false;
                        }
                    }
                }
            }
            break;
        }
        int chipsinarow2 = 0;
        boolean checkhor = true;
        while (checkhor) {
            for (int j = 0; j < col; j++) {
                for (int i = 0; i < row; i++) {
                    if (j+1 < 6) {
                        if(board[i][j+1] == '●'){
                            chipsinarow2 += 1;
                        }else{
                            chipsinarow2 += 0;
                        }
                        if(chipsinarow2 == 4){
                            checkhor = false;
                        }
                    }
                }
            }
            break;
        }
        boolean haswon;
        if(checkvert == false||checkhor == false){
            haswon = true;
        }else{
            haswon = false;
        }
        return haswon;
    }
    
     /***************************************************************************
     * Method: p2Check()
     * Description: Checks to see if the 2nd player has won
     * Parameters: None
     * Pre-Conditions: play has to be true
     * Post-Conditions: None
     **************************************************************************/
    public static boolean p2Check(){
        int chipsinarow = 0;
        boolean checkvert = true;
        while (checkvert) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (i-1 >=0) {
                        if(board[i-1][j] == '○'){
                            chipsinarow += 1;
                        }else{
                            chipsinarow += 0;
                        }
                        if(chipsinarow == 4){
                            checkvert = false;
                        }
                    }
                }
            }
            break;
        }
        int chipsinarow2 = 0;
        boolean checkhor = true;
        while (checkhor) {
            for (int j = 0; j < col; j++) {
                for (int i = 0; i < row; i++) {
                    if (j+1 < 6) {
                        if(board[i][j+1] == '○'){
                            chipsinarow2 += 1;
                        }else{
                            chipsinarow2 += 0;
                        }
                        if(chipsinarow2 == 4){
                            checkhor = false;
                        }
                    }
                }
            }
            break;
        }
        boolean haswon;
        if(checkvert == false||checkhor == false){
            haswon = true;
        }else{
            haswon = false;
        }
        return haswon;
    }

}