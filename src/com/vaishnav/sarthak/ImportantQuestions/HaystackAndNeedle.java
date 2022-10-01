package com.vaishnav.sarthak.ImportantQuestions;

public class HaystackAndNeedle {
	public static int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
      
        if(needle.length()==1 && haystack.length()==1) {
        	if(haystack.indexOf(needle)>-1)
        		return haystack.indexOf(needle);
        	else 
        		return -1;
        }
        //TC: O(n) SC: O(1)
  
              int n=haystack.indexOf(needle);
              if(n>-1)
            	  return n;
              else 
            	  return -1;
                
        
        
    }
	public static void main(String[] args) {
		String haystack="a";
		String needle="a";
System.out.println(strStr( haystack,  needle));

	}

}
