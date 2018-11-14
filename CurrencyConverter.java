import java.util.Scanner;

/*
		File Name: CurrencyConverter.java
			 Author: Ronakkumar Vaghasiya
			   Date: 14-Feb-2018 3:30:37 PM
	Description:Curremcy Converter program: Pound to Euros

*/

public class CurrencyConverter
{

	public static void main(String[] args)
	{
		// Print header 
		System.out.println("\t\t\t Welcome to ROnak's Currency Converter");
		System.out.println("\t\t\t *************************************");
		Scanner myInput = new Scanner(System.in);
		 
		// take user input to choose the currency to covert
		System.out.print("Please tell me what Currency you have that you would like to convert: ");
		String currencyType = myInput.nextLine().toLowerCase();
		System.out.print("Please enter the nuber of "+ currencyType + " you would like to convert: ");
		double amount = myInput.nextDouble();
		
		myInput.nextLine(); // buffer flush
		
		//Decalier the reust veriable for store the result after the calculations
		double result = 0;
		
		// create temporary veriable for better output
		String temp = "";
		String tempCurrancy = "";
		
	// Assign the constate value for calculation of currency convert
			final double POUNDS_TO_EURO = (amount * 1.13856) ; 
			final double EUROS_TO_POUNDS = amount * 0.878302;
			
			switch(currencyType)
			{	
			case "pounds" :
				tempCurrancy = "Pounds";
						 result=	POUNDS_TO_EURO;
						temp = "Erous" ;
			break;
			
			case "euros":
				tempCurrancy ="Eurous";
					result = EUROS_TO_POUNDS;
					temp = "Pounds";
			break;

			default:
		  tempCurrancy = currencyType;
			temp = "NOT SUPPORTED";
			
			}
			
			// round up process
		result = result * 100;
		result = result + .5;
		result = (int)(result);
		result = result / 100.0;
			
		// Display the worth of money that after the convert 
		System.out.println("your " + amount +" "+ tempCurrancy +   " are worth " + result+" " + temp +  ".");
	}

}
