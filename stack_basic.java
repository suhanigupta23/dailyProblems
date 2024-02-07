import java.util.*;
public class Program
{
    public static void main(String[] args) 
    {
		Stack<Integer> st=new Stack<>();
        st.push(10);
        System.out.println(st+" "+st.peek()+" "+st.size());
        st.push(20);
        System.out.println(st+" "+st.peek()+" "+st.size());
        st.push(30);
        System.out.println(st+" "+st.peek()+" "+st.size());
        st.push(40);
        System.out.println(st+" "+st.peek()+" "+st.size());
        st.push(50);
        System.out.println(st+" "+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st+" "+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st+" "+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st+" "+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st+" "+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st+" "+st.peek()+" "+st.size());
        st.pop();
        //till here all elements are gone 
        //so when we again print st.peek it will not print it will give run time error
        //so we do not write st.peek function
        System.out.println(st+" "+st.size());
        //size comes as zero
	}
}
