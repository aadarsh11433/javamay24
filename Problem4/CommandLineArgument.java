package com.Problem4;

public class CommandLineArgument {

	static void checker(String[] args) {
		
		if(args.length > 2) {
			System.out.println("error : supplied more than required arguments");
		
			System.out.println(args[2]);
			return;
		}
		if( args.length==1) {
			int num = Integer.parseInt(args[0]);
			
			if(num<0) {
				System.out.println("Number paased is invalid  pass a non negative integer");
				return;
			}
			else {
				System.out.println(fact(num));
			}
		
		}
		
		if( args.length==2) {
			
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			
			int diff = num1-num2;
			if(diff < 0) {
				diff *= -1;
			}
			
			System.out.println(fact(diff));
		}
		
	
	}
	
	
	 ///    ======   method for  finding factorial
	
  static int fact(int num) {
		
	  if(num <2) {
		  return 1;
	  }
		
	  else {
		  return num*fact(num-1);
	  }
	}
	
	
	public static void main(String[] args) {
		
		
		checker(args);
		
		
		

	}

}
