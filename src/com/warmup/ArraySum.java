package com.warmup;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,i,res;
		System.out.println("Size of an array");
		n=in.nextInt();
		int[] arr=new int[n];
		
		for(i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		
		res=arraySum(arr);
		
		System.out.println(res);
	}
	
	static int arraySum(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum +=arr[i];
		
		return sum;
	}

}
