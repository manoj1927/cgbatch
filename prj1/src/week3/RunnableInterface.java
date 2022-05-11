package week3;

public class RunnableInterface {

	public static void main(String[] args) {
		Runnable r = new Runnable1();
        Thread t = new Thread(r);
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t.start();
        t2.start();
    }
}

class Runnable2 implements Runnable{
    public void run(){
        System.out.println(4+5);
    }
}

class Runnable1 implements Runnable{
    public void run(){
    	  System.out.println(5-4);
    }
}
