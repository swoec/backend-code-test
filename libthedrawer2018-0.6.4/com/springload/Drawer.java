package com.springload;

import java.util.ArrayList;

/**
 * @author Alex Wang
 * @version 1.0
 * @
 */
public abstract class Drawer {
		
	
	//to manipulate the date before drawline and then draw 
	public abstract int draw();
		
	// implement the interface
	public int drawline(int [][][] gre) {
		//simulate the library interface
		return SimulateOutsideLibrary.draw_lines(gre);
		
	}
	
    // get all points
	public ArrayList<int[][]> getPoints(int [][][]lines) {
		
		ArrayList<int[][]> pointslist = new ArrayList<int[][]>();
		for(int i=0;i<lines.length;i++) {
			pointslist.add(lines[i]);
		}
		return pointslist;
	}	
	
    // get all points coordinates
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
