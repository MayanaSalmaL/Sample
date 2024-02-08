package ProgramsForGitPush;

import java.util.Scanner;

public class SumOfPrimeNumbersUserEnteredRanges {
	
	public static boolean prime(int i)
	{
		int count=0;
		if(i==1)
		{
			return false;
		}
	for(int j=2;j<=i/2;j++)
	{
		if((i%j)==0)
		{
			System.out.println(i+"-"+j);
			
			//count++;
			return false;
			
		}
		
		
		}
		//if(count==2)
	return true;
		//else
			//return false;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number1");
		int firstRange=sc.nextInt();
		System.out.println("Enter the number2");
		int lastRange=sc.nextInt();
		int sum=0;
		for(int i=firstRange;i<=lastRange;i++)
		{
			
			boolean rs=prime(i);
			if(rs==true)
				{
				sum=sum+i;
				
				
				}
			
			
			
				}
		System.out.println(sum);
	
		
	
/*	int sum=0;
	for(int i=2;i<=10;i++)
	{
		
		
		if(10%i==0)
			sum=sum+i;
		
		
		

	}
	System.out.println(sum);
	*/

	}

}
