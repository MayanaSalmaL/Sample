package ProgramsForGitPush;

import java.util.Scanner;

public class NeonNumberOrNot {
	
	public static boolean neon(int n)
	{
		int sum=0;
		
			int product=n*n;
			
			while(product>0)
			{
				int r=product%10;
				sum=sum+r;
				product=product/10;
				
				
			}
			
			if(sum==n)
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
		
		boolean rs=neon(n);
		if(rs==true)
		{
			System.out.println("Neon number");
		}
		else
		{
			System.out.println("Not a neon number");
		}

	}

}
