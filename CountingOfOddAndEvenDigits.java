package ProgramsForGitPush;

import java.util.Scanner;

public class CountingOfOddAndEvenDigits {

	 
	public static void oddDigits(int n)
	{
		int count=0;
		while(n>0)
		{
			int s=n%10;
			
			if(n%2!=0)
			{
				count++;
			}
			n=n/10;
			
		}
		System.out.println(count);
		
	}
	
	public static void evenDigits(int n)
	{
		int count=0;
		
		while(n>0)
		{
			int s=n%10;
		if(n%2==0)
		{
			count++;
		
		}
		n=n/10;
		}
		System.out.println(count);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
int n=sc.nextInt();
oddDigits(n);
evenDigits(n);
	}

}
