package com.vaishnav.sarthak.ImportantQuestions;

import java.util.ArrayList;

public class GeeksForGeeks {

	public static int[] help_classmate(int arr[], int n) 
	{ 
	    // code here
		int element=0,i=0;
		int ar[]=new int[n];
	
		
	    
	    for( i=0;i<arr.length;i++) {
	     
	    	ar[i]=-1;
	    		for(int j=i+1;j<arr.length;j++) {
	    			if(arr[i]>arr[j])
	    				ar[i]=arr[j];
	    				break;
	    			
	    		
	    		}	    		
	    	}
	    	return ar;
	    }
	    
	 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {3,8,5,2,25};
		int n=5;
		
		System.out.println(help_classmate(arr,n));;
		
	}

}
