//SWAPPING VALUES IN ARRAY STORED OF FIRST AND LAST INDEX OF ARRAY

import java.util.*;
public class Program
{
    public static void swap(int []arr,int i,int r)
    {
        //swapping numbers by introducing third variable
        int s=arr[i];
        arr[i]=arr[r];
        arr[r]=s;
    }
    public static void main(String[] args) 
    {
        //defining array
        int []arr;
        arr=new int [5];
        //array value given
       arr[0]=33;
       arr[1]=65;
       arr[2]=87;
       arr[3]=99;
       arr[4]=45;

       //swapping function applied to swap the first and last index value of array
       swap(arr,0,4);

       //after swapping the value at frist and last postion we print them
       for(int i=0;i<arr.length;i++)
       {
           System.out.println(arr[i]);
       }
	}
}
