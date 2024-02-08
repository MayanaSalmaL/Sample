package ProgramsForGitPush;

import java.util.Scanner;

public class MagicNumber {
	
	public static boolean magic(int n)
	{
		while(n>9) {
			System.out.println(n);
			int sum=0;
			while(n>0)
			{
				int r=n%10;
				sum=sum+r;
				n=n/10;
				//System.out.println(sum);
			
			}
			
			n=sum;
		}
		
		if(n==1)
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
		
		boolean rs=magic(n);
		if(rs==true)
		{
			System.out.println("Given number is magic number");
		}
		else
		{
			System.out.println("Not a magic number");
		}

	}

}
