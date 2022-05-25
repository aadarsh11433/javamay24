package com.practice;

public class Main {
	
	int largestInArr(int[] arr) {
		
		int max  = Integer.MIN_VALUE;
		
		for( int a : arr) {
			if(a>max) {
				max = a;
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		

		Main obj1 =new Main();
		
		int[] arr  = {81,56,78,1000,552,933,78,566,100,45};
		
		int ans = obj1.largestInArr(arr);
		
		System.out.println(ans);
		
		
		int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		int sum = 0;
		double average;
		// access all elements using for each loop
		// add each element in sum
		for (int number: numbers) {
		sum += number;
		}
		// get the total number of elements
		int arrayLength = numbers.length;
		// calculate the average
		// convert the average from int to double
		average = (double)sum / arrayLength;
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);

		Student[] students = new Student[3];
		students[0] = new Student(10,"Ram");
		students[1] = new Student(20,"Ramesh");
		students[2] = new Student(40,"Amit");
		
		
		for(Student student:students){
		student.printDetails();
		}

		
		
		int[][] a = {
				{1, -2, 3},
				{-4, -5, 6, 9},
				{7},
				};
		
		System.out.println(a[1][2]);
				for (int i = 0; i < a.length; ++i) {
					System.out.println(a[i].toString());
				for(int j = 0; j < a[i].length; ++j) {
				System.out.println(a[i][j]);
				}
				}

		///           we problem
				for (int[] c :a) {
					for(int d : c) {
						System.out.println(d);
					}
				}
		
				
				//======== ========  command line argument =======================//
				
				if(args.length == 2){
					int num1 = Integer.parseInt(args[0]);
					int num2 = Integer.parseInt(args[1]);
					System.out.println("The Result is "+ (num1+num2));
					}else
					System.out.println("Please supply only 2 numbers");
				
	}

}
