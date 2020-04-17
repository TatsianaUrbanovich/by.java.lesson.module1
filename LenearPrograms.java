package by.java.lesson.mod1;

import java.lang.reflect.Array;

public class LenearPrograms {


	/*
	 *Lab 1; Task 1: Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
	*/
	
	public static double ValueofZfunction(int a, int b, int c) {
		
		double result;
		
		result = (a-3.0)*b/2.0+c;
		
		System.out.println("Lab1; Task 1");		
		
		System.out.println("Value of function z=((a-3)*b/2))+c with values of a = " + a + ","
				+ "b = " + b + ", c= " + c + " is: "+ result + "\n");
		
		return result;
		
		}
	
	
	/*
	 *Lab 1; Task 2: Вычислить значение выражения по формуле (все переменные принимают действительные значения):
	                 (b+sqrt(b^2+4ac)/2a -a^3*c + b^-2*c
	*/
	
	public static double FormulaCalculation(double a, double b, double c) {
		
		double result;
		
		result = (b + Math.cbrt(Math.pow(b, 2)+4.0*a*c))/2.0*a - Math.pow(a, 3)*c + Math.pow(b, -2)*c;
		
		System.out.println("Lab1; Task 2");
		
		System.out.println("Value of function (b+sqrt(b^2+4ac)/2a -a^3*c + b^-2*c with values of a = " + a + ","
				+ "b = "+ b + ", c= " + c + " is: " + result + "\n");
		
		return result;
	}
	
	
	/*
	 *Lab 1; Task 3: Вычислить значение выражения по формуле (все переменные принимают действительные значения):
	                 (sin(x)+cos(y))/(sin(y)-cos(x))*tg(xy)
	*/
	
	public static double TrigonometryCalc(double x1, double y1) {
		

		double x;
		double y;
		double result;
		
        // converting values to radians 		
        x = Math.toRadians(x1); 
        y = Math.toRadians(y1); 
        
		result= Math.toDegrees((Math.sin(x) - Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x*y));
		
		System.out.println("Lab1; Task 3");
		
		System.out.println("Value of function (sin(x)+cos(y))/(sin(y)-cos(x))*tg(xy) with values of x = " + x +
				", y = " + y + " is: " + result + "\n");
		
		return result;
	}
	
		
	/*
	 *Lab 1; Task 4: Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
	                 Поменять местами дробную и целую части числа и вывести полученное значение числа.
	*/
	
	public static double ChangeNum(double Num) {
		
		String str;
		double result;
		
 	    str = Character.toString(Double.toString(Num).charAt(4))+Character.toString(Double.toString(Num).charAt(5))+Character.toString(Double.toString(Num).charAt(6))+"."+Math.round(Num);
        
 	    result = Double.valueOf(str);
 	    
		System.out.println("Lab1; Task 4");
		
		System.out.println("Switching number for " + Num + " is: " + result + "\n");
		
		return result;


	}

	
    /*
	 *Lab 1; Task 5: Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
	                 Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
                     ННч ММмин SSc.
	*/	
	
	public static void timePrint(int num) {
		
		int hours;
		int minutes;
		int seconds;
		
		String add_h;
		String add_m;
		String add_s;
		
		
		hours = num/3600;
		minutes = (int)(num % 3600) / 60;
		seconds = (int)(num % 3600) % 60;
		
		add_h = String.valueOf(hours);
		add_m = String.valueOf(minutes);
		add_s = String.valueOf(seconds);
		
		if (hours < 10) {
			
			add_h='0'+Integer.toString(hours);
			
		}
		
		if (minutes < 10) {
			
			add_m='0'+Integer.toString(minutes);
			
		}
		
		if (seconds < 10) {
			
			add_s='0'+Integer.toString(seconds);
		}
		
		System.out.println("Time in seconds: "+ num + " is: "+  add_h + "." + add_m + "." + add_s +"\n");
		
		
	}
	
	/*
	 *Lab 1; Task 6: Для данной области составить линейную программу, которая печатает true, если точка с
	                 координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
     
                            Тестовый вариант
                            int [][] twoDimArray_easy_test = {
                            
                            {0,0,0,0},
             				{0,1,1,0},	
                            {0,1,0,1,}	};
                            
    x1, y1 - Координаты точки
	*/	
	
