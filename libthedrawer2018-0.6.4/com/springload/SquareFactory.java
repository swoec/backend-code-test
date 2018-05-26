package com.springload;

/**
 * @author Alex Wang
 * @version 1.0
 * @
 */
public class SquareFactory implements DrawerAbstractFactory {

	int x = 0;
	int y = 0;
	int width = 0;
	public SquareFactory() {
		
	}
	
	public SquareFactory(int x,int y,int width) {
		this.x = x;
		this.y = y;
		this.width = width;
	}
	//get the square drawer
	@Override
	public Drawer createDrawer() {
		// TODO Auto-generated method stub
		return new SquareDrawer(this.x,this.y,this.width);
	}

}
