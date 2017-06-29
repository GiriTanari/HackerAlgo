package com.warmup;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {

	 public static void main(String[] args) throws Exception{
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        String splitString[];
	        String convert="";
//	        String result = timeConversion(s);
	        
	        System.out.println(s);

//Method 1:
	       SimpleDateFormat sd1=new SimpleDateFormat("HH:mm:ss");
	       SimpleDateFormat sd2=new SimpleDateFormat("hh:mm:ssa");
	        
	       Date date=sd2.parse(s);
	       System.out.println(sd1.format(date));
	       
//Method 2:	        
	       if(s.contains("PM")){
	    	   splitString = s.split(":");
//	    	   int temp=;
	    	   convert=String.valueOf((12+Integer.parseInt(splitString[0]))) + ":"  
	    			   + splitString[1] + ":" + splitString[2].replaceAll("PM", "");
	       }
	       else
	    	   convert=s.replaceAll("AM", "");
	       System.out.println(convert);
	    }
}
