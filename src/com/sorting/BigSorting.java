package com.sorting;

import java.util.Arrays;
import java.util.Comparator;

/*
 * https://www.hackerrank.com/challenges/big-sorting/problem
 * Big integer comparisoin is easy to do it on string comparision only
 * 		1) If lengths of two strings are different, then we need to compare lengths to decide sorting order.
		2) If Lengths are same then we just need to compare both the strings in lexicographically order.
Assumption : There are no leading zeros.
*/

public class BigSorting {
	
	public static void main(String a[]){
		
		String[] elements = {"6",
				"31415926535897932384626433832795",
				"1","3","10","3","5","30"};

		Comparator<String> cp=new Comparator<String>() {

			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.length()<o2.length())
					return -1;
				else if(o1.length() == o2.length())
					return o1.compareTo(o2);
				else
					return 1;
			}
			
		};
		
		Arrays.sort(elements,cp);
//		List<String> ar=new ArrayList<String>(Arrays.asList(elements));
//		
//		Collections.sort(ar);
		
//		System.out.println(ar);
	
		for(int i=0;i<elements.length;i++){
			System.out.println(elements[i]);
		}
	}

}
