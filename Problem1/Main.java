package com.Problem1;

import java.util.Scanner;
   class Main{
	   
	   
   public static String reversString(String input){
   //write the logic
	   
         int len = input.length();
	   
//	   char[] tempCharArray = new char[len];
         
       char[] charArray = new char[len];
       
       
       for(int a=0;a<len;a++) {
    	   charArray[a] = input.charAt(a);
//    	   System.out.println(charArray[a]);
       }
       int left = 0;
       int right =len -1;
       
       while(left<right) {
    	   char temp = charArray[left];
    	   charArray[left] =charArray[right];
    	   charArray[right] =temp;
    	   left++;
    	   right--;
       }
	   
      String output = new String(charArray);
       
   	return output;
   }
    
   
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

       System.out.println("Enter a String to reverse");
     String orignalString = sc.next();


      String result = reversString(orignalString);
     System.out.println("Original String is :"+orignalString);
    System.out.println("Reversed String is :"+ result);
     
}
}
