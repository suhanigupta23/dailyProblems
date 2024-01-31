//   *
//  ** 
// ***
//****
import java.util.*;
public class Program
{
    public static void main(String[] args) 
    {
	    Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k>0;k--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
	}
}
