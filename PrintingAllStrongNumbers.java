package ProgramsForGitPush;

import java.util.Scanner;

public class PrintingAllStrongNumbers {
	
	public static boolean allStrongNumbers(int n)
	{
		int m=n;
		int sum=0;
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
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++)
		{
			boolean rs=allStrongNumbers(i);
		if(rs==true)
		{
			System.out.println(i);
		}
		}

	}

}
