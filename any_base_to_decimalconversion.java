import java.util.*;
public class Program
{
    public static void main(String[] args) 
    {
        //Conversion of other base to decimal 
        //taking input of number n in base b 
        //and converting it to number of base decimal
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int b=scn.nextInt();
        int decimal_number=0;
        int count=0;
        while(n!=0)
        {
            int rem=n%10;
            int mult=(int)Math.pow(b,count);
            int fin=rem*mult;
            decimal_number=decimal_number+fin;
            count++;
            n=n/10;
        }
        System.out.println(decimal_number);
	}
}
