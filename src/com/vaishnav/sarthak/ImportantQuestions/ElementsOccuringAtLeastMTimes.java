package com.vaishnav.sarthak.ImportantQuestions;

import java.util.HashMap;
import java.util.Map;

public class ElementsOccuringAtLeastMTimes {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> map =new HashMap<>();
		int arr[]= {2, 3, 2, 2, 3, 5, 6, 3};
		int  M = 2;
		/*
		 * for(int i=0;i<arr.length;i++) { map.put(i, arr[i]); }
		 */
		for(int i:arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
				
			}
			else {
				map.put(i, 1);
			}
		}
		 for (int key: map.keySet()) {
			 if(map.get(key)>=M) {
					System.out.println(key+" ");
				}
	        } 
		
		

	}

}
