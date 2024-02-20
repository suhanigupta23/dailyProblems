//THIS IS A SAMPLE OF USING CONSTRUCTOR INT JAVA BOTH DEFAULT AND THE PARAMTERISED CONSTRUCTOR


import java.util.*;
public class Program
{
    public static class Person
        {
            int age;
            String name;
            void saysHi()
            {
                System.out.println(name+" ["+age+"] says hi");
            }
            //default constructor
            Person()
            {

            }
            //BOTH THE PARAMETRISED AND DEFAULT CONSTRUCTOR ARE NEEDED IF WE WRITE THE PARAMETRISED CONSTRUCTOR.
            //parameterised constructor 
            Person(int age,String name)
            {
                this.name=name;
                this.age=age;
                //this. used for the calling the heap constructed in the stack when we below wrtie the new Person
            }
        }
    public static void main(String[] args) 
    {

        Person p1=new Person();
        p1.age=19;
        p1.name="Jiya";
        p1.saysHi();

        Person p2=new Person(20,"Nishi");
        p2.saysHi();

      
	}
}
