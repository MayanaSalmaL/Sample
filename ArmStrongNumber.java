package ProgramsForGitPush;

import java.util.Scanner;

public class ArmStrongNumber {
	
	
	public static boolean armstrong(int n)
	{
		int sum=0;
		int m=n;
		int y=n;
		int count=0;
		
		while(n>0)
		{
			int r=n%10;
			count++;
			n=n/10;
			
		}
		
			
		while(m>0)
		{
			int product=1;
			int r=m%10;
			for(int i=1;i<=count;i++)
			{
			
			product=r*product;
			
			}
			sum=sum+product;
			m=m/10;
		
		}
		
		if(sum==y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		boolean rs=armstrong(n);
		
		if(rs==true)
		{
			System.out.println("ArmstronNumber");
		}
		else
		{
			System.out.println("Not a Armstrong number");
		}
		

	}

}
