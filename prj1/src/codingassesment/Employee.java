package codingassesment;

public class Employee {
	
	private static int length;
	public int empid;
	public String empname;
	
	public Employee(int empid,String empname) {
		this.empid=empid;
		this.empname=empname;
	}
	
	public static void main(String[] args) {
		Employee emp1=new Employee(1,"A");
		Employee emp2=new Employee(2,"B");
		Employee emp3=new Employee(3,"C");
		Employee emp4=new Employee(4,"D");
		Employee emp5=new Employee(5,"E");
		Employee emp6=new Employee(6,"F");
		Employee emp7=new Employee(7,"G");
		Employee emp8=new Employee(8,"H");
		Employee emp9=new Employee(9,"I");
		Employee emp10=new Employee(10,"J");
		
		Employee[] emp= {emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10};

		for(int i=0;i<emp.length;i++) {
			System.out.println("Empid : "+emp[i].empid+"  Emp Name : "+emp[i].empname);
		}
	}
}
