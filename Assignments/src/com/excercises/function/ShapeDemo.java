package com.excercises.function;

public class ShapeDemo {

	public static void main(String[] args) {
       IShape shape= (int x,int y) ->{
    	   
    	   double area=(x*y);
		return area;
    	    
       };
      System.out.println("area of rectangle = "+shape.calArea(10, 20)); 
      
      shape = (int x,int y)->{
    	
    	   double area=(0.5*(x*y));
		return area;
    	   
      };
      System.out.println("area of triangle = "+shape.calArea(8, 15)); 
      
      shape=(x,y)-> Math.PI*2*x;
      
      System.out.println("area of circle = "+shape.calArea(5, 1));
	}

}
