package com.springload;

/**
 * @author Alex Wang
 * @version 1.0
 * @
 */
public class DrawerFactory {
	
	public static Drawer getDrawer(DrawerAbstractFactory factory) {
		return factory.createDrawer();
		
	}

}
