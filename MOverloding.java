class MOverload 
{
int add(int a,int b)
{
	int sum=a+b;
	return sum;
	
}
int add(int a,int b,int c)
{
	int sum=a+b+c;
	return sum;
}
float add(float a,float b)
{
	float sum=a+b;
	return sum;
	
}
}
public class MOverloading 
{

	public static void main(String[] args) 
	{
		MOverloading obj = new MOverloading();
		int s1 =   obj.add(10,20);
		int s2 = obj.add(10, 20,30);
		float s3 = obj.add(2.2f,2.2f);
		System.out.println("method of overload sum1 ="+s1);
		System.out.println("\nmethod of overload sum2="+s2);
		System.out.println("\nmethod of overload sum3 ="+s3);


	}
}
