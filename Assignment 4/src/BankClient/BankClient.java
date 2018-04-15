package BankClient;

// **********************************************************************
// Programmer: Hanzala Ali
// Class: CS30S
//
// Assignment: Assignment 4
//
// Description:	th eprogram will generate 3 different bank account one normal
// one checking and one savings
//
//	Input:n/a
//
//  Output:it will output the different types of bank accounts with their 
//  specific information
// ***********************************************************************


import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import BankAccount.*;
import BankAccount.BankAccount.Title;

public class BankClient/*CHANGE THIS TO THE NAME OF THE FILE*/
{  // begin class
	public static void main(String args[])
	{  // begin main
	// ***** declaration of constants *****
	
	// ***** declaration of variables *****
	
        String strin;				// string data input from keyboard
    	String strout;				// processed info string to be output
    	String bannerOut;			// string to print banner to message dialogs
    	
    	String prompt;				// prompt for use in input dialogs
    	
    	String delim = "[ :]+";		// delimiter string for splitting input string
    	String tabSpace = "      ";	// six spaces
        
	// ***** create objects *****
            DecimalFormat df = new DecimalFormat("0.00");
            ProgramInfo programInfo = new ProgramInfo();
            BankAccount bA = new BankAccount(Title.BankAccount,"Hanzala Ali",22,"4/14/1996","HanzalaAAli@gmail.com","204-645-7654",1000.00);
            CheckingAccount cA = new CheckingAccount(Title.CheckingAccount,"Hanzala Ali",73,"4/14/1945","hanzalaali43@gmail.com","204-374-6453",100000.00,5.00,1.000);
            SavingsAccount sA = new SavingsAccount(Title.SavingsAccount,"Hanzala Ali",32,"4/14/1986","hanzalalaali@yahoo.com","204-374-2832",80000.00,8,10.00);
            
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
                strout = programInfo.getBanner(" Inheritance ");
                System.out.println(strout);
		
        // ***** get input *****
	
        
	// ***** processing *****
	
		
	// ***** output *****
            
            //***** output object info*****
            System.out.println(bA.toString());
            System.out.println(cA.toString());
            System.out.println(sA.toString());
            
            //***** change properties of bank account*****
            bA.setTitle(Title.BankAccount);
            bA.setName("John Wick");
            bA.setAge(18);
            bA.setEmail("JohnWick@gmail.com");
            bA.setPhoneNumber("431-342-4323");
            bA.setBalance(200.00);
            bA.setdateOfBirth("3/13/2000");
            
            //***** change properties of savings account *****
            sA.setTitle(Title.SavingsAccount);
            sA.setName("Josephi Krakowski");
            sA.setAge(12);
            sA.setEmail("jkrakowski@outlook.com");
            sA.setPhoneNumber("1-800-432-3545");
            sA.setBalance(1500.00);
            sA.setdateOfBirth("5/2/2006");
            sA.setDepositRequirements(10.00);
            sA.setTransactionLimit(7);
            sA.setSavingsID(1234);
            
            //***** change properties of checking account *****
            cA.setTitle(Title.CheckingAccount);
            cA.setName("Tank Dempsey");
            cA.setAge(26);
            cA.setEmail("tdempsey@aol.con");
            cA.setPhoneNumber("204-342-1023");
            cA.setBalance(200.00);
            cA.setdateOfBirth("1/23/1992");
            cA.setCheckingID(1432);
            cA.setBillPayments(1800.00);
            cA.setTransferLimit(500.00);
            
            //***** output objects *****
            System.out.println(bA.toString());
            System.out.println(sA.toString());
            System.out.println(cA.toString());
	// ***** closing message *****
	
		System.out.println("end of processing");
	
	}  // end main	
}  // end class