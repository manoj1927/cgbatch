
	class Emp{ //Encapsulation as a class
	    public String name; //abstraction
	    private int salary; //encapsulation/Data Hiding
	    public void HR() {
	        System.out.println("Name : " + name+ " Monthly Salary : " + salary);
	    }
	    public void Account(int s) {
	        salary=s;
	    }
	}
	public class Hello {
	    public static void main(String[] args) {
	        Emp e1=new Emp();
	        e1.name="Abc";
	        e1.Account(4000000);
	        e1.HR();
	        
	    }

	 

	}

