package com.warmup;

import java.io.*;
import java.util.*;

/*
 * Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.
 */
public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i+j)>n)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
