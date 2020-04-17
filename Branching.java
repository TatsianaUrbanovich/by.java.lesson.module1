package by.java.lesson.mod1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Branching {
	
	/*
	  Lab 1 Task 1: Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
	 				и если да, то будет ли он прямоугольным.
	*/
	
	public static void triangle(double a, double b, double c) {
		
		System.out.println("Lab 1 Task 1. cheaking triangle angles. Angles are: "+ a +" ,"+ b +" ,"+ c);
		
		if(a + b + c <= 360.0) {
			
			System.out.println("This triangle exists");
			 
			if((a == 90.0) || (b == 90.0) || (c == 90.0)) {
				
			  System.out.println("This triangle is rectangular" + "\n");
			  
			}
			  else {
				  
				  System.out.println("This triangle is not rectangular"+ "\n");
				  
				   }
			} else { 
			
			  System.out.println("This triangle doesn`t exist"+"\n");
			
			}
		
	}
	

	/*
	  Lab 1 Task 2: Найти max{min(a, b), min(c, d)}.
	*/
	
	public static void maxMinSearch(int a, int b, int c,int d) {
		
		System.out.println("Lab 1 Task 2. Max Min search. Numbers are: " + a + ", " + b +", " + c + ", " + d);
		
		int min1;
		int min2;
		
		if(a < b) {
			
			min1 = a;
			
			} else {
				
				min1 = b;
				
				} 
		
		if(b < d) {
			
			min2 = b;
			
			} else {
				
				min2 = d;
				
				}
		
		
		if(min1 > min2) {
			
			System.out.println("Result is: " + min1 + "\n");
			
			} else {
				
				System.out.println("Result is: " + min2 + "\n");
		}
	}
	
	
	/*
	  Lab 1 Task 3: Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
	*/
	
	public static void dotsCheck(int x1, int y1, int x2, int y2, int x3, int y3) {
		
		System.out.println("Lab1 Task2. Check dots for belong one line."
				+ "Coordinates are: A(" + x1 +","+ y1 +"), B("+ x2 +","+ y2 +"), C("+ x3 +","+ y3 +") ");
		
		if(((y1-y2)*x3 + (x2-x1)*y3 + (x1*y2-x2*y1)) == 0) {
			
			System.out.println("Result: Yes. C belongs to line." + "\n");
			
			} else {
				
				System.out.println("Result: No. C doesn`t belong to line." + "\n");
			}

	}
	
	
	/*
	  Lab 1 Task 4: Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
	                Определить, пройдет ли кирпич через отверстие.
	*/
		
	public static void brickCheak(int a, int b, int x, int y, int z) {
		
		System.out.println("Lab 1 Task 3. Brick check. A: " + a +", B: " + b +", X: " + x +", Y:" + y+", Z:" + z);
		
		int counter = 0;
		
		if((a >= x) && (b >= y)) {
			
			System.out.println("Result: Yes. Brick will come through"+"\n");
			
			} else {
				
				if((a >= z) && (b >= y)) {
					
					System.out.println("Result: Yes. Brick will come through" + "\n");
					
					} else {
						
						if((a >= x) && (b >= z)) {
							
							System.out.println("Result: Yes. Brick will come through"+"\n");
							
						} else {
							
							counter++;
							
							}
					}
			}
		
		if(counter > 0) {
			
			System.out.println("Result: NO. Brick woln`t come through"+"\n");
			
		}
		
	}
	

    
	/*
	  Lab 1 Task 5: Вычислить значение функции: x^2 - 3x + 9, x<=3, 1/(x^3 +6) x > 3
	*/
	
	public static void systemValue(double x) {
		
		double y = 0;
		
			if(x <= 3) {
				
				System.out.println("Lab1 Task5: Values of function, where X: "+ x +"\n");
				
				y = Math.pow(x,2)-3*x+9;
								
				System.out.println("y =" + y);
			}
			
			if(x > 3) {
				
				System.out.println("Lab1 Task5: Values of function, where X: "+ x+"\n");
				
				double m;
				m = 1.0;

				double a = Math.pow(x,3);
	
				y = m / (Math.pow(x,3)+6);
				
				System.out.println("y = " + y);


			}

	}
	
	
	
	public static void main(String[] args) {
		
		double angle1;
		double angle2;
		double angle3;
		
		int num1;
		int num2;
		int num3;
		int num4;
		
		int x1;
		int y1;
		
		int x2;
		int y2;
		
		int x3;
		int y3;
		
		int rectangle_x;
		int rectangle_y;
		int brick_x;
		int brick_y;
		int brick_z;
		
		double x;
		
		/*
		  Lab 1 Task 1: Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
		 				и если да, то будет ли он прямоугольным.
		*/
		
		angle1 = 90;
		angle2 = 35.8;
		angle3 = 55.2;
		
		triangle(angle1, angle2, angle3);
	

		/*
		  Lab 1 Task 2: Найти max{min(a, b), min(c, d)}.
		*/
		
		num1 = 12;
		num2 = 13;
		num3 = 14;
		num4 = 15;
		
		maxMinSearch(12, 13, 14, 15);
	
		/*
		  Lab 1 Task 3: Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
		*/

		x1 = 2;
		y1 = 2;
		
		x2 = 3;
		y2 = 3;
		
		x3 = 3;
		y3 = 4;
		
		dotsCheck(x1, y1, x2, y2, x3, y3);
		

		/*
		  Lab 1 Task 4: Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
		                Определить, пройдет ли кирпич через отверстие.
		*/
		
		rectangle_x = 10;
		rectangle_y = 5;
		
		brick_x = 10;
		brick_y = 5;
		brick_z = 3;
		
		brickCheak(rectangle_x, rectangle_y, brick_x, brick_y, brick_z);
		
		
		/*
		  Lab 1 Task 5: Вычислить значение функции: x^2 - 3x + 9, x<=3, 1/(x^3 +6) x > 3
		*/

		x = 1500;
		
		systemValue(x);

		
	}

}
