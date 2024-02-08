package ProgramsForGitPush;

import java.util.Scanner;

public class UserEnteredNumberPerfectNumberOrNot {
	
	public static boolean perfect(int n)
	{ int sum=0;
		
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			
			}

		}
		
		if(sum==n)
		
		return true;
		else
			return false;
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		boolean result=perfect(n);
		
		if(result==true) {
			System.out.println("Perfect number");
			
		}
		else
			System.out.println("Not perfect");



	}

}
