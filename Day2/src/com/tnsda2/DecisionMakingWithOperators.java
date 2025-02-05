package com.tnsda2;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class DecisionMakingWithOperators {

	public static void main (String args[]) {
		int x=8,y=7;
		int a=10;
		int b=11;
		
		if(x>=y) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		if(!(a<b)|| (a==b)) {
			System.out.println("Condition i strue");
			
		}
		else {
			System.out.println("Condition is false");
		}
				
	}
}
