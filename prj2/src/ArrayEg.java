
public class ArrayEg {
	public static void main(String[] args) {
        int[] a=new int[10];
       System.out.println(a.clone());
       System.out.println(a.equals(a));
       System.out.println(a.hashCode());
       System.out.println(a.toString());
       System.out.println(a.getClass());
       System.out.println(a.length);
        //array declared with 10 size
        //array indexing starts with 0 till size - 1.
        for(int i=0;i<a.length;i++) {
            a[i]=i*i;
        }
        for(int i=0;i<10;i++) {
            System.out.print("a["+i+"] = "+a[i]+"  ");
        }
    }
}
