package com.vaishnav.sarthak.ImportantQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Snippet {
	public static int firstUniqChar(String s) {        
	      HashMap<Character,Integer> map=new HashMap<>();
	        char ch[]=s.toCharArray();
	        ArrayList<Integer> list=new ArrayList<>();
	      for(char a:ch ){
	          if(map.containsKey(a)){
	              map.put(a,map.get(a)+1);
	          }
	          else{
	              map.put(a,1);
	          }
	      }
	        Set<Character> key=map.keySet();  
	        for(char c:key){
	            list.add(map.get(c));
	        }
	        
	        for(int i=0;i<list.size();i++){
	            if(list.get(i)==1){
	                return i;
	            }
	        }
	        return -1;
	    }
	
	public static void main (String[] ar) {
		System.out.println(firstUniqChar( "loveleetcode"));
	}
	
}

