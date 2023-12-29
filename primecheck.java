import java.util.*;
  
  public class Main
  {
  
  public static void main(String[] args) 
   {
      Scanner scn = new Scannner(System.in);
   int t=scn.nextInt();

    for(;t>0;t--)
     {
      int n =scn.nextInt();
       
       int count=0;
       for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            count++;
        }
        
        if(count==2)
        {
            System.out.print                ("prime");
        }
        else
        {   
            System.out.println              ("not prime");
        }
       
      }
    }
   }
