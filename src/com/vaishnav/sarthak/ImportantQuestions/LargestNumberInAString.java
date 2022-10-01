package com.vaishnav.sarthak.ImportantQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumberInAString {

	public static void main(String[] args) {
		String str="This is alpha 5057 and 97";
		char c[]=str.toCharArray();
//		for(int i=0;i<c.length;i++) {
//			if(c.equals(c))
//		}
		List<String> list=new ArrayList<>(); 
		boolean flag=false;
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<c.length;i++) {
			if(c[i]=='1'||c[i]=='2'||c[i]=='3'||c[i]=='4'||c[i]=='5'||
					c[i]=='6'||c[i]=='7'||c[i]=='8'||c[i]=='0') {
				sb.append(c[i]);
				flag=true;
				
			}
			else {
				if(flag) {
					list.add(sb.toString());
					flag=false;
					
				}
				
			}		
		}	
		Collections.sort(list);

		System.out.println(list.get(list.size()-1));
	}

}
