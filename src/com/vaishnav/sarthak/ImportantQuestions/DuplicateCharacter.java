package com.vaishnav.sarthak.ImportantQuestions;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="asasdfdadsfsfd";		
		char ch[]=str.toCharArray();
		
		HashMap<Character,Integer>map=new HashMap<>();
	
		for(char c:ch) {
			if(map.containsKey(c)) 
				map.put( c,map.get(c)+1);
			
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
