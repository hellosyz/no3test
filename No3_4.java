package no3test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class No3_4 {

	public static <AnyType extends Comparable< ? super AnyType > >
			void intersection(List<AnyType> L1, List<AnyType> L2, List<AnyType> intersect) {
		ListIterator<AnyType> iterL1 = L1.listIterator();
		ListIterator<AnyType> iterL2 = L2.listIterator();
		
		AnyType itemL1 = null;
		AnyType itemL2 = null;
		
		if( iterL1.hasNext() && iterL2.hasNext() ) {
			itemL1 = iterL1.next();
			itemL2 = iterL2.next();
		}
		
		while( itemL1 != null && itemL2 != null ) {
			int compareVal = 0;
			compareVal = itemL1.compareTo(itemL2);
			
			if(compareVal == 0) {
				intersect.add(itemL1);
				itemL1 = (iterL1.hasNext()) ? iterL1.next() : null;
				itemL2 = (iterL2.hasNext()) ? iterL2.next() : null;
			}
			else if(compareVal > 0) {          //itemL1较大
				itemL2 = (iterL2.hasNext()) ? iterL2.next() : null;
			}
			else {
				itemL1 = (iterL1.hasNext()) ? iterL1.next() : null;
			}
		}
		
	}
	
	private static void printintersect( List<Integer> intersect ) {
		ListIterator<Integer> iter = intersect.listIterator();
		
		Integer item = null;
		
		while( iter.hasNext() ) {
			item = iter.next();
			System.out.println(item);
		}
	}
	
	public static void main(String[] args) {
		//使用new或null有何区别
		List<Integer> intersect = new ArrayList<>();
		
		List<Integer> L1 = new ArrayList<>();
		L1.add(1);
		L1.add(2);
		L1.add(3);
		L1.add(4);
		L1.add(5);
		L1.add(6);
		L1.add(7);
		
		List<Integer> L2 = new ArrayList<>();
		L2.add(3);
		L2.add(4);
		L2.add(5);
		
		intersection(L1, L2, intersect);
		
		printintersect(intersect);
	}
}
