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
	
	/**  
	 * <p>Title: getDrawer</p>  
	 * <p>Description: </p>  
	 * @param DrawerAbstractFactory factory
	 * @return  Drawer
	 */  
	public static Drawer getDrawer(DrawerAbstractFactory factory) {
		return factory.createDrawer();
		
	}
	public static Drawer getDrawerwithnopara(DrawerAbstractFactory factory) {
		return factory.createDrawerWithoutinit();
		
	}
}
