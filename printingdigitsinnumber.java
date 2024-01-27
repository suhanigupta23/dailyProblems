import java.util.*;
public class Program
{
    public static void main(String[] args) 
    {
		Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int i;
         int [] rem=new int[100];
         int a=n;
        int count=0;
        for(;n>0;)
        {
            n=n/10;
           count++;
        }
        n=a;
        for (i=0;i<=(count-1);i++)
        {
            rem[i]=n%10;
            n=n/10;

        }
        for(i=count-1;i>=0;i--)
        {
            System.out.println(rem[i]);
        }
	}
}
