public class Variables {
	
	
	public static void main(String[] args) {
		System.out.println("Hello fuckers!");
		
		int i = 1;
		System.out.println(i);
		int j;
		j = 2;
		System.out.println(j);
		long myVariable = 17L;
		long anotherVariableWhichIsLong = 3000000;
		double myDouble = 17.3;
		float myFloat= 17.3F;
		
		
		
		int first = 50;
		int second = 100;
		int third = first;
		first = 65; //new variable will replace old one
		
		
		
		System.out.println(first + 100);
		System.out.println(third + 100); //hang on its when we decalre what wwas intialized in the beginning it becomes preaplced and what we call in java
		
		
		int myAge = 21;
		
		myAge++;//incredment
		System.out.println(myAge); //get 22
		System.out.println(myAge++); //22---
		System.out.println(myAge); //now this will be 23
		
		
		
		myAge += 5;
		myAge -= 1;
		System.out.println(myAge);//add 5 to 23 and decrement by 1
		
		
		
		int modulus = 27 % 5;
		System.out.println(modulus);
	
	
	///Boolean
		
		boolean iAmYoungerThan13 = false;
		
		char myFirstNameStartsWith = 'G'; //character is a part of a string 
		
		
		int[] myArray = {1,2,35,5};
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		System.out.println(myArray[2]);
		System.out.println(myArray[3]);
		
		///redclaring in java
		System.out.println(myArray[2]); //print 35
		myArray[2] = 17;//instead of 35 we will get 17 with system.out.print
		System.out.println(myArray[2]);
		
	}
}
	
