package com.vaishnav.sarthak.ImportantQuestions;
import java.util.Scanner;
public class MockVitaQuetions {

	public int collisions() {
		int numOfCollisions=0;
		Scanner sc=new Scanner(System.in);
		int totalCars=sc.nextInt();
		
		return numOfCollisions;
	}
	
	
	
//	Home=<
//	End=>
//	BackSpace=*
//	NumLock=#
	
	public static String receviedText(String S) {
		
		String str="";						
		char ch[]=S.toCharArray();
		char c[]=new char[ch.length];
		if(ch[0]=='>'||ch[0]=='<'||ch[0]=='*'||ch[0]=='#') 
			return S;
		
		
		for(int i=1;i<ch.length;i++) {
	//		if(ch[i]=='>')                                     		
		}
		return str;
	}
	
	public static int calc() {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int total=0;
		
		total=num+(num*num)+(num*num*num);
		
		return total;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.println(calc());;
	}

}
