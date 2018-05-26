package com.springload;

/**
 * @author Alex Wang
 * @version 1.0
 * @
 */
public class TestDrawer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testAbstractFactory();
	}
	
	public static void testAbstractFactory() {
		
		SquareDrawer asq = new SquareDrawer(20,20,10);
		System.out.println(asq.draw());
		RectangleDrawer are = new RectangleDrawer(40,40,20,10);
		System.out.println(are.draw());	
		
		
		//position of left up corner and width
		Drawer squere = DrawerFactory.getDrawer(new SquareFactory(20,20,10));
		System.out.println(squere.draw());
		
		// input the parameter directly
		int[][] points1 = {{20,10},{10,10}};
		int[][] points2 = {{10,10},{10,20}};
		int[][] points3 = {{10,20},{20,20}};
		int[][] points4 = {{20,10},{20,20}};
		int[][][] gre = {points1,
				points2,
				points3,
	            points4
		};
		Drawer squarewithnopara = DrawerFactory.getDrawerwithnopara(new SquareFactory());
		System.out.println(squarewithnopara.drawline(gre));
		
		
		//position of left up corner and width length
		Drawer rectangle = DrawerFactory.getDrawer(new RectangleFactory(40,40,20,10));
		System.out.println(rectangle.draw());
		
		
		//input the parameter directly
		int[][] points5 = {{30,10},{10,10}};
		int[][] points6 = {{10,10},{10,20}};
		int[][] points7 = {{10,20},{30,20}};
		int[][] points8 = {{30,10},{30,20}};
		int[][][] gra = {points5,
				points6,
				points7,
	            points8
		};
		Drawer rectanglewithnopara = DrawerFactory.getDrawerwithnopara(new RectangleFactory());
		System.out.println(rectanglewithnopara.drawline(gra));
		
	}
}