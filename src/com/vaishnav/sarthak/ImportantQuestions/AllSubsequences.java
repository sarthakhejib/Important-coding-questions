package com.vaishnav.sarthak.ImportantQuestions;

import java.util.ArrayList;

public class AllSubsequences {

	static void printSubsequence(int index,ArrayList<Integer> list,int arr[],int size) {
		if(index==size) {
			if(list.size()>0)
				System.out.println(list);
		}
		else {
		//Take
			list.add(arr[index]);
		printSubsequence(index+1,list,arr ,size);
		list.remove(list.size()-1);
		printSubsequence(index+1,list,arr ,size);
		
		}
		return ;
	}
	
	public static void main(String[] args) {
		int index=0;
		int arr[]= {3,1,2};
		ArrayList<Integer> list=new ArrayList<>();
		printSubsequence(index,list,arr ,arr.length);

		
	}

}
