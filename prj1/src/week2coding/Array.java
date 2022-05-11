package week2coding;

public class Array {
	public static void sortarray(int[] array)
	{
		int temp =0;
		 for (int i = 0; i <array.length; i++) {     
	          for (int j = i+1; j <array.length; j++) {     
	              if(array[i] >array[j]) {     
	                 temp = array[i];    
	                 array[i] = array[j];    
	                 array[j] = temp;    
	               }     
	            }     
	        }    
	       
	        System.out.println("\nArray sorted in ascending order: ");    
	        for (int i = 0; i <array.length; i++) {     
	            System.out.print(array[i] + " ");    
	        }    
	}

	public static void main(String[] args) {
		int[]array = {4,7,1,9,3};
		sortarray(array);

	}

}
