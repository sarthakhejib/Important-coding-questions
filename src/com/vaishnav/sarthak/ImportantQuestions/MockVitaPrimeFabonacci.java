package com.vaishnav.sarthak.ImportantQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MockVitaPrimeFabonacci {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<String> list1=new ArrayList<>();
		
		int n1=2;//sc.nextInt();
		int n2=7;//sc.nextInt();

		int b,c; 
		while(n1 <=n2) 
		{ 
			b=1; 
			c=0; 
			while(b<= n1) 
			{ 
				if((n1%b)==0) 
					c=c+1; 
				b++; 
			} 
			if(c==2) 
				list.add(n1);
			
			n1 ++;
		}

		String array[]=new String [list.size()];
		list.toArray(array);
	
		for(int i=0;i<array.length;i++) {
			for(int j=1;j<array.length;j++) {
				list1.add(array[i]+array[j]);       	
			}
		}
		
		Integer array1[]=new Integer[list1.size()];
		list1.toArray(array1);
		
		ArrayList<String> list2=new ArrayList<>(); 
		int b1,c1,count1=0,j=array1.length-1; 
		int i=0;
		while(i!=j) 
		{ 
			b1=1; 
			c1=0; 
			while(b1<= array1[i]) 
			{ 
				if((array1[i]%b1)==0) 
					c1=c1+1; 
				b1++; 
			} 
			if(c1==2) 
				list2.add(array[i]);

			count1++;
			i ++; 
		}
		list2.toArray(array1);
	
		Arrays.sort(array1);
		
		int smallest=array1[0];
		int largest=array1[array1.length];
		int sum=0;
	
			
			for( i=0;i<=count1;i++){
				sum=smallest+largest;
				smallest=largest;
				largest=sum;
			}
			System.out.println(largest); 	
	}
}




		






