package com.vaishnav.sarthak.ImportantQuestions;

public class ValidPalindrome {
	public static boolean isPalindrome(String s) {
		if(s.length()==1)
			return true;
		
		if(s.equals(" "))
			return true;
		
		StringBuilder sb=new StringBuilder();
	
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(!Character.isLetterOrDigit(i) )
				sb.append(ch[i]);
		}
		for(int i=0;i<sb.length();i++) {
			if(Character.isLowerCase(sb.charAt(i)))
				continue;
			else
				sb.deleteCharAt(i);
		}
		
		int i=0, j=sb.length()-1;
		
		while(i<j) {
			if(sb.charAt(i)!=sb.charAt(j))
				return false;
			else {
				i++;
				j--;
			}
				
		}
			return true;
		
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("race a car"));
	}
	
}
