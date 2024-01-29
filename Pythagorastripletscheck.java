import java.util.*;
public class Program
{
    public static void main(String[] args) 
    {
		Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=scn.nextInt();
        int n1=a*a;
        int n2=b*b;
        int n3=c*c;

        if(n1+n2==n3||n2+n3==n1||n1+n3==n2)
        {
            System.out.println("The three values are Pythagoras triplets.");
        }
        else
        {
            System.out.println("The three values are not Pythagoras triplets.");
        }

	}
}
