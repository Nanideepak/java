import java.util.Scanner;
class Staff
{
	String staffid,name;
	Long phone;
	Float salary;
	public void accept()
	{
		Scanner nan = new Scanner(System.in);
		System.out.println("enter the staffid:");
		staffid=nan.next();
		System.out.println("enter the name:");
		name=nan.next();
		System.out.println("enter the phone:");
		phone=nan.nextLong();
		System.out.println("enter the salary:");
		salary=nan.nextFloat();
		
	}
	public void display()
	{
		System.out.println("staffid"+staffid);
		System.out.println("Name"+name);
		System.out.println("phone"+phone);
		System.out.println("salary"+salary);
	}
}
class Teaching extends Staff
{
	String domain;
	int n;
	public void accept()
	{
		super.accept();
		Scanner nan = new Scanner(System.in);
		System.out.println("enter domain:");
		domain=nan.next();
		System.out.println("enter the publications ");
		n=nan.nextInt();
		System.out.println("\n");
	}
	public void display()
	{
		super.display();
		System.out.println("domain:"+domain);
		System.out.println("publications:"+n);
		System.out.println("\n");
	}
}
class Technical extends Staff
{
	String skill;
	public void accept()
	{
		super.accept();
		Scanner nan = new Scanner(System.in);
		System.out.println("enter the skill");
		skill=nan.next();
		System.out.println("\n");
	}
    public void display()
    {
    	super.display();
    	System.out.println("TECHNICAL SKILL"+skill);
    	System.out.println("\n");
    }
}
     class Contract extends Staff
     {
    	 int period;
    	 public void accept()
    	 {
    		 super.accept();
    		 Scanner nan = new Scanner(System.in);
    		 System.out.println("enter the period");
    		 period =nan.nextInt();
    		 System.out.println("\n");
    	 }
    	 public void display()
    	 {
    		 super.display();
    		 Scanner nan = new Scanner(System.in);
    		 System.out.println("contract period:"+period  );
    		 System.out.println("\n");
    	 }
    	 
    	 
     }
     class Four
     {

	public static void main(String[] args) 
	{
		Teaching teaching = new Teaching();
		System.out.println("enter the details of the teaching staff");
		teaching.accept();
		Technical technical = new Technical();
		System.out.println("enter the details of the technical staff");
		technical.accept();
		Contract contract = new Contract();
		System.out.println("enter the details of the contract staff");
		contract.accept();
		System.out.println("the details of the teaching staff");
		teaching.display();
		System.out.println("the details of the technical staff");
		technical.display();
		System.out.println("the details of the contract staff");
		contract.display();



	}
}
     


