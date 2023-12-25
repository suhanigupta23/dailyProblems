public class Program
{
    public static void main(String[] args)
    {
	//divsion,addition,modulus,multiplication.
        int x=10;
        int y=15;
        int sum=x+y;
        int prd=x*y;
        int div1=x/y;
        int div2=y/x;
        int mod=y%x;
        System.out.println("Sum of "+x+" and "+y+" is "+sum);
        System.out.println("Product of "+x+" and "+y+" is "+prd);
        System.out.println("Division of "+x+" and "+y+" is "+div1);
        System.out.println("Division of "+y+" and "+x+" is "+div2);
        System.out.println("Modulus of "+y+" and "+x+" is "+mod);	
    //expression
        int exp=x*y/x+y;
        //BODMAS applied system reads it as 
        // exp=( x*(y/x) ) + y
        System.out.println("Expression value is " +exp);
        int exp1= (x*y)/(x+y);
        System.out.print("Expression2 value is " +exp1);

	}
}
