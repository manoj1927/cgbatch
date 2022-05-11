
public class LoopsEg {
    void fnfor(int x) {
        for(int i=0;i<x;i++) {
            System.out.println("Iterating Loop: with i: "+i);
        }
    }
    void fnWhile(int x) {
        int i=0;
        while(i<x) {
            System.out.println("Iterating Loop: with i: "+i);
            i++;
        }
    }
    void fnDoWhile(int x) {
        int i=0;
         do{
            System.out.println("Iterating Loop: with i: "+i);
            i++;
        }while(i<x);
    }

 

    public static void main(String[] args) {
        LoopsEg e=new LoopsEg();
        //e.fnfor(10);
        //e.fnWhile(10);
        e.fnDoWhile(0);
    }
}
