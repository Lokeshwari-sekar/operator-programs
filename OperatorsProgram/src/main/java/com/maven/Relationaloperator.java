package com.maven;

public class Relationaloperator {

	public static void main(String[] args) {
		int a=15,b=20,c=25;
		if(a>b) //greater than operator
		{
			System.out.println("a is grater than b");
		}
		else if(a>=b)// greater than or equal to operator
		{
			System.out.println("a is grater than or equal to b");
		}
		else if(c<a) //less than operator
		{
			System.out.println("a is less than c");
			
		}
		else if(c<=a)// less than or equal to operator 
		{
			System.out.println("a is less than or equal to c");
			
		}
		else if(a==b)// equal to opperator
		{ 
			System.out.println("a is equal to b");	
		}
		else if(a!=b)// not equal to operator
		{
			System.out.println("a is not equal to b");	
		}
		else
		{
			System.out.println("not defined");
		}

	}

}
