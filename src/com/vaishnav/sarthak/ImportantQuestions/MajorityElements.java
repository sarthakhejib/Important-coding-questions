package com.vaishnav.sarthak.ImportantQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MajorityElements {

	 public static int majorityElement(int[] nums) {
       int n=nums.length/2;
     // double m=Math.round(n);
      
      
      
      
      
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int a: nums){
          if(map.containsKey(a)){
              map.put(a,map.get(a)+1);
          }
          else{
              map.put(a,1);
          }
      }
      int ans=0;
      Set<Integer> key=map.keySet();
		for(int c: key) {
          if(map.get(c)>n){
              ans=c;
          }
      }
      return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] c= {3,2,3};
		System.out.println(majorityElement(c));

	}

}
