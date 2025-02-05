package com.tnsda2;

import java.util.*;

public class ButterflyPattern {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		
		
		for(int i=1;i<=n;i++) {
			
			int space = 2*(n-i);
			

			for (int j=1;j<=i;j++) {
				if(j==1 ||i+j==2*i) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for (int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++) {
				if(j==1 ||i+j==2*i) {
					System.out.print("*");
					}
					else {
						System.out.print(" ");
					}			}
			
			System.out.println();
		}


for(int i=n;i>=1;i--) {
			
	int space = 2*(n-i);
	

	for (int j=1;j<=i;j++) {
		if(j==1 ||i+j==2*i) {
		System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
	}
	for (int j=1;j<=space;j++) {
		System.out.print(" ");
	}
	for (int j=1;j<=i;j++) {
		if(j==1 ||i+j==2*i) {
			System.out.print("*");
			}
			else {
				System.out.print(" ");
			}			}
	
	System.out.println();
}
	}

}
