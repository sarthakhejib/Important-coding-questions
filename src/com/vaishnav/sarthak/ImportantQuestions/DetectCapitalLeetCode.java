package com.vaishnav.sarthak.ImportantQuestions;

public class DetectCapitalLeetCode {
	
	
	public static void main(String[] args) {
		String word="FiOOOOii";
		System.out.println(isCapital(word));
		
	}

	private static boolean isCapital(String word) {
		char[] c=word.toCharArray();
		if(word.length()==1 && Character.isUpperCase(c[0]))	
			return true;
		int count=0, count1=0;
		
		for(int i=0;i<c.length;i++) {
			if(Character.isUpperCase(c[i]) ) {
				count++;
				if(count==c.length)
					return true;		
			}	
			if(Character.isUpperCase(c[0])) {
				if(Character.isLowerCase(c[i] )) {
					count1++;
					if(count1==c.length-1)
						return true;
				}
			}
		}
		return false;
	}
	

}
