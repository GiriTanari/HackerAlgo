package com.warmup;

import java.util.Scanner;

public class PlusMinusFraction {

	public static void main(String a[]){
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pos=0,neg=0,zero=0;
        double posNum=0,negNum=0,zeroNum=0;
        int arr[] = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
            
            if(arr[i]>0)
            	pos+=1;
            if(arr[i]<0)
            	neg+=1;
            if(arr[i]==0)
            	zero+=1;
            
        }
        posNum = (double)pos/n;
        negNum = (double)neg/n;
        zeroNum = (double)zero/n;
        
        System.out.printf("posnum : %.6f\n",posNum);
        System.out.printf("posnum : %.6f",negNum);
        System.out.printf("posnum : %.6f",zeroNum);
	}
	
}
