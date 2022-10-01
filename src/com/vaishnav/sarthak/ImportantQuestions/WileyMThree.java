package com.vaishnav.sarthak.ImportantQuestions;
import java.util.Scanner;

abstract class ThemePark{
	public abstract void playGame();
}



class Queensland extends ThemePark{
	int entryFeeForAdult=500;
	int entryFeeForChildren=300;

	public void playGame() {
		boolean Games[]=new boolean[30];
	}

}

class Wonderla extends ThemePark{
	int entryFeeForAdult=500;
	int entryFeeForChildren=300;

	public void playGame() {
		int Games[]=new int[40];
	}

}

public class WileyMThree {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		int code=sc.nextInt();
		int arr[]=new int[8];
		for(int i=0;i<8;i++) {
			arr[i]=sc.nextInt();
		}
		int flag=-1;
		if(code==1) {
			System.out.println("Welcome to Queenland!");
			for(int i=0;i<8;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						flag=0;
					}
				}
				if(flag==-1)
					System.out.println("Playing Game "+arr[i]+" at Queensland");

				else 
					System.out.println("You have already played game "+arr[i]);
			}

		}
		else {
			System.out.println("Welcome to Wonderla!");
			for(int i=0;i<8;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						flag=0;
					}
				}
				if(flag==-1)
					System.out.println("Playing Game "+arr[i]+" at Wonderla");

				else 
					System.out.println("Playing Game "+arr[i]+" again at Wonderla");
			}
		}

	}
}







































