import java.util.Scanner;
public class stud_det 
{
String usn ,name ,branch;
Long phone;
void insertstudent(String reg,String nm,String br,Long ph)
{
	usn=reg;
	name=nm;
	branch=br;
	phone=ph;
	
}
void displaystudent()
{
System.out.println("-------------");
System.out.println("Student details");
System.out.println("usn"+usn);
System.out.println("name"+name);
System.out.println("branch"+branch);
System.out.println("phone number"+phone);
}

	public static void main(String[] args)
	{
    stud_det st[] = new stud_det[100];
    Scanner nan = new Scanner(System.in);
    System.out.println("enter the number of  student ");
    int n=nan.nextInt();
    for(int i=0;i<n;i++)
    	st[i]=new stud_det();
    for(int i=0;i<n;i++)
    	st[i]=new stud_det();
    for(int j=0;j<n;j++)
    {
    	System.out.println("enter the usn ,name,branch,phone number");
    	String usn =nan.next();
    	String name=nan.next();
    	String branch=nan.next();
    	long phone=nan.nextLong();
    	st[j].insertstudent(usn,name,branch,phone);
    	
    }
    for(int m=0;m<n;m++)
    {
    	System.out.format("Student %d details are\n",m+1);
    	st[m].displaystudent();
    }

	}

}
