//  Write a Java program to find the sum of all natural numbers between 1 to n.

import java.util.*;


 class test6{
public static void main(String[] args) {
	
	int start = 1;
	int sum = 0;
	int n;
	System.out.println("Enter the Number");
	Scanner scanner = new Scanner(System.in);
	n = scanner.nextInt();


	while(start <= n ){

		sum =  sum + start ;
		start++;
		}
		System.out.println(sum);

}
}