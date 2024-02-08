package ProgramsForGitPush;

import java.util.Scanner;

public class PrintingPalindromeNumbers {


	public  static  boolean palindromeNumbers(int n)
	{
		int temp=n;
         
			int rev=0;
	while(n>0)
	{
		
		int r=n%10;
		
		rev=rev*10+r;
		
		n=n/10;
		
	}
	return temp==rev;
	
		
}
		
	

	

	public static void main(String[] args) {





for(int i=100;i<=200;i++)
{
	
     if(palindromeNumbers(i))
     {
	System.out.println(i);
     }
}

		/*for(int i=100;i<=200;i++)
		{
			int rev=0;
			int n=i;
			while(n>0)
			{

				int r=n%10;
				//System.out.println(r);
				rev=rev*10+r;
				//System.out.println(rev);
				n=n/10;
				//System.out.println(n);


			}
			if(i==rev)
			{
				System.out.println(i);
			}

		}*/


	}

}
