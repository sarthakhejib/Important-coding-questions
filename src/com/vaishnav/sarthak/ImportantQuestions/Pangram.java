package com.vaishnav.sarthak.ImportantQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class Pangram {

	public static void isPangram(String str) {
		str=str.toLowerCase();
		char ch[] =str.toCharArray();
		ArrayList<Character> list =new ArrayList<>();
		boolean isVisited[] =new boolean[26];
		Arrays.fill(isVisited, false);
		char[] alphabet = new char[26]; 

		for(char c = 'a'; c <= 'z'; ++c){
			alphabet[c-'a']=c;	
		} 

		for(int i=0;i<ch.length;i++) {
			list.add(ch[i]);
		}

		for(int i=0;i<list.size();i++) {
			for(int j=0;j<alphabet.length;j++) {
				if(list.get(i).equals(alphabet[j]) && !isVisited[j]) {
					isVisited[j]=true;
				}
				else 
					continue;				
			}
		}

		int count=0;
		for(int i=0;i<isVisited.length;i++) {
			if(!isVisited[i]) {				
				System.out.println("Not Pangram ");
				break;
			}
			else 
				count++;			
		}
		if(count==alphabet.length)
			System.out.println("Pangram");
	}

	public static void main(String[] args) {
		String str= "The quick  fox jumps over the lazy dog";
		isPangram(str);
	}

}
