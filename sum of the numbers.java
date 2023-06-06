import java.util.Scanner;
public class sum_of_the_number {

	public static void main(String[] args) {
		int count;
		System.out.println("enter the count of numbers:");
		Scanner dee = new Scanner(System.in);
		count = dee.nextInt();
		int number,sum=0;
		for(int i=0;i<count;i++)
		{
			number=dee.nextInt();
			sum=sum+number;
		}
		System.out.println("sum of all these numbers :" +sum);
		
	}

}
