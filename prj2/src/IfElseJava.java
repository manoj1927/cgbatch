
public class IfElseJava {
	void fn(int x)
	{
		if(x>90&&x<=100)
		{
			System.out.println("A");
		}
		else if(x>80&&x<=90)
		{
			System.out.println("B");
		}
		else if(x>60&&x<=80)
		{
			System.out.println("C");
		}
		else if(x>=50&&x<=60)
		{
			System.out.println("D");
		}
		else if(x>0&&x<=49)
		{
			System.out.println("F");
		}
		else
		{
			System.out.println("Invalid Marks");
		}
	}

	public static void main(String[] args) {
		IfElseJava f=new IfElseJava ();
        f.fn(95);
        f.fn(85);
        f.fn(65);
        f.fn(55);
        f.fn(45);
        f.fn(110);

	}
}
