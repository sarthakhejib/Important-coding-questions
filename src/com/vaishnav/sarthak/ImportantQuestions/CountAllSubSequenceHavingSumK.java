package com.vaishnav.sarthak.ImportantQuestions;

public class CountAllSubSequenceHavingSumK {
	static int countSub(int sum,int s,int index,int ar[]) {
		if(index==ar.length) {
			if(s==sum)
				return 1;
			else 
				return 0;
		}
		s+=ar[index];
		int right=countSub(sum,s,index+1,ar);
		
		s-=ar[index];
		int left= countSub(sum,s,index+1,ar);
		return left+right;
	}

	public static void main(String[] args) {
		int ar[]= {1,2,1,4};
		System.out.println(countSub(6,0,0,ar)); 		
	}

}
