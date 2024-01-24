//In a range of input two numbers we have to print all the prime numbers
import java.util.*;
public class Program
{
    public static void main(String[] args)
    {
		Scanner scn=new Scanner(System.in);
        System.out.println("Enter the lower number of range: ");
        int n1=scn.nextInt();
        System.out.println("Enter the upper number of range: ");
        int n2=scn.nextInt();
        for (int i=n1;i<=n2;i++)//starting from the numbers range
        {
            int count=0;
            for (int j=2;j*j<=i;j++)
            {  
                if(i%j==0)
                {
                 count++;
                 break;
                }
            }
            if(count==0)
            {
                System.out.println(i);
                //printing the prime number in the range input and moving to the next number.
            }
        }
    
	}
}
