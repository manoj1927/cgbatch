
public class FCSifJava {
	void fn(int x) {
        System.out.println("The value of x : "+x);
        if(x>5) {
            System.out.println("X is greater than 5");
        }
        else if(x>0) {
            System.out.println("X is a positive number");
        }
        else 
            System.out.println("X is a negative number");
    }

 

    public static void main(String[] args) {
    	 FCSifJava f=new  FCSifJava();
        f.fn(3);
        f.fn(6);
        f.fn(-12);
    }
	

}
