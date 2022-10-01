package com.vaishnav.sarthak.AmazonCodingQuestions;

public class FindTheMissingNumber {
	//static int count=0;

	public static int mini_cost(int N,String S) {
		char c[]=S.toCharArray();
		/*
		 * for(int i=0;i<N;i++) { c[i]=c[N-i+1]; }
		 */
		for(int i=1;i<N;i++) {
			int x= Math.abs(i-N);
			if(x<=1) {
				F(i,N-1,S);
				break;
				//count++;
			}	
			
		}	
		return -1;
		
	}
	
	public static int F(int i,int j,String S) {
		int count=1;
		char ch[]=S.toCharArray();
		char temp='\0';
		temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		
		String str= new String(ch);
		StringBuilder sb=new StringBuilder(str);
		
		int l=sb.capacity();
		int flag=0,mid=0;
		
		if(l/2==0)
			mid=l/2;
		else
			mid=(l/2)+1;
		
		int s1=0,s2=mid;
		
		while(s1<mid && s2<1) {
			if(sb.charAt(s1)==sb.charAt(s2)) {
				s1=s1+1;
				s2=s2+1;
							
			}
			else {
				flag=1;
				break;
			}
				
		}
		if(flag==0)
			return count;
		else	
		
		return -1;
	}
	
	public static void main(String[] args) {
			System.out.println(mini_cost(3,"aab"));;
		
		
	}
}
