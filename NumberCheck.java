package Demo;

import java.util.Scanner;

public class NumberCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n= sc.nextInt();
		
		if(n>0)
		{
			System.out.println("The number "+n+" is positive.");
		}
		else if(n<0)
		{
			System.out.println("The number "+n+" is negative.");
		}
		else
		{
			System.out.println("The number is Zero.");
		}	
	}
}
