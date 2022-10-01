package com.vaishnav.sarthak.tree;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {

	
	 static int minimumLoss(long[] price) {
	        long element=price[price.length-1];
	        long prices[]=new long[price.length-1];
	        System.arraycopy(price, 0, prices, 0, price.length - 1);
	        Arrays.sort(prices);
	        long total=0;
	        int minimum=0;
	        for(int i=0;i<prices.length;i++) {	    		
	        	if(prices[i]>element) {
	        		total=prices[i]-element;

	        		minimum=(int)total;
	        		break;
	        	}
	    	}
	        return minimum;
	    }

	 
	 public static int numOfContainers(int weightc[]) {
		 int count=1,j=0,i=0;
		 Arrays.sort(weightc);
		 ArrayList<Integer> list=new ArrayList<>();
//		 for(int i=0;i<weight.length;i++) 
		 while(i!=weightc.length-1){
			 while(weightc[j]<=(weightc[i]+4) && j!=weightc.length-1) {
				 
				 if(count==1) {
					 list.add(count);
					 count++;					 
				 }
				 if(j!=weightc.length-1)
					 j++;
			 }	
			 i=j;
			 count=1;
		 }
		 int totalCost=0;		  
		  for(int a=0;a<list.size();a++) {
			  totalCost+=list.get(a);
		  }
		
		  return totalCost;		 
	 }

	 static int maxMin(int k, int[] arr1) {
	        ArrayList<Integer> list=new ArrayList<>();
	        int sum=0;
	        Arrays.sort(arr1);
	        for(int i=0;i<k;i++){
	            list.add(arr1[i]);
	        }
	        sum=list.get(k-1)-list.get(0);
	        
	        return sum;
	    }

	 
		public static void main(String[] args) {
			long price[]= {20, 7 ,8 ,2 ,5};
			//long price[]= {5,10,3};
			//System.out.println(minimumLoss(price));
			//int weight[]={1,2,3,21,7,7,12,14,21};
			int weightc[]= {12 ,15 ,7 ,8 ,19 ,24};
				//numOfContainers(weightc);
			int arr[]= {4,1,2,3,4,10,20,30,40,100,200};
			int arr1[]= {4504
			,1520,
			5857,
			4094,
			4157
			,3902,
			822,
			6643
			,2422,
			7288,
			8245,
			9948,
			2822
			,1784,
			7802,
			3142,
			9739,
			5629,5413,7232};
			System.out.println(maxMin(5,arr1));;
			
				}
			}
			
	
	

