package BankClient;

// **********************************************************************
// Programmer:	Rob Sveinson
// Class:		CS20S
//
// Assignment:	aX qy
//
// Description:	a brief description of the program goes here
//
//
//	Input:		describe any input from keyboard or file
//
//  Output:		describe the result of your program
// ***********************************************************************


import javax.swing.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import BankAccount.*;

public class BankClient/*CHANGE THIS TO THE NAME OF THE FILE*/
{  // begin class
	public static void main(String args[])
	{  // begin main
	// ***** declaration of constants *****
	
	// ***** declaration of variables *****
	
        String strin;				// string data input from keyboard
    	String strout;				// processed info string to be output
    	String bannerOut;			// string to print banner to message dialogs
    	
    	String prompt;				// prompt for use in input dialogs
    	
    	String delim = "[ :]+";		// delimiter string for splitting input string
    	String tabSpace = "      ";	// six spaces
        
	// ***** create objects *****
		
            ProgramInfo programInfo = new ProgramInfo();
        
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
                strout = programInfo.getBanner("Inheritance");
                System.out.println(strout);
		
        // ***** get input *****
	
        
	// ***** processing *****
	
		
	// ***** output *****
	
		// all formatted ouput is printed in this section

	// ***** closing message *****
	
		System.out.println("end of processing");
	
	}  // end main	
}  // end class