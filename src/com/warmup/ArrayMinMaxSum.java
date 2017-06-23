package com.warmup;

import java.util.*;


public class ArrayMinMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long minSum=0,maxSum=0;
        long[] arr = new long[5];
        for(int i=0; i < 5; i++){
            arr[i] = in.nextLong();
        }
        Arrays.sort(arr);
        
        for(int i=0;i<5;i++){
        	if(i!=0)
        		maxSum +=arr[i];
        	if(i!=4){
        		minSum+=arr[i];
        	}
        }
        System.out.println(minSum + "  " + maxSum);
    }
}
