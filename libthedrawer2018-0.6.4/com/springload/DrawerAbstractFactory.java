/**  

* <p>Title: DrawerAbstractFactory.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2018</p>  

* <p>Company:Alex Wang </p>  

* @author Alex Wang  

* @date 27/05/2018  

* @version 1.0  

*/ 
package com.springload;


public interface DrawerAbstractFactory {
	public Drawer createDrawer();
	public Drawer createDrawerWithoutinit();

}
