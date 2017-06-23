package com.warmup;

import java.util.Scanner;

public class AddtwoNumbers {
	
	public static void main(String arg[]){
		int a,b,sum;
		Scanner in=new Scanner(System.in);
		
		a=in.nextInt();
		b=in.nextInt();
		
		sum = solveMeFirst(a, b);
		
		System.out.println(sum);
	
		
	}
	
	static int solveMeFirst(int a,int b){
		return a+b;
	}

}
