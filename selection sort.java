
public class Sorting
{

	public static void main(String[] args) 
	{
		int arr[]= {64,25,12,22,11};
		int length = arr.length;
		System.out.println("unsorted array");
		for(int i=0;i<length;i++)
			System.out.println(arr[i] + " ");

		for(int i=0;i<length-1;i++)
		{
			int min_index =i;
			for(int j=i+1;j<length;j++)
			{
				if(arr[min_index] > arr[j])
					min_index =j;
				
			}
			int temp=arr[min_index];
			arr[min_index] =arr[i];
			arr[i] =temp;
		}
		System.out.println("");
		System.out.println("sorted array");
		for(int i=0;i<length;i++)
			System.out.println(arr[i] + " ");

	}

}
