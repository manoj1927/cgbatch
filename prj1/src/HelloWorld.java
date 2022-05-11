
public class HelloWorld {

	public static void main(String[] args) {
		/*Employee e1 = new Employee();
		e1.input(101, "Manoj");
		e1.print();
		
		student s1 = new student();
		s1.input(101,"manoj","java");
		s1.print();
		
		Institution i1 = new Institution();
		i1.input(10,100,100000.00);
		i1.print();*/
		
		   Student s=new Student();
	        Course c1=new Course();
	        c1.input("Java", 60);
	        Course c2=new Course();
	        c2.input("JEE", 20);
	        s.input(101, "Abc", c1);
	        s.print();

	}
}

/*class Employee {
	int empCode;
	String empName;

	void input(int code, String name) {
		empCode = code;
		empName = name;
	}

	void print() {
		System.out.println("The details of the Employee: \nName:" + empName 
				+ " Code:" + empCode);
		
	}
}


class student
{
	int StudentID;
	String StudentName;
	String Course;
	
	void input(int ID, String Name,String course)
	{
		StudentID = ID;
	    StudentName = Name;
	     Course = course;
		
	}
	void print() {
		System.out.println("The details of the Student: \nStudentName:" + StudentName +
				" StudentID:" + StudentID+" Course:"+Course);
	}
	
}

class Institution
{
	int NoOfCourse;
	int NoOfStudents;
	double AnnualTurnOver;
	
	void input(int Course, int Students,double TurnOver)
	{
		 NoOfCourse = Course;
		 NoOfStudents = Students;
		 AnnualTurnOver= TurnOver;
		
	}
	void print() {
		System.out.println("The details of the Institution: \nNoOfCourse:" + NoOfCourse  +
				" NoOfStudents:" + NoOfStudents+" AnnualTurnOver:"+ AnnualTurnOver);
	}
}*/

