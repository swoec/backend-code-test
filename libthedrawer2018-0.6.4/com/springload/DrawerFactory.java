/**  

* <p>Title: DrawerFactory.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* <p>Company:Alex Wang </p>  

* @author Alex Wang  

* @date 27/05/2018  

* @version 1.0  

*/ 
package com.springload;


public class DrawerFactory {
	
	public static Drawer getDrawer(DrawerAbstractFactory factory) {
		return factory.createDrawer();
		
	}
	public static Drawer getDrawerwithnopara(DrawerAbstractFactory factory) {
		return factory.createDrawerWithoutinit();
		
	}
}
