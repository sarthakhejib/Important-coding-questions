package com.vaishnav.sarthak.ImportantQuestions;

import java.util.Scanner;

public class CodeVitaZoneTwo {

	public static int filltheCube() {
		int total=0;
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		String bricks[][]=new String[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {				
				bricks[i][j]=sc.next();			
			}
		}
		
		return total;
		
	}
	
	public int maxSum() {
		Scanner sc=new Scanner(System.in);
		int windowSize= sc.nextInt();
		int d=sc.nextInt();
		int n=sc.nextInt();
		
		int array[]=new int [n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		int i=0,window=0,sum=0, j=1;
		//for(int j=1;j<n;j++) {
		while( j<n) {// Friend 1
			if(array[i]<array[j] && window<=windowSize) {
				sum=sum+array[i];
				i++;
				window++;
				j++;
			}
			j+=1;
			i=j-1;
		//	if(array[j]<array[j+1] && )
		}
		
		for( i=0;i<n;i++) {//Friend 2
			
		}
		return n;
	}

	
	
	public static void main(String[] args) {
	}
		
}
