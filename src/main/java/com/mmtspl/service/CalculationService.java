package com.mmtspl.service;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class CalculationService {
	//method that returns maximum number  
    public static int findMax(int arr[]){  
        return Arrays.stream(arr).max().getAsInt();  
    }  
    
    //method that returns cube of the given number  
    public static int cube(int n){  
        return n*n*n;  
    }  
    
    //method that returns reverse words   
    public static String reverseWord(String str){  
         
    	//Stream stream = Stream.of(str)
  
    	StringBuilder result=new StringBuilder();  
        StringTokenizer tokenizer=new StringTokenizer(str," ");  
  
        while(tokenizer.hasMoreTokens()){  
        StringBuilder sb=new StringBuilder();  
        sb.append(tokenizer.nextToken());  
        sb.reverse();  
  
        result.append(sb);  
        result.append(" ");  
        }  
        return result.toString();  
    }  
}
