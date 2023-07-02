package Demo;

import java.util.Scanner;

public class LargestNum 
{
	public static void main(String[] args) 
	{
		int largenum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int n1=sc.nextInt();
		System.out.println("Enter the second number : ");
		int n2=sc.nextInt();
		System.out.println("Enter the Third number : ");
		int n3=sc.nextInt();
		
		if(n1>=n2)
		{
			if(n1>=n3)
			{
				largenum = n1;
			}
			else
			{
				largenum =n3;
			}
		}
		else
		{
			if(n2>= n3)
			{
				largenum = n2;
			}
			else
			{
				largenum =n3;
			}
		}
		System.out.println("The largest number is : "+largenum);	
	}
}
