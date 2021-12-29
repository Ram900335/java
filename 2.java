import java.util.*;
class StringSearch {
	static String firstString, secondString;
	public static void main(String[] args)
	{
		int numberOfTimes = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first String");
		firstString = in.nextLine();
		System.out.println("Enter the second String");
		secondString = in.nextLine();
		for (int i = 0; i < firstString.length(); i++) 
		{
			System.out.println(i);
			if(check(i)) 
			{
				numberOfTimes = numberOfTimes + 1;
			}
		}
		System.out.println("no of times: " + numberOfTimes);
	}
	
	public static boolean check(int i) 
	{
		boolean flag = false;
		for (int j = 0; i < secondString.length(); i++, j++) 
		{
			System.out.println(firstString.charAt(i) + ", " + secondString.charAt(j));
			
			if (firstString.charAt(i) == secondString.charAt(j)) 
			{
				flag = true;
			}
			
			if (flag == false) 
			{
				return false;
			}
		}
		return flag;
	}
}
