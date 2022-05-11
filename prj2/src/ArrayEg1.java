
public class ArrayEg1 {
	 public static void main(String[] args) {
	        int[] a= {1,2,3,4,5,6,7}; //automatically size becomes: 7
	       
//	        //array declared with 10 size
//	        //array indexing starts with 0 till size - 1.
//	        for(int i=0;i<10;i++) {
//	            a[i]=i*i;
//	        }
//	        for(int i=0;i<a.length;i++) {
//	            System.out.print("a["+i+"] = "+a[i]+"  ");
//	        }
	        //for in loop
	        
	        for(int i : a) { //i is not an index, rather i is individual elements.
	            System.out.print(i + " ");
	        }
  }
	        
}
