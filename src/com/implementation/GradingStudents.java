package com.implementation;

import java.util.Scanner;

/*
 * <40 is failed
 * ROund the grade if difference between marks and nearest multiple of "5" is less than 3.
 * if any value is less than 38 keep the value as it is
 *
 */
public class GradingStudents {

	static int[] solve(int[] grades){
        // Complete this function
        int i,temp,nearestVal;
        for(i=0;i<grades.length;i++){
            if(grades[i]<38){

            }
            else{
                nearestVal=grades[i]/5;
                temp=((nearestVal+1)*5)-grades[i];
                if(temp<3){
                    grades[i]=(nearestVal+1)*5;
                }
            }
        }
        return grades;
    }
	
	public static void main(String a[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] grades = new int[n];

		for (int i = 0; i < n; i++) {
			grades[i] = in.nextInt();
		}
		int[] result = solve(grades);

		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");
	}
}
