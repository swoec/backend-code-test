/**  

* <p>Title: SquareDrawer.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* <p>Company:Alex Wang </p>  

* @author Alex Wang  

* @date 27/05/2018  

* @version 1.0  

*/ 
package com.springload;


public class SquareDrawer extends Drawer {
	
    int [][][]lines;
    int x = 0;      // x positon of left up corner
    int y = 0;      // y positon of left up corner
    int width = 0;  // width of the square 
    
	public SquareDrawer() {
		
	}
	
	public SquareDrawer(int [][][]lines) {
		this.lines = lines;
	}
	
	public SquareDrawer(int x,int y,int width) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.lines = generate(x,y,width);
	}
	
	@Override
	public int draw() {
		System.out.println("square---");		
		return super.drawline(this.lines);	
				
	}
	
	
	/*
	 * @funtion generate
	 * @parameter position of left up corner (x,y)
	 * @parameter width  of square
	 * @to generate the three dimension array
	 */ 

	public int[][][]generate(int x,int y,int width){
		
		System.out.println("---genereate---squere----");
		int [][] points1 = {{x,y},{x,y-width}};
		int [][] points2 = {{x,y},{x+width,y}};
		int [][] points3 = {{x,y-width},{x+width,y-width}};
		int [][] points4 = {{x+width,y-width},{x+width,y}};
		
		int [][][]lines = {points1,points2,points3,points4};
		
		for(int i=0;i<lines.length;i++) {
			for(int j=0;j<lines[0].length;j++) {
				for(int k=0;k<lines[0][0].length;k++) {
					System.out.println(lines[i][j][k]);
				}
					
			}
		}
		
		return lines;
	}

	
	
	
	

}
