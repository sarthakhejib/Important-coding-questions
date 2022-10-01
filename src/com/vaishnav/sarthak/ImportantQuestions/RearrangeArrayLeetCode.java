package com.vaishnav.sarthak.ImportantQuestions;

public class RearrangeArrayLeetCode {
	public static void rearrangeArray(int[] nums) {

		for(int i=0;i<nums.length;i++){
			if(i%2==0 && nums[i]<0){
				for(int j=i+1;j<nums.length;j++){
					if(nums[j]>0){
						int temp=nums[i];
						nums[i]=nums[j];
						nums[j]=temp;
						break;
					}
				}

			}
			else if(i%2!=0 && nums[i]>0){
				for(int k=i+1;k<nums.length;k++){
					if(nums[k]<0){
						int emp=nums[i];
						nums[i]=nums[k];
						nums[k]= emp;
						break;
					}
				}
			}
		} 
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] nums= {28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
		rearrangeArray(nums);
	}

}
