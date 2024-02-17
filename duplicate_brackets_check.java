// Print False for not having duplicate brackets
// True for having duplicate brackets
import java.io.*;
import java.util.*;
public class Program
{
    public static void main(String[] args) 
    {
        //input liya
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();

        //stack for character
		Stack <Character> st=new Stack<>();
        for(int i=0;i<str.length();i++)
        {

            char ch=str.charAt(i);
            if(ch==')')
            {
                //agar character closing bracket hei to fir check whether the opnening bracket aa rha hei kya ya fir jab tak opening bracket nhi aaye tab tak pop karna hei
            
                if(st.peek()=='(')
                {
                    //agar peek par opening bracket hei to true
                    System.out.println("True");
                    return;
                }
                else
                {
                    while(st.peek()!='(')
                    {
                        st.pop();
                    }
                    st.pop();
                }
            }
            else
            {
            //closing bracket na hei character to push character in stack
                st.push(ch);
            }
        }
        System.out.println("False");
	}
}
