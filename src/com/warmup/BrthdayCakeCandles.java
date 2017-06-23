package com.warmup;

import java.util.Scanner;
import java.util.TreeMap;

public class BrthdayCakeCandles {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        TreeMap<Integer,Integer> res=new TreeMap<Integer,Integer>();
	        
	        int[] ar = new int[n];
	        for(int i = 0; i < n; i++){
	            ar[i] = in.nextInt();
	            
	            if(res.containsKey(ar[i]))
	            	res.put(ar[i], res.get(ar[i])+1);
	            else
	            	res.put(ar[i], 1);
	        }
	        
	        System.out.println(res.firstKey() +  " : " + res.get(res.firstKey()) + "  " + res.lastKey() + " : " + res.get(res.lastKey()));
	    }
	
}
