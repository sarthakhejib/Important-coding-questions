package com.vaishnav.sarthak.ImportantQuestions;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum {

	static void subsetSum(int ind,int arr[],int sum,ArrayList<Integer> ds) {
		if(ind==arr.length) {
			ds.add(sum);
			//System.out.println(ds);
			return;
			
		}
		subsetSum(ind+1,arr,arr[ind]+sum,ds);
		subsetSum(ind+1,arr,sum,ds);
	}
	
	static ArrayList<Integer> main(ArrayList<Integer> list,int sum, int ind){
		//ArrayList<Integer> list=new ArrayList<Integer>();
		int arr[]= {3,1,2};
		subsetSum(0,arr,0,list);
		
		Collections.sort(list);
		return list;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>  list=new ArrayList<Integer> ();
		System.out.println(main(list,0,0));
		

	}

}
