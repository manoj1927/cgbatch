package week3;

import java.util.HashSet;

public class CheckElementHashSetExample {
 
  public static void main(String[] args) {
 
   
    HashSet<Integer> hSet = new HashSet();
   
       hSet.add(1);
    hSet.add(2);
    hSet.add(3);
 
   
   
    boolean blnExists = hSet.contains(3);
    System.out.println("3 exists in HashSet ? : " + blnExists);
 
  }
}