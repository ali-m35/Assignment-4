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
 	
 	// *********** class constants **********
 	
 	
 	// ********** instance variable **********
            private String name = "";
            private int id = 0;
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
            public BankAccount(String n, int ID, int a, String dof, String e, String p, double b){
                name = n;
                id = ID;
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
    Purpose: get persons id
    Interface: IN: none
    Returns: person's name
 *****************************************************/
         public int getID(){
             return this.getID();
         }// end getID
         
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
         
 	// ********** mutators **********
 
 }  // end class