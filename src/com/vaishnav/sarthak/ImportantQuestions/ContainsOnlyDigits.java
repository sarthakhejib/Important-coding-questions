package com.vaishnav.sarthak.ImportantQuestions;

public class ContainsOnlyDigits {

	public static boolean containsDigits(String str) throws NumberFormatException{
		if(str.length()==0||str.contains(" "))
			return false;
						
		try {
			Integer s=Integer.parseInt(str);
			System.out.println(s);
			return true;
		}
		catch(NumberFormatException e){
			System.out.println("Please enter valid decimal String :)");
			return false;		
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="s;ldkf";
		System.out.println(containsDigits(str));
		
	}

}
