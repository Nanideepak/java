import java.util.*;

public class average_of_number 
{

	public static void main(String[] args) 
	{
		int count;
		System.out.println("enter the numbers:");
		Scanner dee = new Scanner(System.in);
		count =dee.nextInt();
		int number, sum=0;
				float average=0;
		for(int i=0;i<count;i++)
		{
			number =dee.nextInt();
			sum=sum+number;
		}
		average=sum/count;
		System.out.println("sum of entered number:"+sum);

		System.out.println("average of entered numbers:"+average);


	}

}
