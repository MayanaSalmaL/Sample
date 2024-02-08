package ProgramsForGitPush;

import java.util.Scanner;

public class PalindromeNumberOrNot {
	
	public static boolean palindrome(int n)
	{
		int m=n;
		int r=0;
		while(n>0)
		{
	    r=r*10;
		
		r+=n%10;
		
		n=n/10;
		
		
		}
		
		
		if(r==m)
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
		
		boolean rs=palindrome(n);
		
		if(rs==true)
		
			{
			System.out.println("Palindrome");
			}
		
		else
		{
			System.out.println("Not a palindrome");
		}

	}

}
