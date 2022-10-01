package com.vaishav.sarthak.BasicPrograms;

public class BasicPrograms {

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
		int temp=99999999,secondSmallestNum=9999999;
		for(int i=0;i<array.length;i++){
			if(temp>array[i]){
				secondSmallestNum=temp;
				temp=array[i];            
			}		
		}
		return secondSmallestNum;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
