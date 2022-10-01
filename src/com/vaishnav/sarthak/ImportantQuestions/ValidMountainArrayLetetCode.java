package com.vaishnav.sarthak.ImportantQuestions;

public class ValidMountainArrayLetetCode {
	public static boolean validMountainArray(int[] arr) {
		if(arr.length<3)
			return false;
		int max=Integer.MIN_VALUE;
		int maxIndex=-1;
		for(int i=0;i+1<=arr.length;i++) {
			if(max<arr[i] ) {
				max=arr[i];
				maxIndex=i;
			}
//		if(arr[i]==arr[i+1] && i+1<=arr.length)
//				return false;
		}
		int leftHalf=0;
		int rightHalf=0;
		for(int i=0;i+1<maxIndex;i++) {
			if(arr[i]>max)
				leftHalf++;
			if(arr[i]==arr[i+1])
				return false;
				
		}
		for(int i=maxIndex;i+1<arr.length;i++) {
			if(arr[i]>max)
				rightHalf++;
			if(arr[i]==arr[i+1])
				return false;
			
		}
		return rightHalf==0 && leftHalf==0?true:false;
	}
	public static void main(String[] args) {
		int[] arr= {2,0,2};
		System.out.println(validMountainArray(arr));
	}

}
