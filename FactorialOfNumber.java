package ProgramsForGitPush;

import java.util.Scanner;

public class FactorialOfNumber {
	
	public void factorial(int n)
	{
		int product=1;
		for(int i=n;i>0;i--)
		{
			product=product*i;
		}
		System.out.println(product);
		
	}

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		FactorialOfNumber fn=new FactorialOfNumber();
		fn.factorial(n);
		
		
		
		
		
		

	}

}
