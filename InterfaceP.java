interface Resume
{
	void biodata();
}
class Teacher implements Resume
{
	String name,qualification,achivements;
	float experience;
	public void biodata()
	{
		name="deepak";
		qualification="M.tech.(PH.D)";
		achivements="q1 publication";
        experience=8.6f;
        System.out.println("teacher resume");
        System.out.println("\n name:"+name);
        System.out.println("qualification:"+qualification);
        System.out.println("achivements"+achivements);
        System.out.println("experience"+experience);
		
		
		
		
		
	}
}
class Student implements Resume
{
	String name,discipline;
	float result;
	public void biodata()
	{
		name="ujwal";
		result=9.8f;
		discipline="information science and engneering ";
		 System.out.println("");
		 System.out.println("\n Student resume");
		 System.out.println("name:"+name);
		 System.out.println("result:"+result+"cgpa");
		 System.out.println("discipline:"+discipline);
			
			
			
			
			
	}
}
public class InterfaceP {

	public static void main(String[] args) 
	{
		Teacher obj1 = new Teacher();
		obj1.biodata();
        Student obj2 = new Student();
        obj2.biodata();
	}

}
