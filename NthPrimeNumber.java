package ProgramsForGitPush;

import java.util.Scanner;

public class NthPrimeNumber {

	public static boolean prime(int n)
	{
		int count=0;
		if(n==1)
			return false;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		
		if(count==0)
		
			return true;
		else
			return false;
		
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		int count=0;
		for(int i=1;;i++)
		{
			boolean rs=prime(i);
			
			if(rs==true)
			{
				count++;
			}
			if(count==n)
			{
				System.out.println(i);
				break;
			}
			
		}
		
		

	}

}
