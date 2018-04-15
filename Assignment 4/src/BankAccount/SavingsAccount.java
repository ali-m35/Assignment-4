package BankAccount;

/* **********************************************************
 * Programmer: Hanzala Ali
 * Class: CS30
 * 
 * Assignment: Assignment 4
 *
 * Description:	creates a saving account object
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
          private int savingID = 0000;       // saving account id
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
            public SavingsAccount(Title t, String n, int a, String dof, String e, String p, double b, int tL, double dR){
               
                super(t,n,a,dof,e,p,b);
                
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
        Purpose: get savings id
        Interface: IN: none
        Returns: savings id
    *****************************************************/
            public int getSavingsID(){
                return this.savingID;
            }//end getPersonID
           
    /*****************************************************
        Purpose: get person's transaction limit
        Interface: IN: none
        Returns: transaction limit
    *****************************************************/
            public int getTransactionLimit(){
                return this.transanctionLimit;
            }// end getTransactionLimit
    
    /*****************************************************
        Purpose: get deposit requirements
        Interface: IN: none
        Returns: deposit requirements
    *****************************************************/
            public double getDepositRequirements(){
                return this.depositRequirements;
            }// end getDepositRequirements
            
    /*****************************************************
        Purpose: returns a string of all checking account properties
        Interface: IN: none
        Returns: output string
     *****************************************************/
            public String toString(){
                String output = "";
                
         output = String.format("Account Type: %12s\n",this.getTitle());
         output += String.format("Name: %9s\n", this.getName());
         output += String.format("Age: %2s\n", this.getAge());
         output += String.format("Date Of Birth: %9s\n", this.getdateOfBirth());
         output += String.format("Email: %12s\n", this.getEmail());
         output += String.format("Phone Number: %12s\n", this.getPhoneNumber());
         output += String.format("Balance: $%4s\n", this.df.format(getBalance()));
         output += String.format("Savings ID: %4S\n", this.getSavingsID());
         output += String.format("Transaction Limit: %-2s\n", this.getTransactionLimit());
         output += String.format("Deposit Requirements: $%4s\n", this.df.format(getDepositRequirements()));
         output += String.format("\n\n");
                
                return output;
            }// end toString        
            
 	// ********** mutators **********
        
        /*****************************************************
        Purpose: set checking account id 
        Interface: IN: none
        Returns: checking account id
        *****************************************************/
            public void setSavingsID(int savingID) {
                this.savingID = savingID;
            }// end setSavingsId
            
        /*****************************************************
        Purpose: set transaction limit
        Interface: IN: none
        Returns: transaction limit
        *****************************************************/
            public void setTransactionLimit(int transactionLimit) {
                this.transanctionLimit = transactionLimit;
            }// end setTransactionLimit
            
        /*****************************************************
        Purpose: set deposit requirements
        Interface: IN: none
        Returns: deposit requirements
        *****************************************************/
            public void setDepositRequirements(double depositRequirements) {
                this.depositRequirements = depositRequirements;
            }// end setDepositRequirements
     
 }  // end class