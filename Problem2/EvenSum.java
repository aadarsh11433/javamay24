package com.Problem2;
public class EvenSum {
	
	static void evenSum(int[][] arr) {
		
		for(int a = 0;a<arr[0].length;a++) {  // since its  a matrix all rows will have equal cols.
			
			int sum = 0;
			for(int b =0;b<arr.length;b++) {
				
				
				if(arr[b][a]%2 == 0) {
					sum +=arr[b][a];
				}
			}
			
			System.out.println(sum);
		}
		
		
	}
	

	public static void main(String[] args) {
	
		
		
		int [][] arr  =   {
				{9,3,8},
				{6 ,4, 5 },
				{ 3 ,2 ,4}
		};
		
		evenSum(arr);
		
		
//		for(int[] a: arr) {
//		    
//			for(int b : a) {
//				System.out.println(b);
//			}
//			
//			
//		}
		
		
		

	}

}

