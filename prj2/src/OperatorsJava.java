
public class OperatorsJava {

	public static void main(String[] args) {
		int x=10;
        System.out.println(++x); //11 : pre increment
        System.out.println(x); //11
        System.out.println(x++); //11 : post increment
        System.out.println(x); //12
        int y=0; 
        x += 1; y=x;//pre increment
        y=x; x=x+1; //posr increment
        System.out.println(x+y);  //x is 14, y is 13 : 27
        System.out.println(x-y);  //x is 14, y is 13 : 1
        System.out.println(x*y);  //x is 14, y is 13 : 14*13
        System.out.println(x/2);  //x is 14, y is 13 : 7
        System.out.println(x%3);  //x is 14, y is 13 : 2
        
	}

}
