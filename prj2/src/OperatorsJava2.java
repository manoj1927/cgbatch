
public class OperatorsJava2 {

	public static void main(String[] args) {
		   int x=10;
	        int y=11;
	        System.out.println(x>y);  //x is 10, y is 11 : false
	        System.out.println(x<y);  //x is 10, y is 11 : true
	        System.out.println(x==y);  //x is 10, y is 11 : false
	        System.out.println(x!=y);  //x is 10, y is 11 : true
	        System.out.println(x>y  && x>3);  //x is 10, y is 11 : F && T : False
	        System.out.println(x<y  && x>3);  //x is 10, y is 11 : T && T : True
	        System.out.println(x>y  && x>13);  //x is 10, y is 11 : F && F : False
	        System.out.println(x<y  && x>13);  //x is 10, y is 11 : T && F : False
	        System.out.println(x>y  || x>3);  //x is 10, y is 11 : F || T : True
	        System.out.println(x<y  || x>3);  //x is 10, y is 11 : T || T : True
	        System.out.println(x<y  || x<3);  //x is 10, y is 11 : T || F : True
	        System.out.println(x>y  || x>13);  //x is 10, y is 11 : F || F : False
	}

}
