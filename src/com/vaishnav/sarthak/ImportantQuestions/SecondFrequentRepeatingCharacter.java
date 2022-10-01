package com.vaishnav.sarthak.ImportantQuestions;

import java.util.HashMap;
import java.util.Set;

public class SecondFrequentRepeatingCharacter {

	public static void main(String[] args) {	
		String str="abababsbabsbabsbab";
		char ch[] =str.toCharArray();
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<ch.length;i++) {
			map.put(ch[i], 1);
		}
		for(char c: map.keySet()) {
			if(map.containsKey(c)) 
				map.put(c,map.get(c)+1);			
			else
				map.put(c, 1);
		}
		
		Set<Character> key=map.keySet();
		for(char c: key) {
			if(map.get(c)>1)
				System.out.println("These are the duplicate character "+c);
		}
	}
}
