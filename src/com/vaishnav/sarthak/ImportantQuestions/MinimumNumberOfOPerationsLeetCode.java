package com.vaishnav.sarthak.ImportantQuestions;

public class MinimumNumberOfOPerationsLeetCode {

	public static int[] minimumOperations(String nums) {
		if(nums.length()==1 && nums.charAt(0)==0)
			return new int[] {0};
	
		int arr[]=new int[nums.length()];
		
		int j=0, total=0;
		for(int i=0;i<nums.length();i++) {
			total=0;
			j=0;
			while(j<nums.length()) {
				int abs=i-j;
				if(nums.charAt(j)!='0' && i!=j) {
					total+=Math.abs(abs);
					j++;
				}
				else 
					j++;
			}
			arr[i]=total;
			
		}
	return arr;
	}
	public static void main(String[] args) {
		String nums= "110";
		minimumOperations(nums);
		
	}

}
