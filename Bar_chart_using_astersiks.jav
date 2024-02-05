import java.util.*;
public class Program
{
    public static void main(String[] args) 
    {
		Scanner scn=new Scanner(System.in);
       //input of number of test cases
        int t=scn.nextInt();
        int[] arr=new int[t];
        //taking input 
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        //finding maximum value input to make that number of rows
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        for(int floor=max;floor>=1;floor--)
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]>=floor)
                {
                    System.out.print("*\t");
                }
                else
                System.out.print("\t");
            }
            System.out.println();
        }
	}
}
