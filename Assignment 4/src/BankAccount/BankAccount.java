package BankAccount;

/* **********************************************************
 * Programmer: Hanzala Ali
 * Class: CS30S
 * 
 * Assignment: Assignement 4
 *
 * Description:	describe the class you are creating
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class BankAccount
 {  // begin class
 	
     
 	// *********** class constants *********
 	
 	// ********** instance variable **********
            private String accountType = "";
            private String name = "";
            private int age = 0;
            private String dateOfBirth = "";
            private String email = "";
            private String phoneNumber = "";
            private double balance = 0.00;
            
            
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
            public BankAccount(String aT, String n, int a, String dof, String e, String p, double b){
                accountType = aT;
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
         public String getAccountType(){
             return this.accountType;
         }// end getAccountType
         
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
    Returns: person's name
 *****************************************************/
         public int getAge(){
             return this.age;
         }// end getAge
         
/*****************************************************
 Purpose: get person's date of birth
 Interface: IN: none
 Returns: person's name
 *****************************************************/
         public String getdateOfBirth (){
             return this.dateOfBirth;
         }// end getdateOfBirth
         
/*****************************************************
 Purpose: get person's email
 Interface: IN: none
 Returns: person's name
 *****************************************************/
         public String getEmail(){
             return this.email;
         }// end getEmail
         
/*****************************************************
 Purpose: get phone number
 Interface: IN: none
 Returns: person's name
 *****************************************************/
         public String getPhoneNumber(){
             return this.phoneNumber;
         }// end getPhoneNumber
         
/*****************************************************
 Purpose: get person's balance 
 Interface: IN: none
 Returns: person's name
 *****************************************************/
         public double getBalance(){
             return this.balance;
         }// end getBalance 
 
 /**************************************************
      * Purpose:    return a string of bank account properties
      * 
      * Interface:
      * in:         none
      * returns:    info: sting
 **************************************************/
         public String toString(){
             String output = "";
             
         output = String.format("Account Type: %16.5s\n",this.getAccountType());
         output += String.format("Name: %16.5s\n", this.getName());
         output += String.format("Age: %16.5s\n", this.getAge());
         output += String.format("Date Of Birth: %16.5s\n", this.getdateOfBirth());
         output += String.format("Email: %16.5s\n", this.getEmail());
         output += String.format("Phone Number: %16.5s\n", this.getPhoneNumber());
         output += String.format("Balance: %16.5f\n", this.getBalance());
         output += String.format("\n\n");
         
         return output;
         }// end toString
 	// ********** mutators **********
 
 }  // end clas