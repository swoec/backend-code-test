/**  

* <p>Title: RectangleDrawer.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* <p>Company:Alex Wang </p>  

* @author Alex Wang  

* @date 27/05/2018  

* @version 1.0  

*/ 
package com.springload;


public class RectangleDrawer extends Drawer {
	
	int [][][] lines;
	int x = 0;       //x position of left up corner
	int y = 0;       // y position of left up corner
	int width = 0;   // width of the rectangele
	int length = 0;  // length of the rectangle
	
	public RectangleDrawer(){
		
	}
	
	public RectangleDrawer(int[][][]lines) {
		this.lines=lines;
	}
	
	public RectangleDrawer(int x,int y,int width,int length) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.length = length;
		this.lines = generate(x,y,width,length);
		
	}

	@Override
	public int draw() {
		// TODO Auto-generated method stub
		System.out.println("---rectangele--");
		
		return super.drawline(this.lines);
				
	}
	

	/**  
	 * <p>Title: generate</p>  
	 * <p>Description: </p>  
	 * @param x x axis of position of left up corner
	 * @param y y axis of position of left up corner
	 * @param width of rectangle
	 * @param length of rectangle
	 * @return  
	 */  
	public int[][][]generate(int x,int y,int width,int length){
		System.out.println("---generate---rectangele---");
		int [][] points1 = {{x,y},{x,y-width}};
		int [][] points2 = {{x,y},{x+length,y}};
		int [][] points3 = {{x,y-width},{x+length,y-width}};
		int [][] points4 = {{x+length,y-width},{x+length,y}};
		
		int [][][]lines = {points1,points2,points3,points4};
		
		for(int i=0;i<lines.length;i++) {
			for(int j=0;j<lines[0].length;j++) {
				for(int k=0;k<lines[0][0].length;k++) {
					System.out.print(lines[i][j][k]);
				}					
			}
		}
		
		return lines;
	}
	

	

}
