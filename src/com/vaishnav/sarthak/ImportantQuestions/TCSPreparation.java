package com.vaishnav.sarthak.ImportantQuestions;

public class TCSPreparation {

	public static int maximumSumSubArray(int array[]) {
		int maxSum=array[0];
		int currentSum=maxSum;
		for(int i=1;i<array.length;i++) {
			currentSum=Math.max(currentSum+array[i], array[i]);
			maxSum=Math.max(currentSum, maxSum)
;		}
		
		return maxSum;
	}
	
	public static void startEndPositionOfTargetElementX(int nums[],int targetElement) {
		int tempI=-1,tempJ=-1;
		int i=0,j=nums.length-1;
		while(tempI==-1||tempJ==-1) {
			if(nums[i]==targetElement)
				tempI=i;
			else 
				i++;
			
			if(nums[j]==targetElement)
				tempJ=j;
			else 
				j--;			
		}
		System.out.println(tempI+" ,"+tempJ);
	}
	
//	public static int maximumSumInArray {}

	public static boolean isPalindrome(char ch[] ,int i,int j) {
		if(ch.length<2)
			return false;
		
		if(i==j)
			return true;
		
		if(ch[i]!=ch[j])
			return false;
		else
			isPalindrome(ch,i+1,j-1);						
			
		return false;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {-2,-3,4,-1,-2,1,5,-3};
		//System.out.println(		maximumSumSubArray(array));
		//int nums[]= {2,3,6,7,7,8,8,8,12};
		int nums[]= {5,6,6,7,8,8,8};
		startEndPositionOfTargetElementX(nums,5);
		String str="radar";
		char ch[]=str.toCharArray();
		int i=0,j=ch.length-1;
		//System.out.println(isPalindrome(ch,i,j));
	}

}