	public static void checkColorSimple(int x, int y){
		
		System.out.println("Lab1; Task 6");
		
		if(((x > -3 && x < 3) && (y > -4 && y < 5)) || ((x > -4 && x < 4) && (y > -4 && y < 1))) {
			
			System.out.println("It is colored");
			
			} else {
				
				System.out.println("It is no colored");
				
			}
		
	}

	/* Второй вариант решения задачи
	 * 
	 *Lab 1; Task 6: Для данной области составить линейную программу, которая печатает true, если точка с
	                 координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
     
                            Тестовый вариант
                            int [][] twoDimArray_easy_test = {
                            
                            {0,0,0,0},
             				{0,1,1,0},	
                            {0,1,0,1,}	};
                            
    x1, y1 - Координаты точки
	*/	
	
	public static void checkColor(int[][] a) {
		
		int counter_white = 0;
		int counter_black = 0;
		
		System.out.println("Lab 1; Task 5");
		
	    System.out.println("Searching color cells in Array, where " + a.length + " rows, " + a[0].length + "colums. Result is:");
	    
	   	for(int i = 0; i < a.length; i++) {
	   		
		 for(int j = 0; j < a[0].length; j++) {
			 
			if(a[i][j] == 0) {
				
				System.out.print("False " + "\n"); 
				
				counter_white++;
				
			} else {
				
				System.out.print("True " + "\n");
				
				counter_black++;
				
			}
		  }
		 
		}
	   	
		System.out.println("Empty cells "+ counter_white+". Color Cells " + counter_black);
	}
	
	
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		double a1;
		double b1;
		double c1;
		
		double x;
		double y;
		double t;
		
		int x1;
		int y1;
		
		int time;
		

		/*
		 *Lab 1; Task 1: Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
		*/
		a = 12;
		b = 36;
		c = 42;
		
		ValueofZfunction(a, b, c);
		
		
		/*
		 *Lab 1; Task 2: Вычислить значение выражения по формуле (все переменные принимают действительные значения):
		                 (b+sqrt(b^2+4ac)/2a -a^3*c + b^-2*c
		*/
		a1 = 3;
		b1 = 2;
		c1 = 7;
		
		FormulaCalculation(a1, b1, c1);
		
		
		/*
		 *Lab 1; Task 3: Вычислить значение выражения по формуле (все переменные принимают действительные значения):
		                 (sin(x)+cos(y))/(sin(y)-cos(x))*tg(xy)
		*/
		x = 30;
		y = 60;
		
		TrigonometryCalc(x, y);
		
		
		/*
		 *Lab 1; Task 4: Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
		                 Поменять местами дробную и целую части числа и вывести полученное значение числа.
		*/
		t = 234.231;
		
		ChangeNum(t);
		
		
		/*
		 *Lab 1; Task 5: Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
		                 Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
                         ННч ММмин SSc.
		*/				
		time = 216589;
		
		timePrint(time);
		
		
				
		/*
		 *Lab 1; Task 6: Для данной области составить линейную программу, которая печатает true, если точка с
		                 координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
		                 
		                 		int [][] twoDimArray = {
		                 		
		                 		{0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		                 		{0,0,0,0,0,0,0,0,0,0,0,0,0,0},	
                                {0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				                {0,0,0,0,1,1,1,1,0,0,0,0,0,0},	
                                {0,0,0,0,1,1,1,1,0,0,0,0,0,0},	
                                {0,0,0,0,1,1,1,1,0,0,0,0,0,0},	
                                {0,0,0,0,1,1,1,1,0,0,0,0,0,0},	
                                {0,0,1,1,1,1,1,1,1,1,1,1,0,0},	
                                {0,0,1,1,1,1,1,1,1,1,1,1,0,0},	
                                {0,0,1,1,1,1,1,1,1,1,1,1,0,0},	
                                {0,0,1,1,1,1,1,1,1,1,1,1,0,0}	};

                                
        x1, y1 - Координаты точки
		*/	

		x1 = 2; 
		y1 = 1;
		
		checkColorSimple(x1, y1);
		
	}

}
