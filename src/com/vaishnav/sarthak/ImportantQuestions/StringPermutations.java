package com.vaishnav.sarthak.ImportantQuestions;

import java.util.Scanner;

class StringPermutations {

	/*
	 * public static void permutations(String str) { char ch[] =str.toCharArray();
	 * StringBuffer sb=new StringBuffer(str);
	 * 
	 * 
	 * }
	 */
	
  public static void main(String[] args)
    {
	  
		/*
		 * String str="cd"; permutations(str);
		 */
	  Scanner sc=new Scanner(System.in);
	  
	  int n=sc.nextInt();
	  for(int i=0;i<=n;i++) {
		  if(i%3==0)
			  System.out.println("Fizz");
		  
		  else if(i%5==0)
			  System.out.println();
		  
	  }
    }
}