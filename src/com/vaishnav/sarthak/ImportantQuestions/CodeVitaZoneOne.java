package com.vaishnav.sarthak.ImportantQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CodeVitaZoneOne {

	public static int minimumSum(int n, int k, int array[]) {
		int j=n-1,i=j-1,sum=0;
		Arrays.sort(array);
		while(k!=0 && i>0) {			
			if(array[j]>array[i]) {
				array[j]=Math.floorDiv(array[j], 2);
				k--;
			}
			else {
				array[i]=Math.floorDiv(array[i], 2);
				j--;
				i--;
				k--;
			}		
		}

		for(int element=0;element<n;element++) {
			sum=sum+array[element];
		}

		return sum;
	}

	public static int minimumGifts(int arr[]) {

		int minimum=0,temp=0;
		int ar[]=new int[arr.length];

		for(int i=0;i<arr.length;i++) {
			ar[i]=1;
		}		

		if(arr.length==0||arr.length==1)
			return arr.length;

		for(int i=0;i<arr.length;i++) {	

			if(i==0) {
				temp=arr[0];
				if(arr[i]>arr[i+1]) 
					ar[i]+=1;
				else 
					ar[i+1]+=1;
			}

			if(i>0 && i<arr.length-1) {
				temp=arr[i-1];
				if(arr[i]>temp && arr[i]>arr[i+1]) 
					ar[i]+=1;

				else if(arr[i]<temp && arr[i]>arr[i+1]) 
					ar[i-1]+=1;

				else if(arr[i]>temp && arr[i]<arr[i+1])
					ar[i+1]+=1;

				else if(arr[i]<temp && arr[i]<arr[i+1]) {
					if(temp>arr[i+1]) 
						ar[i-1]+=1;					 
					else 
						ar[i+1]+=1;					 	 
				}					
			}

			if(i==arr.length-1) {
				temp=arr[i-1];
				if(arr[i]>temp)
					ar[i]+=1;
				else
					ar[i-1]+=1;
			}
		}			
		for(int j=0;j<ar.length;j++) {
			minimum=minimum+ar[j];
		}
		return minimum;		
	}

	public static int countPairs(int n,int k, int array[]) {
		int count=0,flag=0;
		Arrays.sort(array);
		for(int i=0;i<array.length;i++) {	
			for(int j=i+1;j<array.length;j++) {
				if((array[j]>=array[i]-k) && (array[j]<=array[i]+k)) {					
					if (flag==0 ) {
						count++;
						flag++;
					}
				}							
			}
			flag =0;				
		}		
		return count;
	}

	public static int primeTimeAgain(int d, int p) {
		int num=0;
		int hours[]=new int [d];
		int j=d/p;
		if(d/p==0 ) {
			for(int i=1;i<d;i++) {
				hours[i]=i;
			}
			boolean flag = false;
			// for(int i = 1; i <= num/2; ++i)
				int i=0;
				while(i<d/p && j<d) {
					// condition for nonprime number
					if(hours[i]% i == 0 || hours[j]%i==0)
					{
						flag = true;
						break;
					}
				}

				if (!flag)
					System.out.println(num + " is a prime number.");
				else
					System.out.println(num + " is not a prime number.");
		}
		return num;
	}

	public static void codekart() {
		ArrayList<String> in = new ArrayList<String>();
		Scanner s = new Scanner(System.in);

		while (s.hasNextLine()) {
			String line = s.nextLine();
			in.add(line);

			if (line != null && line.equalsIgnoreCase("END")) {
				//   System.out.println("Output list : " + in);
				break;
			}	  
		}

		for(int i=0;i<in.size()-1;i++) {
			if(in.get(i).contains("SM")) {
				if(in.get(i).equals("CMD SM ADD ")) {
				}

				if(in.get(i).equals("CMD SM REMOVE")) {
				}
				
				if(in.get(i).equals("CMD SM  GET_QTY")){	    			   
	    		 }
				
				if(in.get(i).equals("CMD SM ADD ")) {	    			   
	    		 }
				
				if(in.get(i).equals("CMD SM ADD ")) {	    			   
	    		}

			}

		}
	}
	
	public static int pasteReduction() {
		
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		
		String faultyCharacters=sc.next();
		char ch1[]=faultyCharacters.toCharArray();
		
		StringBuffer sb=new StringBuffer();
		
		boolean flag =true;
		int count=0;
		char copiedCharacter='\0';
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch1.length;j++) {
				if(ch[i]==ch1[j] && ch[i]!=copiedCharacter) {
					copiedCharacter=ch1[j];
					count++;
					flag= false;
				}		
			}
			
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int array[]= {20,7,5,4};
		//int arr[]= {1,2,1,5,2};
		//int arr[]= {1,2};
		//int arr[]= {5,4,3,7,8,7};
		int array[]= {5,5,7,9,15,2};
		//System.out.println(minimumGifts(arr));
		//System.out.println(minimumSum(4, 3, array));
		//System.out.println(countPairs(6,3,array));
		codekart();

	}

}
