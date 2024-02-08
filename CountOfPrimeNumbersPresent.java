package ProgramsForGitPush;

import java.util.Scanner;

public class CountOfPrimeNumbersPresent {
	
	public static boolean countOfPrimeNumbers(int n)
	{
		
		int count=0;
		for(int i=1;i<=50;i++)
		{
			if(n%i==0)
			{
				count++;
				
			}
		}
		
		if(count==2)
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		int count=0;
	
		for (int i=1;i<=50;i++)
		{
			
			boolean rs=countOfPrimeNumbers(i);
			if(rs==true)
			{
				count++;
			}
		
		}
		System.out.println(count);
		
		

	}

}
