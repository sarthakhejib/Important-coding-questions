package com.vaishnav.sarthak.ImportantQuestions;

import java.util.Arrays;

public class ProblemOnStrings {

	static void anagram(String str1, String str2) {
		if (str1.length() == str2.length()) {
			char ch1[] = str1.toLowerCase().toCharArray();
			char ch2[] = str2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if (Arrays.equals(ch1, ch2)) {
				System.out.println(str1 + " and " + str2 + " are anagram.");
			}
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagram.");
		}
	}

	static public boolean isPalindrome(String str) {
		char ch[] = str.toCharArray();
		int i = 0;
		int j = str.length() - 1;
		while (i <= j) {
			if (ch[i] != ch[j])
				return false;
			i++;
			j--;

		}
		return true;
	}

	static public String evenOddSequence(String str) {

		char ch[] = str.toCharArray();
		int j,k;
		int count=0,counter=0;
		StringBuffer sb = new StringBuffer(str);
		for( int i=0;i<str.length();i++){
			if(ch[i] % 2 == 0) {
				j=i+1;
				while (j<str.length()&&ch[j] % 2 == 0) {
					j++;
					count=1;					
				}

				if(count==1) {
					sb.insert(j+1, '-');
					//i++;
					count=0;
				}
				else {
					sb.insert(i+1, '-');					
				}
			}

			else {
				k=i+1;
				while (k<str.length() &&ch[k] % 2 != 0) {
					k++;
					counter=1;
				}
				if(counter==1) { 
					sb.insert(k+1, '-');
					counter=0;
					//i++;
				}
				else {
					sb.insert(i+1, '-');

				}
			}
		}
		System.out.println(sb);
		return str;
	}

	public static String evenOddArunabh(String number) {

		if(number==null)
			return null;

		int temp=-1;
		StringBuilder result = new StringBuilder();
		char[] ch = number.toCharArray();

		for(int i=0;i<number.length();i++) {

			if(i!=0) {
				if( (ch[i]%2==0 && temp%2!=0) || (ch[i]%2!=0 && temp%2==0) ) {
					result.append('-');
				}
			}
			result.append(ch[i]);
			temp = ch[i];
		}

		return result.toString();

	}

	public static String dashatize(int number) {

		if(number<0)
			number=-1*number;

		String numberString = String.valueOf(number);
		StringBuilder result = new StringBuilder();
		char[] array = numberString.toCharArray();
		char temp = '\0';

		for(int i=0;i<array.length;i++) {

			if(i!=0) {
				if((array[i]%2!=0 || temp%2!=0) && (array[i]%2==0 || temp%2==0))
					result.append("-");
			}

			result.append(array[i]);
			temp = array[i];
		}

		return result.toString();
	}
	
	public static int largestNum(String num, CharSequence givenNum) {
		int numOne;
		if(num.contains(givenNum)) {
			numOne=Integer.parseInt(num);
			while(num.contains(givenNum)) {
				numOne-=1;
				num=Integer.toString(numOne);
			}
			return numOne;
		}
		else {
			return 0;
		}
	}
	
	public static void sumPair(int array[],int givenNum) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				if(array[i]+array[j]==givenNum) {
					System.out.println(+array[i]+","+array[j]);					
				}								
			}			
		}			 
	}
	
	public static void segregateEvenOdd(int array[]) {    //4,5,7,11,9,13,8,12
		int i=0,temp=0,j=array.length -1;					//4,12,8,7,11,5,9,13
		while(i<j) {
			if(array[i]%2==0 && array[j]%2==0) {
				temp=array[j];
				array[j]=array[i+1];						//4, 6, 11, 9, 18, 8, 12, 88, 2, 6, 8
				array[i+1]=temp;
				i++;
				j--;
			}
			else if(array[i]%2!=0 && array[j]%2!=0) {
				temp=array[i];
				array[i]=array[j-1];
				array[j-1]=temp;
				i++;
				j--;
			}
			else{
				i++;
				j--;				
			}

		}
		for(int a: array) {
			System.out.print(a+" ");
		}
	}
	
	public static void rotation(int newArray[],int position,String rotationDirection) {
		int temp=0;
		int arrayTwo[]=new int[newArray.length];
		if(rotationDirection.equals("left")) {

			//int j=newArray.length -1; 
			int j=0;
			for(int i=position;i<newArray.length;i++) {

				temp=newArray[i];
				newArray[i]=arrayTwo[j];
				arrayTwo[j]=temp;			

				j++;
			}
			for(int i=0;i<position;i++) {
				temp=newArray[i];
				newArray[i]=arrayTwo[j];
				arrayTwo[j]=temp;
				j++;
			}

			for(int c: arrayTwo) {
				System.out.println(c+"");
			}
		}
		else {
			 //position=2;			
			int j=position;
			  int positionOne=0;
			  //positionOne =position;
			 
  			  
			positionOne=newArray.length-position;
			for(int i=0;i<positionOne;i++) {
				temp=newArray[i];
				newArray[i]=arrayTwo[j];
				arrayTwo[j]=temp;			
					j++;				
			}
			 j=0;
			for(int i=0;i<position;i++) {
				temp=newArray[positionOne];
				newArray[positionOne]=arrayTwo[j];
				arrayTwo[j]=temp;
				j++;
			}

			for(int c: arrayTwo) {
				System.out.print(c+" ");
			}
		}
		
		
		
	}
	public int totalParents(int input1,int input2, int[] input3) {
		int count =0;
		for(int i=0;i<input1;i++) {
			if(input3[i]>=input2 || input3[i]==-1 )
				count++;	
		}
		return count;	
	}
	
	


	public static void main(String[] args) {
		/*
		 * // TODO Auto-generated method stub anagram("Dog","GOD");
		 * anagram("kaths","sarthak"); anagram("ElLoH","HELLO"); // //
		 * if(isPalindrome("uhjkj")) // System.out.println("Yes!"); // else //
		 * System.out.println("Nopes"); //
		 */ 
				
 //		System.out.println(evenOddArunabh("2313"));	
  //		System.out.println(evenOddArunabh("234234"));	
   //		System.out.println(evenOddArunabh("81123"));	
    //		System.out.println(evenOddArunabh("25244790"));		
     	    System.out.println(largestNum("145","1"));
		
		int array[]= {4,6,11,9,13,8,12,88,2,26,98};
//		sumPair(array,21);
		//segregateEvenOdd(array);
		int newArray[]= {1,2,3,4,5};
		
		//rotation(newArray,2,"left");
		//rotation(newArray,2,"right");
	}

 }
