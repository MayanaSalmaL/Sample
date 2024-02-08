package ProgramsForGitPush;

import java.util.Scanner;

public class BuzzNumberOrNot {
	
	public static boolean buzz(int n)
	
	{
		int r=n%10;
		if(r==7 || n%7==0)
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
	
	boolean rs=buzz(n);
	
	if(rs==true)
	{
		System.out.println("It is a buzz number");
	}
	else
	{
		System.out.println("Not buzz number");
	}

	}

}
