/**  

* <p>Title: Drawer.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* <p>Company:Alex Wang </p>  

* @author Alex Wang  

* @date 27/05/2018  

* @version 1.0  

*/ 
package com.springload;

import java.util.ArrayList;


public abstract class Drawer {
		
	
	
	/**  
	 * <p>Title: draw</p>  
	 * <p>Description: </p>  
	 * @return  id of picture
	 */  
	public abstract int draw();
		
	
	/**  
	 * <p>Title: drawline</p>  
	 * <p>Description: </p>  
	 * @param int [][][] 
	 * @return  id of picture
	 */  
	public int drawline(int [][][] gre) {
		//simulate the library interface
		return SimulateOutsideLibrary.draw_lines(gre);
		
	}
	
    
	/**  
	 * <p>Title: getPoints</p>  
	 * <p>Description: </p>  
	 * @param int [][][]
	 * @return  all positons of points
	 */  
	public ArrayList<int[][]> getPoints(int [][][]lines) {
		
		ArrayList<int[][]> pointslist = new ArrayList<int[][]>();
		for(int i=0;i<lines.length;i++) {
			pointslist.add(lines[i]);
		}
		return pointslist;
	}	
	
   
	/**  
	 * <p>Title: getCoordinates</p>  
	 * <p>Description: </p>  
	 * @param int [][][]
	 * @return  coordinates of points
	 */  
	public ArrayList<int[]> getCoordinates(int [][][]lines) {
		
		ArrayList<int[]> coordianteslist = new ArrayList<int[]>();
		for(int i=0;i<lines.length;i++) {
			for(int j=0;j<lines[i].length;j++) {
				coordianteslist.add(lines[i][j]);
			}
		}
		return coordianteslist;
		
	}
	

}
