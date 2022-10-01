package com.vaishnav.sarthak.ImportantQuestions;

public class LengthOfLastWordLeetCode {
	public static int lengthOfLastWord(String s) {
		if(s.length()==1)
			return 1;

		if(!s.contains(" "))
			return s.length();
        
        if(s.length()==2 && s.charAt(s.length()-1)==' ')
            return 1;
				
		StringBuilder sb=new StringBuilder(s);
		
		int j=sb.length()-1;
		while(sb.charAt(j)==' ') {
			
				sb.deleteCharAt(j);
				j--;
		}
		int index=0;
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)==' '){
				index=i;
			}
		}

		return (sb.length()-1)-(index);
	}


	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
	}

}
