package com.vaishnav.sarthak.CoderPad;


public class CoderPad {

	///are you able to see what I am typing try running the program.. excellent. all set for tomorrwo then.
	//yes!!! Yeah;)
	//0 1 1 2 3 5 8 13 21
	// [ 5, 8, 1, 13, 3, 10, 7, 20]
	// Number system - Decimal - 0 1 2 3 4 5 6 7 8 9, 8 -> 10, 19 -> 23, 81 -> 121, 85 -> 
	// Binary 0 1
	// Octal 0 1 2 3 4 5 6 7
	// Hexadecimal 0 1 2 3 4 5 6 7 8 9 A B C D E
	// 2524479 - > 2-5-244-79
	// 252456 -> 2-5-24-5-6


	public static int printFibonacci(int num){
		int numOne=0,numTwo=1,numThree;
		if(num==0)
			return numOne;

		for(int i=2;i<=num;i++){
			numThree=numOne+numTwo;
			numOne=numTwo;
			numTwo=numThree;
		}
		return numTwo;
	}  

	public static int smallestNum(int array[]){
		int temp;
		for(int i=0;i<array.length;i++){

			for(int j=i+1;j<array.length;j++){
				if( array[i]>array[j]){
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}      
		} 
		return array[1];
	}  

	//efficientSmallestNum
	public static int efficientSmallestNum(int[] array){
		int temp=9999999,secondSmallestNum=9999999;
		for(int i=0;i<array.length;i++){
			if(temp>array[i]){
				secondSmallestNum=temp;
				temp=array[i];            
			}		
		}
		return secondSmallestNum;
	}

	public static String decimalToOctal(int num){
		int octal[]=new int[] {0 ,1, 2, 3, 4 , 5 , 6, 7};

		int remainder;
		String octalNumber="";
		while(num>0){
			remainder = num%8;
			num = num/8;
			octalNumber = octal[remainder] + octalNumber;
		}  

		return octalNumber;
	}
	
	  public  static boolean isPalindrome(int x) {
	        String s= String.valueOf(x);
	        
	        char c[]=s.toCharArray();
	        int i=0, j=c.length-1;
	        
	        int count=0;
	        boolean flag=false;
	        while(i<j){
	            if(c[i]!=c[j]){
	                return false;
	            }
	            else{
	                i++;
	                j--;
	                
	            }
	                return true;
	        }
	        if(c.length-1==count){
	            flag=true;
	        }
	        return flag;
	    }
public static void main(String[] args) {
		//System.out.println(printFibonacci(9));
		//System.out.println(printFibonacci(5));
		//System.out.println(printFibonacci(7));
		int[] array = new int[]{ 5, 8, 1, 13, 3, 10, 7, 20};
		//System.out.println(smallestNum(array));
		//System.out.println(decimalToOctal(81));
		//System.out.println(decimalToOctal(85));
		//System.out.println(efficientSmallestNum(array));
		System.out.println(isPalindrome(121));
			}
	/*
	 * Objective : Intoduction to degisn patterrn and explain the following -
	 * Creational -structural -Behavioral
	 * 
	 * Implement:
	 * 
	 * method overriding abstract class interface
	 */
}
