package Demo;

import java.util.Scanner;

public class AvgOfTheList 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers (enter -1 to stop): ");
        int n;
        int sum = 0;
        int count = 0;
        do {
            n = sc.nextInt();
            if (n != -1) 
            {
                sum += n;
                count++;
            }
        } 
        while (n != -1);
            double average = (double) sum / count;
            System.out.println("Average: " + average);
    }
}


