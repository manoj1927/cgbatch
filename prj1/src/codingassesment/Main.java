package codingassesment;

class Student
{
	private int age;
	
	public int getage()
	{
		return this.age;
	}
	
	public void setage(int age)
	{
		if(age>=2&&age<=99)
		{
		this.age = age;
		System.out.println(getage());
		}
		else
		{
			System.out.println("invalid age");
		}
	}
	
	
}
public class Main {

	public static void main(String[] args) {
		Student s =new Student();
		s.setage(1);
		s.setage(2);
		s.setage(99);
		s.setage(100);
		
		
		
	}

}
