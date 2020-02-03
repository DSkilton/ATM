/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.u16.a2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Duncan Skilton
 */
public class ATMU16A2 {
    private static double balance = 100.00;
    private static final DecimalFormat DF = new DecimalFormat("#.##");
    private static final Scanner SC = new Scanner(System.in);
    private static boolean bChoice = false;
    private static String sAnswer;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mainMenu();
    }
    
 static void mainMenu() {
        int iMenuNumber; 
        int iAmount;
        
        while (bChoice != true){
            System.out.println("Choose one of the following: \n"
                    + "1. Display Balance\n"
                    + "2. Deposit Funds\n"
                    + "3. Withdraw\n"
                    + "4. Help\n"
                    + "0. Exit\n");

            iMenuNumber = SC.nextInt();

            switch (iMenuNumber) {
                case 1:
                    bChoice = true;
                    System.out.println("\nDISPLAY BALANCE");
                    displayBalance();
                    break;
                case 2:
                    bChoice = true;
                    System.out.println("\nDEPOSIT FUNDS");
                    System.out.print("Enter amount to deposit: ");
                    iAmount = SC.nextInt();
                    deposit(iAmount);
                    break; 
                case 3:
                    System.out.println("\nMAKE WITHDRAWEL");
                    System.out.print("Enter amount to withdraw: ");
                    bChoice = true;
                    iAmount = SC.nextInt();
                    withdraw(iAmount);
                    break;
                case 4:
                    bChoice = true;
                    helpMenu();
                    break;
                case 0:
                    exit();
                    break;
                default:
                    break;
            }//end of switch 
        }//end of while loop
    }//end of main menu 
    
    public static double displayBalance(){
        System.out.print("Your current balance: " + DF.format(balance) + "\n");
        choice();
        return balance;
    }
    
    public static double deposit(int iDeposit){
        if(iDeposit <= 300) {
            System.out.println("Deposited Amount: " + iDeposit + "\nCurrent Balance: " + (iDeposit + balance)) ;
            choice();
            return balance += iDeposit;
        } else System.out.println("Deposited amount must be £300 or less");
        
        choice();
        return iDeposit;
    }
    
    public static double withdraw(int iWithdraw){
        System.out.println("You can only withdraw amounts divisable by £10");
     
        if(iWithdraw > (balance + 10)) {
         System.out.println("You cannot withdraw that amount");
         return balance;
        
        }       
           
        choice();
        return balance;
    }
    
    public static void helpMenu(){
        System.out.print("This is the help menu ");    
        choice();
    }
    
    public static void choice(){
        
        System.out.println("Would you like to return to the Main Menu? Yes or No?");
        sAnswer = SC.next().toLowerCase();
        
        if(!sAnswer.equals("yes") && (!sAnswer.equals("no"))){
            System.out.println("Check your spelling");
            choice();
        } 
        
        if(sAnswer.equals("yes")){
            bChoice = false;   
        }  else exit();
        
    }
    
    public static void exit(){
        System.out.println("Thank you for using");
        System.exit(0);
    }
    
}
