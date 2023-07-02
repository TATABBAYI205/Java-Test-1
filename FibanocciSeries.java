package Demo;

import java.util.Scanner;

public class FibanocciSeries 
{
    public static void main(String[] args) 
    {
    	int a = 0,b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
			System.out.print(a+" ");
			int c=a+b;
        	a=b;
        	b=c;
        }
    }
}

