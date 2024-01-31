//****
// ***
//  **
//   *
import java.util.*;
public class Program
{
    public static void main(String[] args) 
    {
		Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=n;i>=0;i--)
        {
           for(int j=n-i;j>0;j--)
           {
           System.out.print(" ");
           }
           for(int k=1;k<=i;k++)
           {
           System.out.print("*");
           }
           System.out.println(" ");
        }

	}
}
