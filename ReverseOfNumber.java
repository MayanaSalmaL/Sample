package ProgramsForGitPush;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		
		
		int rev=0;
		while(n>0)
		{
		int r=n%10;
			
			n=n/10;
			System.out.print(r);
		}
		System.out.println("Enter the number");
		int m=sc.nextInt();
		while(m>0)
		{
			int i=m%10;
			
			 rev=rev*10+i;
			m=m/10;
			
		}
		System.out.println(rev);
		

	}

}
