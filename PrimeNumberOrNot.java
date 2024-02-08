package ProgramsForGitPush;

import java.util.Scanner;



public class PrimeNumberOrNot {
	public boolean prime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
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
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		PrimeNumberOrNot p=new PrimeNumberOrNot();
		boolean rs=p.prime(n);
		
		if(rs==true)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
		

	}

}
