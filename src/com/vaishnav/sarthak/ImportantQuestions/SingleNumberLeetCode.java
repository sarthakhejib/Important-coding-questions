package com.vaishnav.sarthak.ImportantQuestions;

public class SingleNumberLeetCode {

	public static int singleNumber(int[] nums) {
		if(nums.length==1)
			return nums[0];
		if(nums.length==2 && nums[0]==nums[1])
			return 0;
		
		int i=0,j=nums.length-1,  count=1;
		while(i<=nums.length-1 && j>=0) {
			if(nums[i]==nums[j] && i!=j) {
				count--;
				i++;
				j=nums.length-1;
				if(count==0)
					count=1;
			}
			else if(j==0) {
				if(count==1) 
					return nums[i];	
				i++;
				j=nums.length-1;
				count=1;
			}
			else {
				j--;
			}
		}
		return 0;
	}
	
	public static void getConcatenation(int[] nums) {
	     int arr[] = new int[nums.length*2];
	      int count=0;
	       int i=0; 
	       while(count<=arr.length-1){
	           if(i<=nums.length-1){
	           arr[count]=nums[i];
	            count++;
	               i++;
	            }
	           else{
	               i=0;
	           }
	               
	       } 
	        //System.out.println(arr);;
	       for(int j: arr) {
	    	   System.out.println(arr[j]);
	       }
	    }
	
	public static void main(String[] args) {
		int[] nums= {1,2,1};
		//System.out.println(getConcatenation(nums));
		getConcatenation(nums);
	}

}
