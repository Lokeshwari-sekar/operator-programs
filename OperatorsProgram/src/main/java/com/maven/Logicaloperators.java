package com.maven;

public class Logicaloperators {

	public static void main(String[] args) {
		int a=10,b=10,c=50;
		if((a>b)&&(b>c))
		{
			System.out.println("both the conditions are true");	//(&&) operator if anyone of the condition is false it gives false value
		}
		else if((a>b)||(b>c))
		{
			System.out.println("any one of the condition is true");//(||) operator if anyone of the condition is false it give true value
		}
		else if(!(b>c)) 
		{
			System.out.println("true");//(!)if gives opposite value of the real output
		}
		else
		{
			System.out.println("false");
		}


	}

}
