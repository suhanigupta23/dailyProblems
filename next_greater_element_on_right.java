//lecture 109 110
import java.io.*;
import java.util.*;

public class Main{
    public static void display(int[] a) {
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

        int[] nge=solve(a);
        display(nge);
    }
    public static int[] solve(int[] arr){
        int[] nge=new int[arr.length];

        Stack <Integer> st=new Stack<> ();

        //zero daal diya sabse pehle
        st.push(0);

        // LOGIC: ye logic lagaya hei ki jab ek number ke baad agla number ayega tab vo pehle ke element agar chota hua to unhe pop kara dega aur kudh vo wale next greater element ka bankar uske pichle wale number ka , fir usme psuh ho jayega, agar agla number usse chota hei to use bhi push kar denge aur jab tak usse bada number nhi aa jata tab tak push karwanyenge .. jaise hi usse bada number aya vo pop kara denge uske pehle ke number aur uske pichle wale number ke liye vo bada wala hi jayega (nge).  
        for(int i=1;i<arr.length;i++){
            while(st.size()>0 && arr[i]>arr[st.peek()]){
                int pos=st.peek();
                nge[pos]=arr[i];
                st.pop();
            }

            st.push(i);
        }
        while(st.size()>0){
            int pos=st.peek();
            nge[pos]=-1;
            st.pop();
        }
        return nge;
    }
}
