package com.implementation;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/apple-and-orange/problem

public class AppleAndOrange {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        
        int i,appleCount=0,orangeCount=0;
        
        for(i=0;i<m;i++){
            if(s<=a+apple[i] && a+apple[i]<=t)
            {
                appleCount+=1;
            }
        }
        for(i=0;i<n;i++){
            if(s<=b+orange[i] && b+orange[i]<=t)
            {
                orangeCount+=1;
            }
        }
        
        System.out.println(appleCount);
        System.out.println(orangeCount);
        
    }
}
