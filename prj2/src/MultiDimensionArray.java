
public class MultiDimensionArray {
	 public static void main(String[] args) {
		 MultiDimensionArray o = new MultiDimensionArray();
	       int[][] arr1= {{-2,5},{-1,9},{6,8},{15,16}};
	       for(int[] i : arr1) {
	           for(int j : i) {
	               System.out.print(j + "  ");
	           }
	           System.out.println("\n");  
	       }
	       
	       for(int i=0; i<arr1.length;i++) {
	           System.out.println(arr1[i][0] + " " + arr1[i][1]);
	       }
	       
	}
}
