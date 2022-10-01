package com.vaishnav.sarthak.ImportantQuestions;

import java.util.ArrayList;
import java.util.List;

public class DataSearchAndDesignDSLeetCode {

	public void add(String word) {
		List<String> list=new ArrayList<>();
		list.add(word);
	}
	
	public boolean search(String word) {
		
		
		return false;
	}
	 public static int finalValueAfterOperations(String[] operations) {
	        int total=0;
	        for(int i=0;i<operations.length;i++){
	            if(operations[i].equalsIgnoreCase("--X")){
	                total-=1;
	            }
	            else if(operations[i].equalsIgnoreCase("X++")){
	                total+=1;
	            }
	             else if(operations[i].equalsIgnoreCase("++X")){
	                 total+=1;
	             }
	            else if(operations[i].equalsIgnoreCase("--X")){
	                total-=1;
	            }
	        }
	        return total;
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] operations= {"X++","++X","--X","X--"};
		System.out.println(finalValueAfterOperations(operations));

	}

}
