package ProgramsForGitPush;

import java.util.Scanner;

public class ProductOfEachDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int product=1;
		
		while(n>0)
		{
			int p=n%10;
			product=product*p;
			n=n/10;
		}
		System.out.println(product);
		

	}

}
