import java.util.Scanner;
public class Arthmetic 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
char op;
Double n1 ,n2, res;
Scanner nan = new Scanner(System.in);
System.out.println("enter the first number:");
n1=nan.nextDouble();
System.out.println("enter the second number:");
n2=nan.nextDouble();
System.out.println("choose the operator(+ ,-,*,/)" );
 op=nan.next().charAt(0);
switch(op)
{
case '+':res=n1+n2;
System.out.println(n1+"+"+n2+"="+res);
break;
case '-':res=n1-n2;
System.out.println(n1+"-"+n2+"="+res);
break;
case'*':res=n1*n2;
System.out.println(n1+"*"+n2+"="+res);
break;
case'/':res=n1/n2;
System.out.println(n1+"/"+n2+"="+res);
break;

}


	}

}
