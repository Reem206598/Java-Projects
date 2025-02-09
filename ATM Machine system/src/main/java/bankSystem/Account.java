/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankSystem;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author FALCON
 */
public class Account {
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    
    /* Set the customer number */
    
    public int setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
        return customerNumber;
    }
    /* Get Customer Number */
    
    public int getCustomerNumber(){
        return customerNumber;
    }
    /* Set the pin Number */
    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
        
    }
    /*Get the pin Number */
    public int getPinNumber(){
        return pinNumber;
    }
    /* Get Checking Account balance */
    
    public double getCheckingBalance(){
        return checkingBalance;
        
    }
    /* Get saving Account Balance */
    public double getSavingBalance(){
        return savingBalance;
    }
    /* Calculate Checking Account withdrawl */
    public double calcCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
        
    }
    public double calcSavingWithdraw(double amount){
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }
    public double calcCheckingDeposit(double amount){
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }
        /* Calculate saving account withdrawl*/
    public double calcSavingDeposit(double amount){
        savingBalance = (savingBalance + amount);
        return savingBalance;
        
    }
        /* Customer checking account withdrawl input */
    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from Checking Account: ");
        double amount = input.nextDouble();
        
        
        if ((checkingBalance - amount ) >= 0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account balance: " + moneyFormat.format(checkingBalance));
        }
    }
    /* Customer Saving Withdraw input*/
    
    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from saving account: ");
        double amount = input.nextDouble();
        
        if ((savingBalance - amount) >= 0){
            calcSavingWithdraw(amount);
            System.out.println("New Saving Balance: " + savingBalance + "\n");
            } else {
            System.out.println("Balance cannot be negative" + "\n" );
            
        }
        
    }
    
    /* Customer Checking Account Deposit input */
    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to deposit from Checking Account: ");
        double amount = input.nextDouble();
        
        if((checkingBalance + amount) >= 0){
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account balance : " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Balance cannot be negatvie");
            
        }
    }
    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to deposit from Saving Account: ");
        double amount = input.nextDouble();
        
        if((savingBalance + amount) >= 0){
            calcSavingDeposit(amount);
            System.out.println("New Saving Account balance: " + moneyFormat.format(savingBalance));
        } else {
            System.out.println("Balance cannot be negative");
            
        }
    }
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;
    
    }

