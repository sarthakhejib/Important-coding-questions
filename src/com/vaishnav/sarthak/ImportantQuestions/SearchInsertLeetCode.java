package com.vaishnav.sarthak.ImportantQuestions;

public class SearchInsertLeetCode {

	public static int searchInsert(int[] nums, int target) {
        //TC: O(log n)
        //SC: O(1)
        
        if(nums.length<0)
            return 0;
        
        if(target>nums[nums.length-1])
            return nums.length;
        
        if(target==nums[nums.length-1])
            return nums.length-1;
        
        int start=1, end=nums.length-1;
        int mid= start+(end-start)/2;
        
        while(start<end){// s=0 e=0
        	mid= start+(end-start)/2;
        	if(nums[mid]==target)
                return mid;
            
            if(target<nums[mid])
                end=mid;
            
            else
                start=mid+1;
               
        }
		return target>nums[start] && target<nums[end]? start+1:mid;
        //return start;
    }
	public static void main(String[] args) {
		int nums[] = {1,3,5,6};
		int target = 2;
		System.out.println(	searchInsert(nums,target));
	}

}
