package ProgramsForGitPush;

import java.util.Scanner;

public class SumOfEachDigits {

	public static void main(String[] args) {
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		
		while(n>0)
		{
			int r=n%10;
			
			sum=sum+r;
			n=n/10;
		}
		System.out.println(sum);
	}

}
