
public class ArrayEg2 {
	void displayArray(int[] a) {
        for(int i:a) {
            System.out.print(i + " ");
        }
    }
    
    public static void main(String[] args) {

 

        int[] arr= {2,4,1,3,7,8,4};
        ArrayEg2 a = new ArrayEg2();
        a.displayArray(arr);
    }
}
