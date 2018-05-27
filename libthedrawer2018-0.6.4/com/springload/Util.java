/**  

* <p>Title: Util.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* <p>Company:Alex Wang </p>  

* @author Alex Wang  

* @date 27/05/2018  

* @version 1.0  

*/ 
package com.springload;

import java.util.Arrays;


public class Util {
	
	
	/**  
	 * <p>Title: expandCapacity</p>  
	 * <p>Description: </p>  
	 * @param datas
	 * @param newLen
	 * @return  
	 */  
	public static <T> T[] expandCapacity(T[] datas,int newLen){   
	    //not negetive value  
	    newLen = newLen < 0 ? 0 :newLen;   
	    //generate new array and copy the data    
	    return Arrays.copyOf(datas,newLen);   
	} 
		
}
