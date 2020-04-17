package by.java.lesson.mod1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Loops {

	
	/*
	  Lab 1 Task 1: Напишите программу, где пользователь вводит любое целое положительное число.
	                А программа суммирует все числа от 1 до введенного пользователем числа.
	*/
	
	 static public void check(){
		 
			String str;
			int result;
			int x;
			
	        Scanner in = new Scanner(System.in);
	        
		    System.out.println("Lab1 Task 1: Int value of chars."+"\n");
		    
	        System.out.print("Enter integer positive value: ");
		 
			while(in.hasNextInt() == false) {
				
				str = in.nextLine();
		        System.out.println("Enter integer positive value: ");
			
			} 
			
			str = in.nextLine(); 
			
	        int n = str.length();
	        
	        str = str.replaceAll("[^0-9]", "");
	        
	        if (str.length() < n) {
	        	
	        	check();
	        	
	        } else {
	        	
	        	x = Integer.valueOf(str);
	        	
	            result = Sum(x);
	            
	            System.out.println("Sum of num is: " + result + "\n");
	            

	        }
		 
	 }	
	
	
	public static int Sum(int x) {
		
		
		int result = x;
		
		for(int i = x; i > 0; i--){
			
			result += i-1;
			
		}
		
		return result;
	}
	
	
	/*
	  Lab 1 Task 2: Вычислить значения функции на отрезке [а,b] c шагом h: y = x, x > 2; y = - x, x <= 2
	*/
	
	public static void IntervalValue(int a, int b, int step) {
		
		int y = 0;
		
		System.out.println("Lab1 Task2: Values of this function on intrerval from " + a + " to " + b + "are:");
		
		for(int x = a; x <=b-step; x += step) {
			
			if(x > 2) {
				
				y = x;
				
				System.out.println("y = "+y);
				
			}
			
			if(x <= 2) {
				
				y = -x;
				
				System.out.println("y = " + y);
				
			}
		}
		
		System.out.println("");
		
	}
	
	
	/*
	  Lab 1 Task 3: Найти сумму квадратов первых ста чисел.
	*/
	
	public static int SumPows(int x) {
		
		int result=0;
		
		for(int i = 0; i < x; i++){
			
			result += Math.pow(i, 2);
			
		}
		
		return result;
	}
	
	/*
	  Lab 1 Task 4: Составить программу нахождения произведения квадратов первых двухсот чисел.
	*/
	
	public static double SumMultPows(double x1) {
		
		double result = 1;
		
		for(int i = 1; i <= x1; i++){
			
			result=result* Math.pow(i, 2);
			
		}
		
		return result;
	}
	
	/*
	  Lab 1 Task 5: Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
                  заданному е. Общий член ряда имеет вид: a(n)=(1/2^n)+(1/3^n)
	*/
	
	public static void SearchModule(double e) {
		
		double sum;
		sum=0;
		
		BigDecimal e1;
		e1 = new BigDecimal(e);
		
		double[] y = new double[100];
		
		for(int n = 0; n < y.length; n++)
		{

  		  y[n] = 1.0/Math.pow(2,n)+1.0/Math.pow(3,n);
		  
		  BigDecimal y_cur= new BigDecimal(Math.abs(y[n]));
		  
		  if ((Math.abs(y[n]) > e) || (y_cur.compareTo(e1) == 0))
		  {
			  sum = sum + y[n];

		  }
		  
         }
		
		 System.out.println("Lab1 Task5: Total sum of this elements is: "+ sum + "\n");
	}
	
	
	/*
	  Lab 1 Task 6: Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
	*/
	
	public static void charSow(char[] ch) {
		
		System.out.println("Lab 1 Task 6: Int value of chars:"+"\n");
		
		for(int i = 0; i< ch.length; i++){
			
			System.out.println(ch[i] + "-" + Character.getNumericValue(ch[i])); 
			
		}
		
		System.out.println("");
	}

	
	/*
	  Lab 1 Task 7: Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
	                m и n вводятся с клавиатуры.
	*/
	
	public static void searchDeviders(int number) {
		
		number = Math.abs(number);
		

		 String res = "";
		 
		 for (int i = 1; i <= number; i++)
		 {
			 
	       if((0 == (number % i))&(i!=1)&(i!=number)) {
	    	   res += i+ ",";
	       }
	       
		 }
		 
		 String result;
		 result="";
		 
		 for (int n = 0; n <= res.length()-2; n++)
		 {
			 result = result +res.charAt(n);
		 }
		 
		 if(result!="") {
			 
		  System.out.println("Deviders of: "+ number +" are: " + result);
		  
		 }


		
	}


	public static int devidersCounter(int number) {
		
		int counter;
		counter=0;
		
		number = Math.abs(number);
		
		 String res = "";
		 
		 for (int i = 1; i <= number; i++)
		 {
			 
		  if((0 == (number % i))&(i!=1)&(i!=number)) {
	   	   counter++;
	      }
	      
		 }
		
		return counter;
		
	}

	public static int call(int m) {
		
		String str;
		
		Scanner in = new Scanner(System.in);

		while(in.hasNextInt() == false) {
			str = in.nextLine();
			System.out.println("Enter down border of interval:");
		}
		
		m = Integer.valueOf(in.nextLine());
		
		return m;
		
	}
	
	public static void devidersSearchMain() {
		
		int m;
		int n;
		String str;
		
		m = 0;
		n = 0;
		
	    System.out.println("Lab1 Task 7");
				
		System.out.println("Enter down border of interval:");
		
		m = call(m);
		
		System.out.println("Enter up border of interval:");		
		
		n = call(n);
		
		for(int i=m; i<=n; i++) {
			
	  	 if(devidersCounter(i) == 0) {
	  		 
			System.out.println("No deviders for " + i);	
			
		 } 
		 
		 searchDeviders(i);
		 
        }
	
		
	}
	
	
	/*
	  Lab 1 Task 8: Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
	*/
	
	//Это дополнительный метод, главная реализация - sameNumbers
	
	public static String checkChar(String s3, char a) {
		int counter;
		counter = 0;
		
		for(int i = 0; i <= s3.length()-1; i++) {
			
         if(s3.charAt(i) == a) {
        	   counter++;
		  }
     	}
		
		if(counter == 0) {
		 s3 = s3 + a;
		};
		return s3;
	}
	
	public static void sameNumbers(int a, int b) {
		
		String s1;
		String s2;
		String s3;
				
		s1 = String.valueOf(a);
		s2 = String.valueOf(b);
		s3="";
		
		
		for(int i = 0; i <= s1.length()-1; i++) {

			for(int j = 0; j <= s2.length()-1; j++) {
				
				if(s1.charAt(i)==s2.charAt(j)) {
					s3 = checkChar(s3,s1.charAt(i));
				}

		
			}
			
		}
		
		System.out.println("");
	    System.out.println("Lab1 Task 8");
		System.out.print("Common numbers for "+ s1 +" and " + s2 + " are: "+ s3);

		
	}
	
	
	public static void main(String[] args) {

		int x; 
		int result;
		
		double x1;
		double d_result;
		
		int y;
		
		int a;
		int b;
		int step;
		double e;
		
		int num1;
		int num2;

		
		/*
		  Lab 1 Task 1: Напишите программу, где пользователь вводит любое целое положительное число.
		                А программа суммирует все числа от 1 до введенного пользователем числа.
		*/

		check();//Вычисление суммы

		
		

		/*
		  Lab 1 Task 2: Вычислить значения функции на отрезке [а,b] c шагом h: y = x, x > 2; y = - x, x <= 2
		*/
		a = -4;
		b = 4;
		step = 1;
		
		IntervalValue(a, b, step);
		

		/*
		  Lab 1 Task 3: Найти сумму квадратов первых ста чисел.
		*/
		result=0;
		y = 100;
				
		result = SumPows(y);
				
		System.out.println("Lab1, Task3: Sum of squares of a number"+"\n"+"Result is: " + result + "\n");
		

		/*
		  Lab 1 Task 4: Составить программу нахождения произведения квадратов первых двухсот чисел.
		*/
		d_result = 0.0;
		x1=200;
		
		d_result = SumMultPows(x1);
		
		System.out.println("Lab1, Task4: Mult of squares of a number" + "\n" + "Result is: " + Math.round(d_result)+"\n");
				
		
		/*
		  Lab 1 Task 5: Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
                        заданному е. Общий член ряда имеет вид: a(n)=(1/2^n)+(1/3^n)
		*/
		e = 9.094947840255617E-13;
		
		SearchModule(e);
		
		
		/*
		  Lab 1 Task 6: Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
		*/
		char[] ch = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','U','Z'};
				
		charSow(ch);
		
		
		
		/*
		  Lab 1 Task 7: Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
		                m и n вводятся с клавиатуры.
		*/
		devidersSearchMain();
		

		/*
		  Lab 1 Task 8: Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
		*/
		num1 = 000010000076543;
		num2 = 700500003;
		
		sameNumbers(num1, num2);
		
	}

}
