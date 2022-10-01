package com.vaishnav.sarthak.ImportantQuestions;


//int start[]= {1,3,0,5,8,5};
//int finish[]={2,4,6,7,9,9};

import java.util.ArrayList;
import java.util.Arrays;

public class GreedyAlgo {
		
	public static void activitySelection(int start[],int finish[]) {
		int i,j;
		System.out.println("Activites:"); 
		i=0;
		System.out.println(i+" ");		
		for(j=1;j<start.length;j++) {
			if(finish[i]<=start[j]) {
				System.out.println(i+"");
				i=j;					
			}
		}			
	}
	
	public static void activitySelectionUnsorted() {}
	
	public static int minimumIndianCurrencies(int currencies[],int value) {
		int count=0,j=currencies.length-1;
		while(j>0 && value!=0) {
			if(value>=currencies[j]) {
				//value/=currencies[j];
				value-=currencies[j];
				count++;				
			}
			else {
				j--;				
			}
		}
		return count;
	}
	
	public static int minimumPlateforms(int arr[],int dep[]) {
		Arrays.sort(dep);
		int count=1,i,j;
		i=0;
		for(j=1;i<arr.length;i++) {
			if(dep[i]<=arr[j]) {
				count++;
				i=j;				
				//i++;
				//j++;
			}			
		}
		return count;
	}
	
	
		//for(int i=0;i+1<=ropes.length;i++) {
		//	totalCost+=ropes[i]+ropes[i+1];
		//}
//		ArrayList<Integer> list=new ArrayList<>();
//		list.add(4);
//		list.add(3);
//		list.add(2);
//		list.add(6);
//		//list.add(6);
//		Collections.sort(list);
//		for(int i=0;i<list.size();i++) {
//		
//			
//		}
	//		
	//		
	public static int connectRopes(int ropes[]) {
		Arrays.sort(ropes);
		int sum=0;
		ArrayList<Integer> list=new ArrayList<>();
		int i=0,j=1;	
		while(j<ropes.length) {
			if(i==0) {
				sum=ropes[i]+ropes[j];
				i++;
				j++;
				list.add(sum);
			}
			else {
				sum+=ropes[j];
				list.add(sum);
				j++;
			}
		}		
		  int totalCost=0;		  
		  for(int a=0;a<list.size();a++) {
			  totalCost+=list.get(a);
		  }		 
		return totalCost;
	}
	
	public static void maxEqualSum(int stack1[],int stack2[],int stack3[]) {
		int sum1=0,sum2=0,sum3=0;
		int	top1=0,top2=0,top3=0;
		for(int i=0;i<stack1.length;i++) {
			sum1+=stack1[i];			
		}
		for(int i=0;i<stack2.length;i++) {
			sum2+=stack2[i];			
		}
		for(int i=0;i<stack3.length;i++) {
			sum3+=stack3[i];			
		}

		for(int i=0;i<stack3.length;i++) {
			if(sum1==sum2 && sum2==sum3) {
				System.out.println(sum1);  
			}
			else if(sum1>=sum2 && sum1>=sum3){
				sum1-=stack1[top1++];			
			}
			else if(sum2>=sum1 && sum2>=sum3) {
				sum2-=stack2[top2++];
			}
			else if(sum3>=sum1 && sum3>=sum2){
				sum3-=stack3[top3++];
			}		
		}
		
		}
			
	

	
	
	public static void main(String[] args) {
		 int start[]= {1,3,0,5,8,5};
		int finish[]= {2,4,6,7,9,9};
	   //activitySelection(start,finish);
		int currencies[]= {1,2,5,10,20,50,100,500,1000};
		int value=52;
		//System.out.println(minimumIndianCurrencies(currencies,value));
		int arr[]= {900,940,950,1100,1500,1800};
		int dep[]= {910,1200,1120,1130,1900,2000};
		//System.out.println(minimumPlateforms(arr,dep));
		int ropes[]= {4,2,3,6};
		//System.out.println(connectRopes(ropes));
		int stack1[]= {3,2,1,1,1};//8
		int stack2[]= {4,3,2};//9
		int stack3[]= {2,5,4,1};//12
		maxEqualSum(stack1,stack2,stack3);
			
	}
		
		
		
		
		

}
