package com.vaishnav.sarthak.ImportantQuestions;

import java.util.ArrayList;

public class ElementAtXPosition {

	public static void main(String[] args) {
		int oddElements[]= {0,1,3,5,7,9};
		int evenElements[]= {0,2,4,6,8,10};
		int mixSeries[]=new int[oddElements.length+evenElements.length];
		int X=8;
		ArrayList<Integer> list=new ArrayList<>();
		list.add(0, 0);
		list.add(0,1);

		mixSeries[0]=0;
		mixSeries[1]=0;
		int even=1;
		int odd=1;
		for(int i=2;i<mixSeries.length;i++ ) {
			if(i%2==0) {
				mixSeries[i]=evenElements[even];
				even++;
			}
			else {
				mixSeries[i]=oddElements[odd];
				odd++;
			}
		}
		System.out.println(mixSeries[X]);
		}

	}


