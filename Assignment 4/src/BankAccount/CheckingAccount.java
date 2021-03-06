package BankAccount;

/* **********************************************************
 * Programmer: Hanzala Ali
 * Class: CS30S
 * 
 * Assignment: Assingment 4
 *
 * Description: this class will create a checking account object with its properties
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 public class CheckingAccount extends BankAccount
 {  // begin class
     
 	// *********** class constants **********
            
            private static int nextID = 1000; // id value
            
 	// ********** instance variable **********
            private int checkingID = 0;             // id for account
            private double transferLimit = 0.00;    // how much money you can transfer
            private double billPayments = 0.00;     // your bills
            
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
       checkingID = nextID++
       transferLimit = tRL
       billPayments = bL
    Returns: none
 *****************************************************/
            public CheckingAccount(Title t, String n, int a, String dof, String e, String p, double b, double tRL, double bL){
                
                super(t,n,a,dof,e,p,b);
                
                checkingID = nextID++;
                transferLimit = tRL;
                billPayments = bL;
            
            }// end CheckingAccount
     
 /*****************************************************
 Purpose: create person object
 Interface: IN: none
 *****************************************************/
            public CheckingAccount(){
                // default checkingaccount
            }// end default CheckingAccount
            
 	// ********** accessors **********
 	
  /*****************************************************
        Purpose: get the checking account id
        Interface: IN: none
        Returns: checking account id
  *****************************************************/
            public int getCheckingId(){
                return this.checkingID;
            }// end getCheckingId
            
   /*****************************************************
        Purpose: get person's transfer limit
        Interface: IN: none
        Returns: transfer limit
    *****************************************************/
            public double getTransferLimit(){
                return this.transferLimit;
            }// end getTransferLimit
            
     /*****************************************************
        Purpose: get person's bill payments 
        Interface: IN: none
        Returns: bill payments
    *****************************************************/
            public double getBillPayments(){
                return this.billPayments;
            }// end getBillPayments 
            
     /*****************************************************
        Purpose: returns a string of all checking account properties
        Interface: IN: none
        Returns: output string
     *****************************************************/
            public String toString(){
                String output = "";
                
         output = String.format("Account Type: %12s\n",this.getTitle());
         output += String.format("Name: %10s\n", this.getName());
         output += String.format("Age: %-2s\n", this.getAge());
         output += String.format("Date Of Birth: %9s\n", this.getdateOfBirth());
         output += String.format("Email: %12s\n", this.getEmail());
         output += String.format("Phone Number: %12s\n", this.getPhoneNumber());
         output += String.format("Balance: $%2s\n", this.df.format(getBalance()));
         output += String.format("Account ID: %4s\n", this.getCheckingId());
         output += String.format("Transfer Limit: $%4s\n", this.df.format(getTransferLimit()));
         output += String.format("Bill Payments: $%4s\n", this.df.format(getBillPayments()));
         output += String.format("\n\n");
                
                return output;
            }// end toString
 	// ********** mutators **********
 
        /*****************************************************
        Purpose: set checking account ID
        Interface: IN: none
        Returns: checking account id
        *****************************************************/
            public void setCheckingID (int checkingID){
                this.checkingID = checkingID;
            }// end setCheckingID
            
        /*****************************************************
        Purpose: set Transfer Limit
        Interface: IN: none
        Returns: transfer limit
        *****************************************************/
            public void setTransferLimit (double transferLimit){
                this.transferLimit = transferLimit;
            }// end setTransferLimit
            
        /*****************************************************
        Purpose: set bill payments
        Interface: IN: none
        Returns: bill payments
        *****************************************************/
            public void setBillPayments(double billPayments){
                this.billPayments = billPayments;
            }// setBillPayment
            
 }  // end class