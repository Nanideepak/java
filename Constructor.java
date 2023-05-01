public class Constructor 
{
int id;
String name;
Constructor()
{
	System.out.println("this is a default constructor");
	System.out.println("srtudent id "+id+"\n student name :"+name);
	

}
Constructor(int i,String n)
{
	System.out.println("this is a parameterized constructor:");
	id=i;
	name=n;
	System.out.println("student id :"+id+"\n student name :"+name);


}
	public static void main(String[] args)
	{
		Constructor s = new Constructor();
		Constructor student = new Constructor(10,"deepak");
	}

}
