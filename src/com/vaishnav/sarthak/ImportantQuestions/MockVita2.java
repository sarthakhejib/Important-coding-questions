package com.vaishnav.sarthak.ImportantQuestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class MockVita2 {  

	public static int swayamvar() {

		Scanner sc=new Scanner(System.in);
		int unmatchedPairs=0;

		int N=sc.nextInt();		
		String brides=sc.next();
		String grooms =sc.next();

		if(brides.length()==N && grooms.length()==N) {

			char brideArray[]=brides.toCharArray();
			char groomArray[]=grooms.toCharArray();

			Queue<Character> queueBride=new LinkedList<>();
			Queue<Character> queueGroom=new LinkedList<>();

			for(int i=0;i<N;i++) {
				queueBride.add(brideArray[i]);
				queueGroom.add(groomArray[i]);			
			}

			while(queueBride.contains(queueGroom)){
				if(queueBride.element()!=queueGroom.element()) {
					queueGroom.remove();
					queueGroom.add(groomArray[0]);
				}

				if(queueBride.element()==queueGroom.element()) {
					queueBride.remove();
					queueGroom.remove();								
				}

			}


		}

		return unmatchedPairs;
	}
	
	
	public static String get(String characters, String str[]) {
		char c[]=characters.toCharArray();
		int count=0;
		char c1[]=str[0].toCharArray();
		for(int k=0;k<str.length;k++)
			for (int i = 0; i < str[k].length(); i++) 
				for (int j = i + 1; j < str[k].length(); j++) 
					if (str[k].charAt(i) == str[k].charAt(j)) {} 
						count ++; 
		
		
		for (int i = 0; i < str[0].length(); i++) 
            for (int j = i + 1; j < str[0].length(); j++) 
                if (str[0].charAt(i) == str[0].charAt(j)) 
                    count ++; 
		
		for(int i=0;i<str.length;i++) {
		}
	
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<c.length;j++) {
				if(str[j]=="A"||str[j]=="B" ||str[j]=="C"||str[j]=="D" ) {
					
					
				}
			}
		}
				
		
		return str[0];
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str[]= {"AABCDA","ABCDZADC","ABCDBCA","ABCDABDCA"};
		String characters="ABCD";

	}

}
