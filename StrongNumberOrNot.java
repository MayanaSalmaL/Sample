package ProgramsForGitPush;

import java.util.Scanner;

public class StrongNumberOrNot {




	public static boolean strong(int n)
	{
		
		int sum=0;
		
		int m=n;
		while(n>0)
		{
			int product=1;
			int r=n%10;
			for(int i=1;i<=r;i++)
			{
			
			product=product*i;
			
			}
			sum=sum+product;
			n=n/10;
			
		}
		
		System.out.println(sum);
		if(sum==m)
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
		
		
		
		boolean rs=strong(n);
		if(rs==true)
		{
			System.out.println("Strong number");
		}
		else {
		System.out.println("Not a strong number");
		}
	}

}
