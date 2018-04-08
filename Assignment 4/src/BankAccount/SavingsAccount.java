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
 
 
 public class SavingsAccount extends BankAccount
 {  // begin class
 	
 	// *********** class constants **********
                
                public static int nextID = 1000;
     
 	// ********** instance variable **********
 	
          private int employeeID = 1000;      
          private int trasanctionLimit = 0; // how many transactions can be made per month
 	  private int depositRequirements = 0; // monthly deposit requirements 
     
 	// ********** constructors ***********
    /*****************************************************
        Purpose: create Savings Account Object
        Interface:
        Input:
        name = n
        id = ID
        age = a
        dateOfBirth = dof
        email = e;
        phoneNumber = p
        balance = b
        transactionLimit = tL
        depositRequirements = dR
        Returns: none
    *****************************************************/
            public SavingsAccount(String n, int a, String dof, String e, String p, double b, int tL, int dR){
               
                super(n,a,dof,e,p,b);
                
                employeeID = nextID++;
                trasanctionLimit = tL;
                depositRequirements = dR;
                
            }// end savingsaccount
    /*****************************************************
        Purpose: create default Savings Account object
        Interface: IN: none
        Returns: none
    *****************************************************/
            public SavingsAccount(){
                
            }// end SavingAccount

 	// ********** accessors **********
    /*****************************************************
        Purpose: get person's id
        Interface: IN: none
        Returns: person's name
    *****************************************************/
            public int getPersonID(){
                return this.employeeID;
            }//end getPersonID
           
    /*****************************************************
        Purpose: get person's transaction limit
        Interface: IN: none
        Returns: person's name
    *****************************************************/
            public int getTransactionLimit(){
                return this.trasanctionLimit;
            }// end getTransactionLimit
    
    /*****************************************************
        Purpose: get person's transaction limit
        Interface: IN: none
        Returns: person's name
    *****************************************************/
            public int getDepositRequirements(){
                return this.depositRequirements;
            }// end getDepositRequirements
            
 	// ********** mutators **********
 
 }  // end class