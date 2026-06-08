//     Write a Java program to find the sum of all even numbers between 1 to n.

import java.util.*;

	class test7{
public static void main(String[] args) {
	
	int start = 1;
	int n;
	int sum =0;
	System.out.println("Enter the Number");
	Scanner scanner = new Scanner(System.in);
	n = scanner.nextInt();

	while(start <= n){
		if (start%2 == 0) {
			sum = sum + start;
			}
			start++;
		}
	System.out.println(sum);

}}