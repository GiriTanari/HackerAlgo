package com.dynamicprograming;
/*
 * a) Memoization (Top Down)
 * b) Tabulation (Bottom Up)
 */

public class FibonacciDyanamic {
	// Memoization approach

	final int MAX = 100;
	final int NIL = -1;

	int lookup[] = new int[MAX];

	/* Function to initialize NIL values in lookup table */
	void _initialize() {
		for (int i = 0; i < MAX; i++)
			lookup[i] = NIL;
	}

	/* function for nth Fibonacci number in Memoization  way */
	public int fibMemoization(int n){
		
		if(lookup[n] == NIL){
			if(n<=1)
				lookup[n]=n;
			else
				lookup[n]=fibMemoization(n-1) + fibMemoization(n-2);
		}
		return lookup[n];
	}
	
	//Function for nth fibonacci number in Tabulation
	public int fibTabulation(int n){
		int fib[]=new int[n];
		
		fib[0]=0;
		fib[1]=1;
		
		for(int i=2;i<=n-2;i++){
			fib[i]=fib[i-1]+fib[i-2];
		}
		
		return fib[n];
	}
	public static void main(String[] args) {
		FibonacciDyanamic f = new FibonacciDyanamic();
	    int n = 6;
	    f._initialize();
	    System.out.println("Fibonacci number is in Memoization approach : " + " " + f.fibMemoization(n));
	    System.out.println("Fibonacci number is in Tabulation approach : " + " " + f.fibMemoization(n));

	}

}
