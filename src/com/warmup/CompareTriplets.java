package com.warmup;

import java.util.Scanner;

/*
 * Compare the Triplets
 * A = (a0,a1,a2...)
 * B=(b0,b1..)
 * Now, let's compare each individual score:
a0>b0 so A receives  point.
a1<b1 , so Bob receives  point.
a1=b1 no one get point

 * 
 */
public class CompareTriplets {
	
	static int[] rank(int []a,int []b){
		
		int rank[]={0,0};
		
		for(int i=0;i<3;i++){
			
			if(a[i]>b[i])
				rank[0] +=1;
			if(a[i]<b[i])
				rank[1] +=1;
			
		}
		return rank;
		
	}
	
	public static void main(String arg[]){
		int[] a=new int[3];
		int[] b=new int[3];
		int[] res= new int[2];
		int i;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter person A details : ");
		for(i=0;i<3;i++){
			a[i]=in.nextInt();
		}

		System.out.println("Enter person B details : ");
		for(i=0;i<3;i++){
			b[i]=in.nextInt();
		}

		res =  rank(a,b);
		System.out.println("Rank by A & B : " + res[0] + " : " + res[1]);
	}

}
