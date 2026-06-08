// Write a Java program to print a multiplication table of any number.

import java.util.*;

	class test8{
public static void main(String[] args) {
	
	int start =1;
	int n;

	System.out.println("Enter the Table Number");
	Scanner scanner = new Scanner(System.in);
	n = scanner.nextInt();

	for (int i=1 ;i <= 10 ; i++ ) {
		// System.out.println(n +" X "+ i +" = "+ n*i);
		System.out.printf("%4d * %3d = %4d \n",n,i,(n*i));

			
		}	
}}