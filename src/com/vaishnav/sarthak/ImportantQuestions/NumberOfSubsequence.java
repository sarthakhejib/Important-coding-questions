package com.vaishnav.sarthak.ImportantQuestions;

public class NumberOfSubsequence {
	public static int numMatchingSubseq(String s, String[] words)    {
		int total=0,count=0;
		int j=0,k=0;


		for(int i=0;i<s.length();i++){
			j=0;
			while(j<words.length){
				k=0;
				while(k<words[j].length()) {
					if(s.charAt(i)==words[j].charAt(k)){
						count++;
						j++;
						k++;
						//break;
					}
					else{
						j++;
						k++;
					}
				}
				if(count==words[j].length())
					total++;
			}

		}
		return total;

	}
	public static void main(String[] args) {
		String s = "abcde";
		String words[] = {"a","bb","acd","ace"};
		System.out.println(numMatchingSubseq(s,words));
	}

}
