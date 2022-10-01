package com.vaishnav.sarthak.ImportantQuestions;

import java.util.Stack;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String str[]) {
		String prefix=str[0];

		for(int i=1;i<str.length;i++) {
			while(str[i].indexOf(prefix)!=0)
				prefix=prefix.substring(0, prefix.length()-1);		
		}

		return prefix;
	}

	public static boolean isValid(String s) {
		//{,[,(,   ),],} // stack here //true
		//push: {,[,( LIFO
		//peek: 		//O(n) //O(n)
		//pop: 


		Stack<Character> stack=new Stack<>();

		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)=='[') ||(s.charAt(i)=='{') ||(s.charAt(i)=='(') ) {
				stack.push(s.charAt(i));
			}
			if(stack.isEmpty())
				return false;
						
				if((s.charAt(i)==']')) {
					if(stack.peek()=='[' )
						stack.pop();
					else 
						return false;
				}
				if((s.charAt(i)==')')) {
					if(stack.peek()=='(' )
						stack.pop();
					else 
						return false;
				}
				if((s.charAt(i)=='}')) {
					if(stack.peek()=='{')
						stack.pop();
					else 
						return false;
				}
		}
		return stack.isEmpty()? true:false;
	}
	//        for(int i=0;i<s.length();i++){
	//            if(s.charAt(i)=='('){
	//                if(s.charAt(i+1)==')' && i+1<s.length())
	//                    return true;
	//                else
	//                    return false;
	//            }              
	//            if(s.charAt(i)=='['){
	//                if(s.charAt(i+1)==']' && i+1<s.length()-1)
	//                    return true;
	//                else
	//                    return false;
	//            }                 
	//             if(s.charAt(i)=='{'){
	//                 if(s.charAt(i+1)=='}' && i+1<s.length()-1)
	//                    return true;
	//                else
	//                    return false;
	//             }
	//        }
	//        return false;
	//    }
	public static void main(String[] args) {
		String[] str= {"flower","flow","flight"};
		//System.out.println(longestCommonPrefix(str));;
		System.out.println(isValid("(])"));
	}

}
