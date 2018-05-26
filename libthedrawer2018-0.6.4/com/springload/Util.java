package com.springload;

import java.util.Arrays;

/**
 * @author Alex Wang
 * @version 1.0
 * @
 */
public class Util {
	
	public static <T> T[] expandCapacity(T[] datas,int newLen){   
	    //not negetive value  
	    newLen = newLen < 0 ? 0 :newLen;   
	    //generate new array and copy the data    
	    return Arrays.copyOf(datas,newLen);   
	} 
		
}
