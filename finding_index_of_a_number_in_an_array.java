import java.util.*;
public class Program
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        int data=scn.nextInt();
        int index=-1;
        //index print hoga agar no data is there then value of result is printed as -1..
        for(int i=0;i<arr.length;i++)
        {
            if(data==arr[i])
            {
              index=i;
              break;
            }
        }
        System.out.println(index);
	}
}
