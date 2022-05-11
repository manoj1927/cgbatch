
public class SwitchCase {
	 void fn(int x) {
	        
	        System.out.println("The value of x : "+x);
	        switch(x) {
	        case 1:
	            System.out.println("X is equal to 1");
	            break;
	        case 5:
	            System.out.println("X is equal to 5");
	            //break; //next statement also follows for x==5
	        case 6:
	            System.out.println("X is equal to 6");
	            //break;
	        default:
	            System.out.println("X is not 1 or 5");
	            break;
	        }
	    }

	 

	    public static void main(String[] args) {
	    	SwitchCase o=new SwitchCase();
	        o.fn(1);
	        o.fn(5);
	        o.fn(-12);
	            
	    
	    }
}
