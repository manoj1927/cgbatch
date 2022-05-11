


public class LoopsEg3 {
	void fnfor(int x) {
        for(int i=0;i<x;i++) {
            if(i==4)
                continue;
            if(i==8)
                break;
            System.out.println("Iterating Loop: with i: "+i);
        }
    }
	 void fnWhile(int x) {
	        int i=0;
	        while(i<x) {
	            i++;
	            if(i==4)
	                continue;
	            System.out.println("Iterating Loop: with i: "+i);
	            
	        }
	    }
	 public static void main(String[] args) {
	        LoopsEg3 e=new LoopsEg3();
	       // e.fnfor(10);
	        e.fnWhile(10);
	        
	    }

	 
}

