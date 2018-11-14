

public class Helper
{
	
	
	/* methodd Name: countWords
	 Purpose to count word in String
	 Accept: String
	 Return: int
*/

	public static int countWord(String a)
	{
		a= a.trim();
		int counter= 1;
		if(a.length() == 0)
		{
			return 0;
			
		}
		else
		{
			for (int index = 0; index<= a.length(); index++ )
			{
				if (a.charAt(index)== ' ')
				{
					if (a.charAt(index + 1) == ' ')
					{ 
						counter --;
					}
					counter ++;
					
				}
			}
		}
		return counter ;
	}

	/* methodd Name: palindrome
	 * 	 Purpose to check the word is palindrome
	 Accept: String
	 Return: boolean
*/
	
	
	
	
	{
		String b="";
		String s= " ";
		
		
	}
	
	
}





