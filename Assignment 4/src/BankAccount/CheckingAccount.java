package BankAccount;

/* **********************************************************
 * Programmer:	Rob Sveinson
 * Class:		CS20S
 * 
 * Assignment:	aX  qY
 *
 * Description:	describe the class you are creating
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class CheckingAccount extends BankAccount
 {  // begin class
 	
 	// *********** class constants **********
            
            private static int nextID = 0000;
            
 	// ********** instance variable **********
            private int checkingID = 0;
            private double transferLimit = 0.00;
            private double billPayments = 0.00; 
            
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
            public CheckingAccount(String aT, String n, int a, String dof, String e, String p, double b, double tRL, double bL){
                
                super(aT,n,a,dof,e,p,b);
                
                checkingID = nextID++;
                transferLimit = tRL;
                billPayments = bL;
            
            }// end CheckingAccount
     
 	// ********** accessors **********
 	
 	// ********** mutators **********
 
 }  // end class