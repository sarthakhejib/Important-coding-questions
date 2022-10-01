package com.vaishnav.sarthak.ImportantQuestions;

import java.util.Scanner;
import java.util.Stack;

public class LargestGoldIngot {
	
	public static double largestIngots
	(int heightOfIndividualIngot,int breathOfIndividualIngot,int ingots[], int numberOfGoldIngots  ) {
		
		double totalVolumeOfIngots=0;
		double mod=Math.pow(10, 9)+7;
		
		for(int i=0;i<numberOfGoldIngots;i++) {
			double currentVolume= (ingots[i]*breathOfIndividualIngot)%mod;
			currentVolume = (currentVolume*heightOfIndividualIngot)%mod;	
			totalVolumeOfIngots=(totalVolumeOfIngots+currentVolume)%mod;
		}		
		int i=0;
		double maxValue=0;
		
		if(numberOfGoldIngots<0 && numberOfGoldIngots>Math.pow(10, 5)) 			
			return 0;
		
		Stack <Integer> stack=new Stack<>();
		
		while(i<numberOfGoldIngots) {
			if(stack.isEmpty()||ingots[i]>ingots[stack.peek()]) {
				stack.push(i);
				i++;
			}
			else {
				int previous=stack.pop();
				int temp=ingots[previous];
				int tempOne=stack.isEmpty()?i:i -stack.peek()-1;
				maxValue=(Math.max((temp*tempOne)%mod, maxValue));
			}
		}
		
		while(!stack.isEmpty()) {
			int previous=stack.pop();
			int temp=ingots[previous];
	 		int tempOne=stack.isEmpty()?i:i -stack.peek()-1;
			maxValue=(Math.max((temp*tempOne)%mod, maxValue));
		}
		maxValue=(maxValue*heightOfIndividualIngot)%mod;
		maxValue=(maxValue*breathOfIndividualIngot)%mod;
		
		return (totalVolumeOfIngots-maxValue)%mod;		
	}
	 
	public static void main(String[] args) {
		
		Scanner scanInput=new Scanner(System.in);
		int numberOfGoldIngots=scanInput.nextInt();
		int heightOfIndividualIngot=scanInput.nextInt();
		int breathOfIndividualIngot=scanInput.nextInt();
		int ingots[]=new int [numberOfGoldIngots];

		for(int i=0;i<numberOfGoldIngots;i++) {
			ingots[i]=scanInput.nextInt();
		}	
		
		System.out.println(largestIngots(heightOfIndividualIngot,breathOfIndividualIngot,ingots,numberOfGoldIngots));	

	}
	
}
