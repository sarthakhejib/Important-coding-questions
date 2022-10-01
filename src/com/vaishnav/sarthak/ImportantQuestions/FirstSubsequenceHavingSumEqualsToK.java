package com.vaishnav.sarthak.ImportantQuestions;

import java.util.ArrayList;

public class FirstSubsequenceHavingSumEqualsToK {
	static void print(int i,ArrayList<Integer>list,int arr[],int size,int sum,int s ) {
		if(i==size) {
			if(s==sum) {
				if(list.size()>0)
					System.out.println(list);
			}
		}

		else {
			list.add(arr[i]);
			s+=arr[i];
			print( i+1,list,arr,size,sum,s );
			s-=arr[i];
			list.remove(list.size()-1);
			print( i+1,list,arr,size,sum,s );

		}	
		return;		
	}


	public static void main(String[] args) {
		int arr[]= {1,2,1};
		ArrayList<Integer> list=new ArrayList<>();
		print( 0,list,arr,3,2,0 );

	}

}
