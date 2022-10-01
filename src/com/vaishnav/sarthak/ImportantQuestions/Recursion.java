package com.vaishnav.sarthak.ImportantQuestions;

public class Recursion {
	// LCM, GCM

	public static int factorial(int num) {
		if(num==0) 
			return 1;			
		else
			return (num*factorial(num-1));
	}
	
	static int a=0,b=1,c;
	
	// f(x) = f(x-1) + f(x-2)
	
	public static void printFabonacci(int numOne)	{

		if(numOne>0) {
			c=a+b;
			System.out.print(" "+c+" ");
			a=b;
			b=c;
			printFabonacci(numOne-1);			
		}	
	}
	
	public static int secondSmallestNumber(int[] array){
		int temp=9999999,secondSmallestNum=9999999;
		for(int i=0;i<array.length;i++){
			if(temp>array[i]){
				secondSmallestNum=temp;
				temp=array[i];            
			}		
		}
		return secondSmallestNum;
	}
	
	public static boolean findElement(int array[],int element,int i,int j) {
		
		if(array.length==0)
			return false;
		
		if(i>array.length)
			return false;
		
		if(array[i]==element)
			return true;
		
		if(array[j]==element)
			return true;
		
		return(findElement(array,element,i+1,j-1)); 
	}
	
	public static boolean isPalindrome(char[] ch,int i,int j) {
		
		if(ch.length<1)
			return true;
		
		if(ch[i]!=ch[j]) 
			return false;
		
		if(i<j)
			return isPalindrome(ch,i+1,j-1);
		
		return true;
	}
	
	public static int sumOfDigits(char c[],int i,int sum) {
		if(c.length==0)
			return 0;
		if(i<0)
			return sum;
		else
			sum=sum+c[i];
		return sumOfDigits(c,i-1,sum);
				
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  //int num=4; int fact=factorial(num);
		//  System.out.println("Factorial of "+num+" is "+fact);

		
		  //int numOne=8; printFabonacci(numOne);
		
		//char[] c=st.toCharArray();
	//	int i=c.length-1;
		int sum=0;
		//System.out.println(sumOfDigits(c,i,sum));
		
		
		  int array[]= {1,22,3,4,4,55,67,9};
		  int element=55;
		  // i=0;
		  int j=array.length-1;
		 // System.out.println(findElement(array,element,i,j));
		  
		  String str="malayalam";
		  char ch[]=str.toCharArray();
		  
		  j=ch.length-1;
		 //System.out.println(isPalindrome(ch,i,j));	
		  
	//	System.out.println(checkPrime(7));
	}

}
