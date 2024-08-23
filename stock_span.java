//Stock market ka utaar chadav : ek particular time ke liye span matlab left mei greater element that is greater stock kab tha (that is kitne dino pehle tha) kitne time pehle tha ..
 //agar aisa particular din ke liye aisa hua ki usko pehle koi din hi nhi hei jisme kabhi isse pehle zyada price tha hi nhi tab span starting se dekhte hei... that is din shuru se ginte hei..
 //Jaise agar just ek din pehle hi stock bada tha than the current one to isliye span becomes 1 .. agr do din pehle stick bada tha than the current one than span is 2 .. and so on
 //span is the next greater element in left of the current number..
 //when no greater element is in the the left than current then span =index number +1
// span for ither elements is : span=index of current element - index of the next greater element on the left.
//chote element ko pop kara dete hei , then jo pop hone se bach which is nge , dono ke index ko minus kiya iske baad next element par jayenge.. if the next element is smaller than we push the element to the stack.

//apne se pehle wale chote ko pop karwaynge jab tak nge na mil jaye ya fir stack khali na ho jaye ..index khali ho gyi tab jo span hoga = index+1 
//LECTURE: 112
import java.io.*;
import java.util.*;

public class stock_span {
     public static void display(int []a)
     {
        StringBuilder sb=new StringBuilder();

        for(int val:a){
            sb.append(val+"\n");
        }
        System.out.println(sb);
     }
     public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(br.readLine());
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }

        int [] span=solve(a);
        display(span);
     }
     public static int [] solve(int [] arr){
        int []span=new int [arr.length];

        Stack <Integer> st=new Stack();
        st.push(0);
        span[0]=1;

        for(int i=1;i<arr.length;i++)
        {
            //pop till when number is lees than the current number and the size is till 0
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                st.pop();
            }
            if (st.size()==0) {
                span[i]=i+1;
            }
            else{
                span[i]=i-st.peek();
            }
            st.push(i);
        }
        return span;
    }
}
