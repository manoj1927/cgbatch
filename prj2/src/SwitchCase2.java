
public class SwitchCase2 {
	 void fn(int x) {
	        
		 System.out.println("The value of month is : "+x);
	        switch(x) {
	        case 1:
	        case 3:
	        case 5:
	        case 7:
	        case 8:
	        case 10:
	        case 12:
	        	System.out.println("This month has 31 days");
	            break;
	        case 2:
	        	System.out.println("This month has 28 days");
	            break;
	        case 4:
	        case 6:
	        case 9:
	        case 11:
	        	System.out.println("This month has 31 days");
	            break;
	            default:
	            System.out.println("This month is invalid");
	            break;
	        }
	 }
	public static void main(String[] args) {
		
		SwitchCase2 s2=new SwitchCase2();
        s2.fn(1);
        s2.fn(6);
        s2.fn(14);
            
	}

}
