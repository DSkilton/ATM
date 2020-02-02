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
        deposit(100);
        displayBalance();
        withdraw(200);
        displayBalance();
    }
    
    public static void menu() {
    
    }
    
    public static double displayBalance(){
        System.out.print("Your current balance: " + DF.format(balance) + "\n");
        return balance;
    }
    
    public static double deposit(int iDeposit){
        return balance += iDeposit;
    }
    
    public static double withdraw(int iWithdraw){
        return balance -= iWithdraw;
    }
    
    public static void helpMenu(){
        System.out.print("This is the help menu ");    
    }
    
    public static void exit(){
        System.out.println("Thank you for using");
        System.exit(0);
    }
    
}
