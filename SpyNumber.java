package ProgramsForGitPush;

import java.util.Scanner;

public class SpyNumber {
	static int product=1;
	static int sum=0;
public static void sum(int n)
{
	
	while(n>0)
	{
		int s=n%10;
		sum=sum+s;
		n=n/10;
	}
	System.out.println(sum);
}
	public static void product(int n)
	{
	
		while(n>0)
		{
			int s=n%10;
			product=product*s;
			n=n/10;
		}
		System.out.println(product);
}
	
	public static void display() {
		if(sum==product)
		{
			System.out.println("spy number");
		}
		else
			System.out.println("Not a spy number");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
sum(n);
product(n);
display();
	}

}
