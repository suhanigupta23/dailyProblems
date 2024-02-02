import java.util.*;
public class Program
{
    public static void display(int n,int r,int npr)
    {
        System.out.println(n+" P "+r+" is "+npr);

    }


    public static int fact(int x)//public static used to define the function
    //fact(int x) defined in such a way that x is the input value
    {
        //function written detailed
        int fact=1;
        for(int i=1;i<=x;i++)
        {
            fact=fact*i;
        }
        return fact;
        //returning the function value
    }
    public static void main(String[] args) 
    {
		Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int r=scn.nextInt();
        //taking input
        int nfact=fact(n);
        int nmrfact=fact(n-r);
        int npr=nfact/nmrfact;
        display(n,r,npr);

	}
}
