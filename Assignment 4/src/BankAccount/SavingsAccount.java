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
            
    /*****************************************************
        Purpose: returns a string of all checking account properties
        Interface: IN: none
        Returns: output string
     *****************************************************/
            public String toString(){
                String output = "";
                
         output = String.format("Account Type: %16.5s\n",this.getAccountType());
         output += String.format("Name: %16.5s\n", this.getName());
         output += String.format("Age: %16.5s\n", this.getAge());
         output += String.format("Date Of Birth: %16.5s\n", this.getdateOfBirth());
         output += String.format("Email: %16.5s\n", this.getEmail());
         output += String.format("Phone Number: %16.5s\n", this.getPhoneNumber());
         output += String.format("Balance: %16.5f\n", this.getBalance());
         output += String.format("Transaction Limit: %16.5s\n", this.getTransactionLimit());
         output += String.format("Deposit Requirements; %16.5f\n", this.getDepositRequirements());
         output += String.format("\n\n");
                
                return output;
            }// end toString        
            
 	// ********** mutators **********
 
 }  // end class