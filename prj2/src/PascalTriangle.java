public class PascalTriangle
{
	 public static void main(String args[])
     {
         int n,i,j,a[][],s;
         n=5;
         s=n-1; 
         a=new int[n][n];
         
         for(i=0;i<n;i++){
             for(j=0;j<=i;j++)
                 if(j==0 || j==i)
                     a[i][j]=1;
                 else
                     a[i][j]=a[i-1][j-1]+a[i-1][j];
         }
         
        
         for(i=0;i<n;i++)
         {
             for(j=0;j<=s;j++)
             System.out.print(" ");
             
             s--;
             
             for(j=0;j<=i;j++)
                 System.out.print(a[i][j]+" ");



             System.out.println();
         }
     }
}