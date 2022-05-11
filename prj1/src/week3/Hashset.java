package week3;


import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(2);
		set.add(4);
		set.add(6);
		set.add(8);
		set.add(10);
		set.add(12);
		
		Iterator<Integer> i = set.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
	}


	}


