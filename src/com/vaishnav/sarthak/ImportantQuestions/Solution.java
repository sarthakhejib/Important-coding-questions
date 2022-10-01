package com.vaishnav.sarthak.ImportantQuestions;
class Solution {


	public static void main (String ar[]) {
		int nums[]= {3,3};
		int target=6,count=0;
		int arr[]=new int[2];        
		for(int i=0;i<nums.length;i++){
			if(count!=0)
				break;
				
			int n=target-nums[i];
			for(int j=1;j<nums.length;j++){
				if(nums[j]==n){
					arr[0]=i;
					arr[1]=j;
					count++;
				}

			}
		}
		// return arr;
		//System.out.println(twoSum(num,6));
		//twoSum(num,6);
		for(Integer i: arr) {
			System.out.println(arr[i]);
		}
	}
}