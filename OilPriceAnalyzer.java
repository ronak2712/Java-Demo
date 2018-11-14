
/*
		File Name: OilPriceAnalyzer.java
			 Author: Ronakkumar Vaghasiya
			   Date: 08-Mar-2018 5:58:27 PM
	Description: It is allows to enter daily oil price and calculete the average price and give maximum and minimum oil price with veriaions.  

*/
import java.util.Scanner;


public class OilPriceAnalyzer
{

	public static void main(String[] args)
	{
		Scanner myinput = new Scanner (System.in);
		System.out.println("\t\t\t\t Ronak's Oil Price Analyer Program");
		System.out.println("\t\t\t\t *********************************");
		System.out.println("This program will calculate and display some statistics about oil prices.");
		System.out.println();
		System.out.print("Enetr How many price will be entered:");
		int numOfPrice = myinput.nextInt();
		myinput.nextLine();
		System.out.println();
		double [] oilprices = new double[numOfPrice];
		for (int i = 0 ; i<oilprices.length; i++)
			{
			
			System.out.print("Enter Price " + (i+1) + "and press ENTER: $");
			oilprices[i]= myinput.nextDouble();
			myinput.nextLine();
			}
		System.out.println();
		System.out.println("Here are the statistics for the prices entered:");
		System.out.println("The average price of was $"+ averagePriceOfOil(oilprices)+  " per barrel");
		System.out.println("The highest daily price was $" + maxValue(oilprices)  + " per barrel");
		System.out.println("The lowest daily price was $" + minValue(oilprices) + " per barrel");
		System.out.println("The range of daily prices was $" + findRange(oilprices) );
		
		
		}
	
	/*
  Method Name:  averagePriceOfOil
      Purpose:  to find the average of the oil prices
      Accepts:  double array
      Returns:  double
*/
	static double averagePriceOfOil (double [] theArray)
	{
		double runningTotal = 0;	
		for(int index = 0; index < theArray.length; index++)
		{
			runningTotal += theArray[index];
		}
		return roundIt((runningTotal/theArray.length));
	}

	/*
  Method Name:  roundIt
      Purpose:  for rounding up
      Accepts:  double
      Returns:  double
*/
   static double roundIt(double number)
     {
    	 return  ((int)((number * 100) + .5 )) / 100.0;
     }
     
     /*
     Method Name:  maxValue
         Purpose:  get maximimum value from array
         Accepts:  array
         Returns:  double
   */
     
   static double maxValue(double [] array) 
     {
       double maxValue = array[0];
       for (int i = 1; i < array.length; i++)
       {
           if (array[i] > maxValue)
           {
               maxValue = array[i];
           }
       }
       return roundIt(maxValue);
     }
   
   /*
   Method Name:  maxValue
       Purpose:  get minimum value from array
       Accepts:  array
       Returns:  double
 */
   
 static double minValue(double [] array) 
   {
     double minValue = array[0];
     for (int i = 1; i < array.length; i++)
     {
         if (array[i] < minValue)
         {
             minValue = array[i];
         }
     }
     return roundIt(minValue);
   }
 
 /*
 Method Name:  findRange
     Purpose:  get range from highest and lowest  value of 
     Accepts:  array
     Returns:  double
*/
 
 static double  findRange(double[] theArray)
 {
	 
	 double range = maxValue(theArray) -minValue(theArray);
	 return roundIt(range);
 }
 
 
}


