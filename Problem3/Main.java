package com.Problem3;

public class Main {

	
	boolean checkPrime (int a) {
		
		if(a<2) {
			return false;
		}
		 int count =0;
		for(int b = 2 ;b<=a;b++) {
			
			if(a%b ==0) {
				count++;
			}
			
		}
		if(count>1) {
			return false;
		}
		
		return true;
	}
	
	
	int[]  trimarr(int[] a) {
		
		int count = 0;
		
		for(int b:a) {
			if(b!=0) {
				count++;
			}
		}
		
		int[] ans  = new int[count];
		
		int index = 0;
		
		for(int b:a) {
			if(b!=0) {
				ans[index] = b;
				index++;
			}
		}
		
		
		return ans;
	}
	
	
	
	
	
		public int[] findAndReturnPrimeNumbers(int[] inputArray){
		//write the logic to iterate through the supplied inputArray and
		//determine each element whether it is prime or not
			
			int[] ansarr = new int[inputArray.length];
			
			
			for( int a =0; a<inputArray.length;a++) {
				
				if(checkPrime(inputArray[a])) {
					ansarr[a] =inputArray[a];
				}
			}
			
		int[] finalarr =	trimarr(ansarr);
			
			return finalarr;
		//create a second array of int
		//if any number is prime inside the inputArray then add that number inside the second
		//array
		//and return the second array
		//if no prime number is found then return the empty array.
			
		}
		public static void main(String[] args){
		//Create the object of Main class
		//on the object of Main class call the findAndReturnPrimeNumbers method
		//by supplying the following array as the parameter
		int[] arr = {10,12,4,20,81,14,15};
		
		Main ob = new Main();
	   int []  ans =	ob.findAndReturnPrimeNumbers(arr);
	   
	   if(ans.length == 0) {
		   System.out.println("Prime number not found in the supplied Array");
	   }
	   else
	   {
		   
		   for(int a :ans) {
			   System.out.println(a);
		   }
		   
	   }
		
		//print each element from the returned array of findAndReturnPrimeNumbers method
		//if findAndReturnPrimeNumbers method returns an empty array then print the following
//		message:
		// "Prime number not found in the supplied Array"
		}
		
	
	
}
