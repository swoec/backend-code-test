package com.springload;

/**
 * @author Alex Wang
 * @version 1.0
 * @
 */
public class RectangleFactory implements DrawerAbstractFactory {

	int x = 0;
	int y = 0;
	int width = 0;
	int length = 0;
	
	//get the rectangle drawer 
	public RectangleFactory() {
		
	}
	
	public RectangleFactory(int x,int y,int width,int length) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.length = length;
	}
	
	@Override
	public Drawer createDrawer() {
		// TODO Auto-generated method stub
		return new RectangleDrawer(this.x,this.y,this.width,this.length);
	}

	@Override
	public Drawer createDrawerWithoutinit() {
		// TODO Auto-generated method stub
		return new RectangleDrawer();
	}
	
	

}
