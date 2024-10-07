/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankSystem;
//Main Class
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 *
 * @author FALCON
 */
public class OptionMenu extends Account{
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
    
    public void getLogin() throws IOException{
        int x = 1;
        
        do {
            try {
                data.put(206598, 1010);
                data.put(203711, 12345);
               
                System.out.println("Welcome to the ATM project !");
                
                System.out.println("Enter your Customer Number: ");
                setCustomerNumber(menuInput.nextInt());
                
                System.out.println("Enter yout Pin Number: ");
                setPinNumber(menuInput.nextInt());
                
                } catch (Exception e){
                    System.out.println("Invalid characters only numbers");
                    x = 2;
                }
            for(Entry<Integer, Integer> entry : data.entrySet()){
                if(entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()){
                        getAccountType();
                
            }
        }
            System.out.println("""
                               
                               Wrong Customer Number or Pin Number. 
                               """);
           
        }while(x == 1);
    }
        /* Display Account Type Menu with Selection */
    public void getAccountType() {
        System.out.println("Select the Account you want to access: ");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");
        System.out.println("Choice: ");
        
        selection = menuInput.nextInt();
        
        
        switch(selection){
            
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank you for using this ATM, bye.");
                break;
                
            default:
                System.out.println("""
                                   
                                   Invalid Choice.
                                   """);
                getAccountType();
        }
        
        
              }
    public void getChecking(){
        System.out.println("Checking Account: ");
        System.out.println("Type 1 - View Balance");
        System.out.println("Type 2 - Withdraw Funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");
        
        selection = menuInput.nextInt();
        
        switch(selection){
            case 1: 
                System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
                
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
                
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
                
            case 4:
                System.out.println("Thank you for using this ATM, bye !");
                break;
                
            default:
                System.out.println("""
                                   
                                   Invalid choice.
                                   """);
                getChecking();
        }
    }
        public void getSaving() {
            System.out.println(" Saving Account: ");
            System.out.println("Type 1 - View Balance");
            System.out.println("Type 2 - Withdraw Funds");
            System.out.println("Type 3 - Deposit Funds");
            System.out.println("Type 4 - Exit");
            System.out.println("Choice: ");
            
            selection = menuInput.nextInt();
            
            switch(selection){
                case 1:
                    System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
                    getAccountType();
                    break;
                    
                case 2:
                    getSavingWithdrawInput();
                    getAccountType();
                    break;
                    
                case 3:
                    getSavingDepositInput();
                    getAccountType();
                    break;
                
                case 4:
                    System.out.println("Thank you for using the ATM, bye.");
                    break;
                    
                default:
                    System.out.println("""
                                       
                                       Invalid choice.
                                       """);
                    getSaving();
            }
        }
        int selection;
    }
    
    

