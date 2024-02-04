//input taken as a  number n in decimal base and 
//input taken as a base b for the decimal base number n to convert into base b number
import java.util.*;
public class Program
{
    public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int b= scn.nextInt();
        int[] rem=new int[100];
        int i=0;
        while(n!=0)
        {
            rem[i]=n%b;
            i=i+1;
            n=n/b;
        }
        for(i=i-1;i>=0;i--)
        {
            System.out.print(rem[i]);
        }
        
	}
}
