package no3test;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class No3_1 {
	
	public static <AnyType> void printLots( List<AnyType> L, List<Integer> P ) {
		ListIterator<AnyType> itorL = L.listIterator();
		ListIterator<Integer> itorP = P.listIterator();
		
		AnyType t = null;
		int count = 0;
		
		while( itorL.hasNext() && itorP.hasNext() ) {
			while( itorP.hasNext() ) {
				int i = itorP.next();
				/*for(int j = 0; j < i && itorL.hasNext(); j++) {
					t = itorL.next();
				}*/
				while( count < i && itorL.hasNext() ) {
					count++;
					t = itorL.next();
				}
				if( i > 8 ) 
					System.out.println("越界！");
				else
					System.out.println("L中第" + i + "个数是" + t);
				
			}
		}
	}
	
	public static void main(String[] args) {
		List<String> L = new LinkedList<>();
		L.add("No1");
		L.add("No2");
		L.add("No3");
		L.add("No4");
		L.add("No5");
		L.add("No6");
		L.add("No7");
		L.add("No8");
		
		List<Integer> P = new LinkedList<>();
		P.add(2);
		P.add(3);
		P.add(6);
		P.add(2);
		P.add(9);
		
		printLots(L, P);
	}

}
