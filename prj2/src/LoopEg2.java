
public class LoopEg2 {
	  void Inffor() {
	        for(;;) {
	            System.out.println("Iterating Loop: with infinitly");
	        }
	    }
	    void InfWhile() {
	        while(true) {
	            System.out.println("Iterating Loop: with infinitly");
	        }
	    }
	    void InfDoWhile() {
	         do{
	            System.out.println("Iterating Loop: with infinitly");
	        }while(true);
	    }
	    public static void main(String[] args) {
	        LoopEg2 e=new LoopEg2();
	        e.InfWhile();
	       // e.InfDoWhile();
	        //e.InfDoWhile();
	    }
}
