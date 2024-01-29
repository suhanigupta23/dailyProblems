import java.util.*;
public class Program
{
    public static void main(String[] args)
    {
		Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();
        int n2=scn.nextInt();
        int n3=n1;//storing value if n1 as it is needed in the as we change the value of it in while.
        int n4=n2;//storing values of n2 as it will be needed after as we change values for it in while function.
        if(n2>n1)
        {
          while(n2%n1!=0)
          {
             int rem=n2%n1;
              n2=n1;
              n1=rem;
          }
          System.out.println(n1+" is the GCD for the two given numbers "+n3+"and"+n4);
          int lcm=n3*n4/n1;
          System.out.println(lcm+" is the LCM of the two numbers "+n3+"and"+n4);
        }
        else
        {
          while(n1%n2!=0)
          {
              int rem=n1%n2;
              n1=n2;
              n2=rem;
          }
          System.out.println(n2+" is the GCD for the two given numbers.");
          int lcm=n3*n4/n2;
          System.out.println(lcm+" is the LCM of the two numbers "+n3+" and "+n4);
        }
       
    
    }

}
