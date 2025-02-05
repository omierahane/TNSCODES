package com.tnsda2;

public class OperastorDemo {
public static void main(String args[]) {
	int a=10;
	int b=20;
	int x=10;
	
	System.out.println("a and b values befor the "+"operstor:"+a+" "+b);
	
//	?? icrement and decrement
	++a;
	//     12  20   12
	int c=++a + b + a--;
	System.out.println("value of c:"+c);
//	      44  11   20
	int d=c++ + a + b--;
	System.out.println("Value of d"+d);

}
}
