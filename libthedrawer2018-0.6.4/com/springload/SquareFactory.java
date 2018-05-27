/**  

* <p>Title: SquareFactory.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* <p>Company:Alex Wang </p>  

* @author Alex Wang  

* @date 27/05/2018  

* @version 1.0  

*/ 
package com.springload;


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
	
	@Override
	public Drawer createDrawer() {
		// TODO Auto-generated method stub
		return new SquareDrawer(this.x,this.y,this.width);
	}

	@Override
	public Drawer createDrawerWithoutinit() {
		// TODO Auto-generated method stub
		return new SquareDrawer();
	}

}
