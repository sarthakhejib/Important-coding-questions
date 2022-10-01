package com.vaishnav.sarthak.ImportantQuestions;

import java.util.HashMap;
import java.util.Set;

public class SortCharacterByFrequency {

	public static String frequencySort(String s) {
		HashMap<Character,Integer> map=new HashMap<>();
		char ch[]=s.toCharArray();
		for(char c:ch){
			if(map.containsKey(c))
				map.put(c,map.get(c)+1);
			else 
				map.put(c,1);
		}
		int feq = -1;
		Set<Character> key=map.keySet();
		for(char c:key){
			if(map.get(c)>feq)
				feq=map.get(c);
		}
		System.out.println(map);

		StringBuffer b=new StringBuffer();
		while(feq>0) {
			for(char c: key){
				if(map.get(c)==feq)
					for(int i=0;i<feq;i++)
						 b.append(c);
			}
			feq--;
		}
		return b.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(frequencySort("abbbaacacf"));
	}

}
