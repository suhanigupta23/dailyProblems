//Printing N numbers of Fibonacci series 
import java.util.*;
public class Program
{
    public static void main(String[] args)
    {
		Scanner scn=new Scanner(System.in);
        System.out.println("Enter the number of terms required for the Fibonacci series:");
        int n=scn.nextInt();
        System.out.println("0");
        System.out.println("1");
        int a=0;
        int b=1;
        for (int i=1;i<=n-2;i++)
        {
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }

	}
