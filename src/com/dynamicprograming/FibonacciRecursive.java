package com.dynamicprograming;

/*
 * Recursive approch
 */
public class FibonacciRecursive {
	
	public static int fib(int n){
		
		if(n<=1)
			return n;
		else
			return fib(n-1)+fib(n-2);
		
	}
	
	public static void main(String a[]){
		
		int n=6;
		
		System.out.println(fib(n));
	}

}
