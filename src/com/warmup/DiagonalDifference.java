package com.warmup;

import java.util.Scanner;

/*
 * Print the absolute difference between the two sums of the matrix's diagonals as a single integer.
 * diff b/w primary and secondary diagonal ==> Mod value
 */
public class DiagonalDifference {

	public static void main(String arg[]){
		int m,i,j;
		int priDiag =0,secDiag=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Matrix size :");
		m=in.nextInt();
		
		int a[][]=new int[m][m];

		for(i=0;i<m;i++){
			System.out.println("Enter the " + (i+1) + " row elements");
			for(j=0;j<m;j++){
				a[i][j]=in.nextInt();
				
				if(i==j)		//Primay diagonal
					priDiag +=a[i][j];
				if((i+j)==(m-1))	//Secondary diagonal
					secDiag +=a[i][j];
			}
		}
		System.out.println("Primary Diagonal value :" + priDiag);
		System.out.println("Secondary Diagonal value :" + secDiag);
		
		System.out.println("Abs vlaue of both the diagonals " + Math.abs(priDiag - secDiag) );
	}
	
}
