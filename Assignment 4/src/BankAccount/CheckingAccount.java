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
            public CheckingAccount(Title t, String n, int a, String dof, String e, String p, double b, double tRL, double bL){
                
                super(t,n,a,dof,e,p,b);
                
                checkingID = nextID++;
                transferLimit = tRL;
                billPayments = bL;
            
            }// end CheckingAccount
     
 	// ********** accessors **********
 	
  /*****************************************************
        Purpose: get the checking account id
        Interface: IN: none
        Returns: person's name
  *****************************************************/
            public int getCheckingId(){
                return this.checkingID;
            }// end getCheckingId
            
   /*****************************************************
        Purpose: get person's transfer limit
        Interface: IN: none
        Returns: person's name
    *****************************************************/
            public double getTransferLimit(){
                return this.transferLimit;
            }// end getTransferLimit
            
     /*****************************************************
        Purpose: get person's bill payments 
        Interface: IN: none
        Returns: person's name
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
                
         output = String.format("Account Type: %16.5s\n",this.getTitle());
         output += String.format("Name: %16.5s\n", this.getName());
         output += String.format("Age: %16.5s\n", this.getAge());
         output += String.format("Date Of Birth: %16.5s\n", this.getdateOfBirth());
         output += String.format("Email: %16.5s\n", this.getEmail());
         output += String.format("Phone Number: %16.5s\n", this.getPhoneNumber());
         output += String.format("Balance: %16.5f\n", this.getBalance());
         output += String.format("Account ID: %16.5s\n", this.getCheckingId());
         output += String.format("Transfer Limit: %16.5f\n", this.getTransferLimit());
         output += String.format("Bill Payments: %16.5f\n", this.getBillPayments());
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