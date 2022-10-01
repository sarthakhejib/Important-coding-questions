package com.vaishnav.sarthak.ImportantQuestions;
import java.util.HashMap;
import java.util.Set;
public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Character,Integer> map=new  HashMap<>();
		String str="Hello Everyone!";		
		char ch[]=str.toCharArray();
		
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}
			else {
				map.put(c, 1);				
			}						
		}
		Set<Character> key=map.keySet();
		for(char c:key) {
			if(map.get(c)>1) {
				System.out.println(c+" is "+map.get(c)+" times");
			}
		}
	}
}
