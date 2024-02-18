import java.util.*;
public class Program
{
        public static class Person
        {
            int age;
            String name;
            void sayHi()
            {
                System.out.println(name+" ["+age+"] says hi");
            }
        }	
       public static void main(String[] args) 
    {
        Person p1=new Person();
        p1.age=19;
        p1.name="Jiya";
        p1.sayHi();

        Person p2=new Person();
        p2.age=23;
        p2.name="Yash";
        p2.sayHi();
        
        Person p3=p1;
        //here the address values of p1 is assigned to p3
        p3.age=20;
        p3.sayHi();
        p1.sayHi();
        //here the modified changes in p3 also changes in p1 as the changes are made in the address
	}
}
