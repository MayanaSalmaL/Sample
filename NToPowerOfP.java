package ProgramsForGitPush;

import java.util.Scanner;

public class NToPowerOfP {
	
	
	public static void power(int base,int power)
	{
		
		int product=1;
		for(int i=0;i<=power;i++)
		{
			if(i==0)
			{
				product=1;
			}
			else
			{
				product=product*base;
			}
			
		}
		System.out.println(product);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the base number");
		
		int base=sc.nextInt();
		System.out.println("Enter power number");
		int power=sc.nextInt();
		power(base,power);

	}

}
