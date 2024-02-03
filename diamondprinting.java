import java.util.*;

public class Program
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= (n + 1) / 2; i++) 
        {
            for (int j =(n+1)/2-i ; j>0; j--) {
                System.out.print(" ");
            }

            for (int k = (2 * i - 1); k > 0; k--) {
                System.out.print("*"); 
            }

            System.out.println(); 
        }
        for (int i = (n+1)/2; i>=1 / 2; i--) 
        {
            for (int j =1 ; j<=(n+1)/2-i; j++) {
                System.out.print(" ");
            }

            for (int k =1; k <=2*i-1; k++) {
                System.out.print("*"); 
            }

            System.out.println(); 
        }
}
}
