package week2coding;

import java.util.ArrayList;

public class Arralist {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(10);
		list.add(12);
		
		
		for(int i = 0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
	}

}
