package ProgramsForGitPush;

import java.util.Scanner;

public class SumOfEvenDigits_OddDigits {

	
	public static void oddDigits(int n)
	{
		
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			if(r%2!=0)
			{
				sum=sum+r;
				
			}
			n=n/10;
		}
		System.out.println("sum of odd didgits"+sum);
	
	}
	public static void evenDigits(int n)
	{
		
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			if(r%2==0)
			{
				sum=sum+r;
				
			}
			n=n/10;
		}
		System.out.println("sum of even digits "+sum);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		oddDigits(n);
		evenDigits(n);

	}

}
