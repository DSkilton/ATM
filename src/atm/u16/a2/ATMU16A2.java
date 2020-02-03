/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.u16.a2;

import java.text.DecimalFormat;

/**
 *
 * @author Duncan Skilton
 */
public class ATMU16A2 {
    private static double balance = 100.00;
    private static final DecimalFormat DF = new DecimalFormat("#.##");
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        displayBalance();
        deposit(300);
        displayBalance();
        withdraw(201);
        displayBalance();
    }
    
    public static void menu() {
    
    }
    
    public static double displayBalance(){
        System.out.println("\nDISPLAY BALANCE");
        System.out.print("Your current balance: " + DF.format(balance) + "\n");
        return balance;
    }
    
    public static double deposit(int iDeposit){
        System.out.println("\nDEPOSIT FUNDS");
        if(iDeposit <= 300) {
            System.out.println("Deposited Amount: " + iDeposit + "\nCurrent Balance: " + (iDeposit + balance)) ;
            return balance += iDeposit;
        } else System.out.println("Deposited amount must be less than £300");
        
        return iDeposit;
    }
    
    public static double withdraw(int iWithdraw){
        System.out.println("\nMAKE WITHDRAWEL");
        System.out.println("You can only withdraw amounts divisable by £10");
     
           if(iWithdraw > (balance + 10)) {
            System.out.println("You cannot withdraw that amount");
            return balance;
        }       
                
        return balance;
    }
    
    public static void helpMenu(){
        System.out.print("This is the help menu ");    
    }
    
    public static void exit(){
        System.out.println("Thank you for using");
        System.exit(0);
    }
    
}
