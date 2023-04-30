import java.util.Scanner;

public class quad 
{

	public static void main(String[] args) 
	{
		int a,b,c;
		Double d,r1,r2;
		Scanner nan = new Scanner(System.in);
		System.out.println("enter the three co-effecients:");
		a=nan.nextInt();
		b=nan.nextInt();
		c=nan.nextInt();
		d=(double) (b*b-4*a*c);
		if(d>0)
		{
			System.out.println("the roots are real and distinct:");
			r1=(-b+Math.sqrt(d)/(2*a));
			r2=(-b+Math.sqrt(d)/(2*a));
			System.out.format("r1=%.2f and r2=%.2f",r1,r2);
		}
       if(d==0)
       {
    	   System.out.println("roots are real and equal");
    	   r1=r2=(double) ((-b)/(2*a));
    	   System.out.format("r1=%.2f and r2=%.2f",r1);
       }
       else
       {
    	   System.out.println("roots are imaginary");
    	   double real=-b/(2*a);
    	   double imag=Math.sqrt(-d)/(2*a);
    	   System.out.format("r1=%,2f and r2=%.2f",real,imag);
       }
	}

}
