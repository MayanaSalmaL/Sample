package ProgramsForGitPush;

import java.util.Scanner;

public class CountingTheDigitsInGivenNumber {
	
	public static void main(String[] args) {
		
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		int m=n;
		int p=n;
		while(n>0) 
		{
			int r=n%10;
			count++;
			n=n/10;
			
		}
		System.out.println(count);
		
		System.out.println("With for loop");

		int countf=0;
	
		for(;m>0;n++)
		{
			int r=m%10;
			countf++;
			m=m/10;
			
		}
		System.out.println("for loop "+ countf);
	int countff=0;
		
		do
		{
			int r=p%10;
			countff++;
			p=p/10;
		}
		while(p>0);
		System.out.println(countff);
	}

}
