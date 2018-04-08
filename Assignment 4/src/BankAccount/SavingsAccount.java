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
                
                private static int nextID = 1000;
     
 	// ********** instance variable **********
 	
          private int savingID = 0000;      
          private int transanctionLimit = 0; // how many transactions can be made per month
 	  private double depositRequirements = 0.00; // monthly deposit requirements
     
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
            public SavingsAccount(String aT, String n, int a, String dof, String e, String p, double b, int tL, double dR){
               
                super(aT,n,a,dof,e,p,b);
                
                savingID = nextID++;
                transanctionLimit = tL;
                depositRequirements = dR;
                
            }// end savingsaccount
    /*****************************************************
        Purpose: create default Savings Account object
        Interface: IN: none
        Returns: none
    *****************************************************/
            public SavingsAccount(){
                // defaultsavings account
            }// end SavingAccount

 	// ********** accessors **********
    /*****************************************************
        Purpose: get person's id
        Interface: IN: none
        Returns: person's name
    *****************************************************/
            public int getPersonID(){
                return this.savingID;
            }//end getPersonID
           
    /*****************************************************
        Purpose: get person's transaction limit
        Interface: IN: none
        Returns: person's name
    *****************************************************/
            public int getTransactionLimit(){
                return this.transanctionLimit;
            }// end getTransactionLimit
    
    /*****************************************************
        Purpose: get person's transaction limit
        Interface: IN: none
        Returns: person's name
    *****************************************************/
            public double getDepositRequirements(){
                return this.depositRequirements;
            }// end getDepositRequirements
            
 	// ********** mutators **********
 
 }  // end class