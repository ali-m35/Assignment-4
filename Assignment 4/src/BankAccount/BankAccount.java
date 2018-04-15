package BankAccount;

/* **********************************************************
 * Programmer: Hanzala Ali
 * Class: CS30S
 * 
 * Assignment: Assignement 4
 *
 * Description:	this class will create a normal bank account 
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 import java.text.DecimalFormat;
 

 public class BankAccount
 {  // begin class
 	
        //****** create object *****
        DecimalFormat df = new DecimalFormat("0.00");
        
             public enum Title{
                 SavingsAccount,BankAccount,CheckingAccount
             }// end enum title
     
 	// *********** class constants *********
 	
 	// ********** instance variable **********
            
            private Title title = null;         // account type 
            private String name = "";           // the name of th bank account holder
            private int age = 0;                // the persons age
            private String dateOfBirth = "";    // their date of birth
            private String email = "";          // their email
            private String phoneNumber = "";    // their phone number
            private double balance = 0.0;       // the account balance
            
 	// ********** constructors ***********
 /*****************************************************
    Purpose: create Bank Account Object
    Interface:
       Input:
       name = n
       id = ID
       age = a
       dateOfBirth = dof
       email = e;
       phoneNumber = p
       balance = b
    Returns: none
 *****************************************************/
            public BankAccount(Title t, String n, int a, String dof, String e, String p, double b){
                title = t;
                name = n;
                age = a;
                dateOfBirth = dof;
                email = e;
                phoneNumber = p;
                balance = b;
            }// end person
            
 /*****************************************************
 Purpose: create person object
 Interface: IN: none
 *****************************************************/	 
	 public BankAccount(){
		 // defaultconstructor use 
	 } // end default BankAccount	            
            
 	// ********** accessors **********
         
 /*****************************************************
    Purpose: get person's name
    Interface: IN: none
    Returns: person's name
 *****************************************************/
         public String getName(){
             return this.name;
         }// end getName
         
/*****************************************************
    Purpose: get person's age
    Interface: IN: none
    Returns: person's age
 *****************************************************/
         public int getAge(){
             return this.age;
         }// end getAge
         
/*****************************************************
 Purpose: get person's date of birth
 Interface: IN: none
 Returns: person's date of birth
 *****************************************************/
         public String getdateOfBirth (){
             return this.dateOfBirth;
         }// end getdateOfBirth
         
/*****************************************************
 Purpose: get person's email
 Interface: IN: none
 Returns: person's email
 *****************************************************/
         public String getEmail(){
             return this.email;
         }// end getEmail
         
/*****************************************************
 Purpose: get phone number
 Interface: IN: none
 Returns: person's phone number
 *****************************************************/
         public String getPhoneNumber(){
             return this.phoneNumber;
         }// end getPhoneNumber
         
/*****************************************************
 Purpose: get person's balance 
 Interface: IN: none
 Returns: person's balance
 *****************************************************/
         public double getBalance(){
             return this.balance;
         }// end getBalance
         
/*****************************************************
 Purpose: get account type
 Interface: IN: none
 Returns: account type
 *****************************************************/
         public Title getTitle(){
             return this.title;
         }// end getTite
 
 /**************************************************
      * Purpose:    return a string of bank account properties
      * 
      * Interface:
      * in:         none
      * returns:    info: sting
 **************************************************/
         public String toString(){
             String output = "";
         
         output = String.format("Account Type: %12s\n", this.getTitle());
         output += String.format("Name: %10s\n", this.getName());
         output += String.format("Age: %-2s\n", this.getAge());
         output += String.format("Date Of Birth: %9s\n", this.getdateOfBirth());
         output += String.format("Email: %12s\n", this.getEmail());
         output += String.format("Phone Number: %12s\n", this.getPhoneNumber());
         output += String.format("Balance: $%4s\n", this.df.format(getBalance()));
         output += String.format("\n\n");
         
         return output;
         }// end toString
 	// ********** mutators **********

        /*****************************************************
        Purpose: set account type
        Interface: IN: none
        Returns: account type
        *****************************************************/
                public void setTitle(Title title){
                    this.title = title;
                }// end setTitle
        
        /*****************************************************
        Purpose: set persons name
        Interface: IN: none
        Returns: person name
        *****************************************************/
                public void setName(String name){
                    this.name = name;
                }// end setName
                
        /*****************************************************
        Purpose: set persons age 
        Interface: IN: none
        Returns: person's age
        *****************************************************/
                public void setAge(int age){
                    this.age = age;
                }// end setAge
                
        /*****************************************************
        Purpose: set persons date of birth
        Interface: IN: none
        Returns: person's date of birth
        *****************************************************/
                public void setdateOfBirth(String dateOfBirth){
                    this.dateOfBirth = dateOfBirth;
                }// end setdateOfBirth
                
        /*****************************************************
        Purpose: set person's email
        Interface: IN: none
        Returns: persons email
        *****************************************************/
                public void setEmail(String email){
                    this.email = email;
                }// end setEmail
                
        /*****************************************************
        Purpose: set persons phone number
        Interface: IN: none
        Returns: person phone number
        *****************************************************/
                public void setPhoneNumber(String phoneNumber){
                    this.phoneNumber = phoneNumber;
                }// end setPhoneNumber
                
        /*****************************************************
        Purpose: set person's balance 
        Interface: IN: none
        Returns: person's balance
        *****************************************************/
                public void setBalance(double balance){
                    this.balance = balance;
                }// end setBalance
                
 }  // end class